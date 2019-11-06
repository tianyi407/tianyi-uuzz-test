// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.common.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.common.config.SystemConfig;
import test.common.constant.BetWayJczqEnum;
import test.common.constant.ChoseJczqSelTypeEnum;
import test.common.db.model.ManagerJcOddsModel;
import test.common.db.model.ManagerJcPoolModel;
import test.common.util.SpringUtil;
import test.dao.impl.ManagerJcOddsDao;
import test.dao.impl.ManagerJcPoolDao;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.constant.game.BetSelEnum;
import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;
import com.uuzz.lottery.constant.game.SportTypeEnum;
import com.uuzz.lottery.infohub.constant.InfohubOddsTypeEnum;
import com.uuzz.lottery.manager.IceServiceProxy;
import com.uuzz.lottery.manager.entity.JcOdds;
import com.uuzz.lottery.manager.entity.JcOddsSellingResp;
import com.uuzz.lottery.manager.entity.JcPool;
import com.uuzz.lottery.manager.entity.JcPoolOdds;
import com.uuzz.lottery.manager.entity.JcPoolSellingResp;
import com.uuzz.lottery.manager.service.SentServiceToPassportPrx;
import com.uuzz.lottery.trade.entity.JzBetCodeReq;
import com.uuzz.utils.DateUtil;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: BetRuleJczqVo<br/>
 * 描 述: 竞彩足球投注信息VO<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class BetRuleJczqVo extends BetRuleVo {
    // 奖池MAP，key = matchID, value = MAP( key = gameCode, value = JcPool )
    private Map<Long, Map<String, JcPool>> jcPoolMap;

    // 赔率MAP，key = poolID, value = List of JcOdds
    private Map<Long, List<JcOdds>> jcOddsMap;

    // 投注内容List，一个奖池一个SingleBetDetail，List.size() = 投注奖池数量
    private List<JzBetCodeReq> betSelectList;

    // 期望选中的总奖池数
    private int wantPoolCount;

    // 期望选择奖池选项方式，单式或全包
    private ChoseJczqSelTypeEnum choseSelType;

    // 是否选择不可售的奖池
    private boolean isChoseUnsalePool = false;

    // 是否选择不支持单关/过关的奖池
    private boolean isChoseUnableAllup = false;

    // 是否选择不可售的选项
    private boolean isChoseUnsaleSel = false;

    // 在混合过关中，是否选择同一场赛事的不同奖池
    private boolean isChoseSameMatchDiffPool = false;

    /**
     * 描 述：自动构建投注奖池、投注选项，并set到BetRuleJczqVo中<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    public void autoChoseSel() {
	int chosePoolCount = 0;
	int wantPoolCount = this.getWantPoolCount();
	String gameCode = this.getGameCode();
	String gameCodeAnother = null;
	int index = 0;

	Map<Long, Map<String, JcPool>> poolMap = this.getJcPoolMap();

	for (Map<String, JcPool> matchPoolMap : poolMap.values()) {
	    if (this.isHHGG()) {
		if (index % 2 == 0) {
		    gameCode = GameEnum.JCZQ_SPF.getGameCode();
		    gameCodeAnother = GameEnum.JCZQ_RQSPF.getGameCode();
		} else {
		    gameCode = GameEnum.JCZQ_RQSPF.getGameCode();
		    gameCodeAnother = GameEnum.JCZQ_SPF.getGameCode();
		}
	    }

	    JcPool pool = matchPoolMap.get(gameCode);
	    boolean isSuccess = this.checkAndChoseForOnePool(pool);
	    if (isSuccess) {
		chosePoolCount++;
		index++;
	    }

	    if (isChoseSameMatchDiffPool
		    && !StringUtil.isBlank(gameCodeAnother)) {
		pool = matchPoolMap.get(gameCodeAnother);
		isSuccess = this.checkAndChoseForOnePool(pool);
		if (isSuccess) {
		    chosePoolCount++;
		}
	    }

	    if (chosePoolCount >= wantPoolCount) {
		break;
	    }
	}
    }

    /**
     * 描 述：判断指定奖池是否满足测试条件（可售、支持单关过关等），并针对该奖池自动构建投注选项<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param pool
     * @return
     */
    private boolean checkAndChoseForOnePool(JcPool pool) {

	if (pool == null) {
	    return false;
	}

	if (!this.isSelling(pool) && !this.isChoseUnsalePool) {
	    return false;
	}

	boolean isContainAllup = false;
	boolean isContainSingle = false;
	String[] betWays = this.getDetailType().split(StringUtil.COMMA);
	for (String betWay : betWays) {
	    if (betWay.equals(BetWayEnum.JCZQ_SPF_1x0.getCode())) {
		isContainSingle = true;
	    } else {
		isContainAllup = true;
	    }
	}

	if (isContainAllup && !this.isSupportAllup(pool)
		&& !this.isChoseUnableAllup) {
	    return false;
	}

	if (isContainSingle && !this.isSupportSinge(pool)
		&& !this.isChoseUnableAllup) {
	    return false;
	}

	boolean isSuccess = this.choseSelForOnePool(pool,
		this.getChoseSelType());

	return isSuccess;
    }

    public boolean isChoseSameMatchDiffPool() {
	return isChoseSameMatchDiffPool;
    }

    public void setChoseSameMatchDiffPool(boolean isChoseSameMatchDiffPool) {
	this.isChoseSameMatchDiffPool = isChoseSameMatchDiffPool;
    }

    public boolean isChoseUnsalePool() {
	return isChoseUnsalePool;
    }

    public void setChoseUnsalePool(boolean isChoseUnsalePool) {
	this.isChoseUnsalePool = isChoseUnsalePool;
    }

    public boolean isChoseUnableAllup() {
	return isChoseUnableAllup;
    }

    public void setChoseUnableAllup(boolean isChoseUnableAllup) {
	this.isChoseUnableAllup = isChoseUnableAllup;
    }

    public boolean isChoseUnsaleSel() {
	return isChoseUnsaleSel;
    }

    public void setChoseUnsaleSel(boolean isChoseUnsaleSel) {
	this.isChoseUnsaleSel = isChoseUnsaleSel;
    }

    public ChoseJczqSelTypeEnum getChoseSelType() {
	if (choseSelType == null) {
	    choseSelType = ChoseJczqSelTypeEnum.DS;
	}
	return choseSelType;
    }

    public void setChoseSelType(ChoseJczqSelTypeEnum setSelType) {
	this.choseSelType = setSelType;
    }

    public int getWantPoolCount() {
	if (wantPoolCount == 0) {
	    wantPoolCount = this.calculateMaxPoolCount();
	}
	return wantPoolCount;
    }

    public void setWantPoolCount(int wantPoolCount) {
	this.wantPoolCount = wantPoolCount;
    }

    public BetRuleJczqVo(String gameCode) {
	this.setGameCode(gameCode);
    }

    /**
     * 描 述：设置竞彩投注选项，可选类型：单式在售选项、全包在售选项、复式含不可售选项<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param pool
     * @param type
     * @return
     */
    public boolean choseSelForOnePool(JcPool pool, ChoseJczqSelTypeEnum type) {
	int maxSelCount = type.getMaxSelCount();

	List<JcOdds> oddsList = this.getOddsList(pool.poolId);

	int selCount = 0;
	for (JcOdds odds : oddsList) {
	    if (!this.isSelling(odds) && !this.isChoseUnsaleSel) {
		continue;
	    }

	    String selCode = BetSelEnum.find(Integer.parseInt(odds.sel))
		    .getCode();
	    this.addBetSelectList(pool.matchId, pool.gameCode, selCode);
	    selCount++;

	    if (selCount >= maxSelCount) {
		break;
	    }
	}

	if (selCount > 0) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * 描 述：获取一个奖池的赔率列表<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param poolId
     * @return
     */
    public List<JcOdds> getOddsList(long poolId) {
	Map<Long, List<JcOdds>> jcOddsMap = this.getJcOddsMap();
	List<JcOdds> list = jcOddsMap.get(poolId);

	if (list == null) {
	    System.out.println("^^^^^^^^^^^ poolid = " + poolId + "，赔率为空！");
	}

	System.out.println("^^^^^^^^^^^^^ poolId = " + poolId + ", 赔率列表大小 = "
		+ list.size());
	return list;
    }

    public List<JzBetCodeReq> getBetSelectList() {
	if (betSelectList == null) {
	    betSelectList = new ArrayList<JzBetCodeReq>();
	}
	return betSelectList;
    }

    /**
     * 描 述：增加投注内容<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param betSelect
     */
    public void addBetSelectList(JzBetCodeReq betSelect) {
	JzBetCodeReq betSelectOri = this.findBetSelect(betSelect.matchId,
		betSelect.poolGameCode);

	if (betSelectOri == null) {
	    List<JzBetCodeReq> betSelectList = this.getBetSelectList();
	    betSelectList.add(betSelect);
	} else {
	    betSelectOri.sel = betSelectOri.sel + StringUtil.COMMA
		    + betSelect.sel;
	}
    }

    /**
     * 描 述：增加投注内容<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param matchId
     * @param gameCode
     * @param sel
     */
    public void addBetSelectList(long matchId, String gameCode, String selCode) {
	JzBetCodeReq betSelect = new JzBetCodeReq();
	betSelect.matchId = matchId;
	betSelect.poolGameCode = gameCode;
	betSelect.sel = selCode;
	this.addBetSelectList(betSelect);
    }

    private JzBetCodeReq findBetSelect(long matchId, String gameCode) {
	List<JzBetCodeReq> betSelectList = this.getBetSelectList();
	for (JzBetCodeReq betDetail : betSelectList) {
	    if (betDetail.matchId == matchId
		    && betDetail.poolGameCode.equals(gameCode)) {
		return betDetail;
	    }
	}

	return null;
    }

    /**
     * 描 述：将投注内容List转换成数组，并set到VO属性中<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    public JzBetCodeReq[] getBetSelectArray() {
	List<JzBetCodeReq> betSelectList = this.getBetSelectList();
	int size = betSelectList.size();

	return betSelectList.toArray(new JzBetCodeReq[size]);
    }

    public Map<Long, List<JcOdds>> getJcOddsMap() {
	if (jcOddsMap == null) {
	    jcOddsMap = this.initJcOddsMap();
	}
	return jcOddsMap;
    }

    public void setJcOddsMap(Map<Long, List<JcOdds>> jcOddsMap) {
	this.jcOddsMap = jcOddsMap;
    }

    public Map<Long, Map<String, JcPool>> getJcPoolMap() {
	if (jcPoolMap == null) {
	    jcPoolMap = this.initJcPoolMap();

	    System.out.println("^^^^^^^^^^^^^^^ 初始化后，jcPoolMap.size = "
		    + jcPoolMap.size());
	}

	return jcPoolMap;
    }

    public void setJcPoolMap(Map<Long, Map<String, JcPool>> jcPoolMap) {
	this.jcPoolMap = jcPoolMap;
    }

    /**
     * 描 述：请求manager-ice接口，获取赔率数据<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    private Map<Long, List<JcOdds>> initJcOddsMap() {
	Map<Long, List<JcOdds>> jcOddsMap = new HashMap<Long, List<JcOdds>>();
	this.initJcOddsMap(jcOddsMap, GameEnum.JCZQ_SPF.getGameCode());
	this.initJcOddsMap(jcOddsMap, GameEnum.JCZQ_RQSPF.getGameCode());

	System.out.println("^^^^^^^^^^^^^^^ 初始化后，jcOddsMap.size = "
		+ jcOddsMap.size());
	return jcOddsMap;
    }

    private void initJcOddsMap(Map<Long, List<JcOdds>> jcOddsMap,
	    String gameCode) {
	JcPoolOdds[] jcOddses = this.getSellingJcOdds(gameCode);
	if (jcOddses == null) {
	    return;
	}

	for (JcPoolOdds jcOdds : jcOddses) {
	    long poolId = jcOdds.poolId;
	    List<JcOdds> oddsList = jcOddsMap.get(poolId);
	    if (oddsList == null) {
		oddsList = new ArrayList<JcOdds>();
		jcOddsMap.put(poolId, oddsList);
	    }

	    for (JcOdds odds : jcOdds.jcOddses) {
		oddsList.add(odds);
	    }
	}
    }

    private Map<Long, Map<String, JcPool>> initJcPoolMap() {
	Map<Long, Map<String, JcPool>> jcPoolMap = new HashMap<Long, Map<String, JcPool>>();

	JcPool[] jcPools = this.getSellingJcPools();

	if (jcPools == null) {
	    return jcPoolMap;
	}

	for (JcPool jcPool : jcPools) {
	    long matchId = jcPool.matchId;
	    Map<String, JcPool> jcMatchMap = jcPoolMap.get(matchId);
	    if (jcMatchMap == null) {
		jcMatchMap = new HashMap<String, JcPool>();
		jcPoolMap.put(matchId, jcMatchMap);
	    }

	    jcMatchMap.put(jcPool.gameCode, jcPool);
	}

	return jcPoolMap;
    }

    private JcPool[] getSellingJcPools() {
	if (SystemConfig.GET_JC_DATA_RESOURCE_FLAG == 0) {
	    return this.getSellingJcPoolsFromIce();
	} else {
	    return this.getSellingJcPoolsFromDb();
	}
    }

    private JcPool[] getSellingJcPoolsFromIce() {
	try {
	    SentServiceToPassportPrx ice = IceServiceProxy
		    .getManagerForPassportService();
	    JcPoolSellingResp out = ice.getJcPoolSelling(1, "-1");
	    if (out.jcPools == null || out.jcPools.length == 0) {
		return null;
	    } else {
		return out.jcPools;
	    }
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return null;
    }

    private JcPool[] getSellingJcPoolsFromDb() {
	ManagerJcPoolDao dao = (ManagerJcPoolDao) SpringUtil
		.getApplicationContext().getBean("managerJcPoolDao");
	List<ManagerJcPoolModel> modelList = dao.querySellingJcPools();
	if (modelList == null || modelList.isEmpty()) {
	    System.out.println("^^^^^^^^从数据库获取在售奖池数：0");
	    return null;
	}

	List<JcPool> jcPoolList = new ArrayList<JcPool>();
	for (ManagerJcPoolModel model : modelList) {
	    JcPool pool = new JcPool();
	    pool.matchId = model.getMatchId();
	    pool.gameCode = model.getGameCode();
	    pool.poolId = model.getPoolId();
	    pool.sportNo = SportTypeEnum.FB.getNo();
	    pool.oddsType = InfohubOddsTypeEnum.GD.getCode();
	    pool.handicap = model.getHandicap();
	    pool.poolState = Integer.parseInt(model.getPoolState());
	    pool.sysSaleState = Integer.parseInt(model.getSysSaleState());
	    pool.channelState = Integer.parseInt(model.getChannelState());
	    pool.allup = Integer.parseInt(model.getAllUp());
	    pool.single = Integer.parseInt(model.getSingle());
	    pool.chnlAllup = Integer.parseInt(model.getChnlAllUp());
	    pool.chnlSingle = Integer.parseInt(model.getChnlSingle());
	    pool.saleEndTime = DateUtil.format(model.getSaleEndTime(),
		    DateUtil.FORMAT_TIME_02);
	    pool.sysSaleEndTime = DateUtil.format(model.getSysSaleEndTime(),
		    DateUtil.FORMAT_TIME_02);
	    jcPoolList.add(pool);
	}

	return jcPoolList.toArray(new JcPool[jcPoolList.size()]);

    }

    private JcPoolOdds[] getSellingJcOdds(String gameCode) {
	if (SystemConfig.GET_JC_DATA_RESOURCE_FLAG == 0) {
	    return this.getSellingJcOddsFromIce(gameCode);
	} else {
	    return this.getSellingJcOddsFromDb(gameCode);
	}
    }

    private JcPoolOdds[] getSellingJcOddsFromIce(String gameCode) {
	try {
	    SentServiceToPassportPrx ice = IceServiceProxy
		    .getManagerForPassportService();
	    JcOddsSellingResp out = ice.getJcOddsSelling(1, gameCode,
		    InfohubOddsTypeEnum.GD.getCode(), "-1");
	    if (out.jcPoolOddses == null || out.jcPoolOddses.length == 0) {
		return null;
	    } else {
		return out.jcPoolOddses;
	    }
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return null;
    }

    private JcPoolOdds[] getSellingJcOddsFromDb(String gameCode) {
	ManagerJcOddsDao dao = (ManagerJcOddsDao) SpringUtil
		.getApplicationContext().getBean("managerJcOddsDao");
	List<ManagerJcOddsModel> modelList = dao.querySellingJcOdds(gameCode);
	if (modelList == null || modelList.isEmpty()) {
	    System.out.println("^^^^^^^^从数据库获取在" + gameCode + "售奖池赔率数：0");
	    return null;
	}

	Map<Long, List<ManagerJcOddsModel>> jcOddsMap = new HashMap<Long, List<ManagerJcOddsModel>>();
	for (ManagerJcOddsModel model : modelList) {
	    long poolId = model.getPoolId();
	    List<ManagerJcOddsModel> list = jcOddsMap.get(poolId);
	    if (list == null) {
		list = new ArrayList<ManagerJcOddsModel>();
		jcOddsMap.put(poolId, list);
	    }
	    list.add(model);
	}

	List<JcPoolOdds> poolOddsList = new ArrayList<JcPoolOdds>();
	for (List<ManagerJcOddsModel> list : jcOddsMap.values()) {
	    JcPoolOdds odds = new JcPoolOdds();
	    List<JcOdds> oddsList = new ArrayList<JcOdds>();
	    for (ManagerJcOddsModel model : list) {
		odds.sportNo = SportTypeEnum.FB.getNo();
		odds.matchId = model.getMatchId();
		odds.poolId = model.getPoolId();
		odds.gameCode = gameCode;

		JcOdds jcOdds = new JcOdds();
		jcOdds.sel = model.getSel();
		jcOdds.selState = Integer.parseInt(model.getSelState());
		jcOdds.oddsType = InfohubOddsTypeEnum.GD.getCode();
		jcOdds.oddsValue = model.getOddsValue() + "";
		oddsList.add(jcOdds);
	    }
	    JcOdds[] oddsArray = oddsList.toArray(new JcOdds[oddsList.size()]);
	    odds.jcOddses = oddsArray;
	    poolOddsList.add(odds);
	}

	return poolOddsList.toArray(new JcPoolOdds[poolOddsList.size()]);

    }

    public boolean isSelling(JcPool pool) {
	if (pool.poolState != 1) {
	    return false;
	}

	if (pool.sysSaleState != 1) {
	    return false;
	}

	if (pool.channelState != 1) {
	    return false;
	}

	Date endTime = DateUtil.parse(pool.sysSaleEndTime,
		DateUtil.FORMAT_TIME_02);
	if (endTime.before(new Date())) {
	    return false;
	}

	return true;
    }

    public boolean isSupportAllup(JcPool pool) {
	if (pool.allup != 1) {
	    return false;
	}

	if (pool.chnlAllup != 1) {
	    return false;
	}

	return true;
    }

    public boolean isSupportSinge(JcPool pool) {
	if (pool.single != 1) {
	    return false;
	}

	if (pool.chnlSingle != 1) {
	    return false;
	}

	return true;
    }

    public boolean isSelling(JcOdds odds) {
	if (odds.selState != 1) {
	    return false;
	}

	return true;
    }

    /**
     * 描 述：计算投注注数<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    public void calculateTimes() {
	// 如果set过注数，则不再计算
	int times = this.getTimes();
	if (times > 0) {
	    return;
	}

	String[] betWays = this.getDetailType().split(StringUtil.COMMA);
	for (String betWay : betWays) {
	    times += this.groupPoolAndComputeTimes(0, betWay,
		    new ArrayList<JzBetCodeReq>(), -1);
	}

	this.setTimes(times);
    }

    private int groupPoolAndComputeTimes(int times, String betWay,
	    List<JzBetCodeReq> betDetailList, int parentIndex) {
	String gameCode = this.getGameCode();
	BetWayEnum betWayEnum = BetWayEnum.find(betWay, gameCode);
	if (betWayEnum == null) {
	    // 可能是错误的投注方式，不过在我们的测试用例中，只可能是混合过关投注了单场1#0
	    betWayEnum = BetWayEnum.JCZQ_SPF_1x0;
	}

	int aupLg = betWayEnum.getAbgwAllup().getAupLg();

	for (int i = parentIndex + 1; i < this.betSelectList.size(); i++) {
	    JzBetCodeReq betDetail = this.betSelectList.get(i);
	    betDetailList.add(betDetail);

	    if (aupLg == betDetailList.size()) {
		BetWayJczqEnum wayEnum = BetWayJczqEnum.find(betWay);
		String[] allUpAupLgs = wayEnum.getSplit().split(
			StringUtil.COMMA);
		for (String allupAupLgStr : allUpAupLgs) {
		    int allUpAupLg = Integer.parseInt(allupAupLgStr);

		    // System.out.println("^^^^^^^^^^^^^^计算注数：过关方式：" + betWay
		    // + ", 正在计算的关数：" + allUpAupLg);

		    times += this.computeTimes(betDetailList, 0, allUpAupLg, 0,
			    -1, 1);
		}

		betDetailList.remove(betDetailList.size() - 1);
		continue;
	    }

	    times = this.groupPoolAndComputeTimes(times, betWay, betDetailList,
		    i);
	    betDetailList.remove(betDetailList.size() - 1);
	}

	return times;
    }

    private int computeTimes(List<JzBetCodeReq> betDetailList, int times,
	    int aupLg, int allUpCount, int parentIndex, int parentTimes) {

	// System.out
	// .println(String
	// .format("^^^^^^递归计算注数：步骤%s, allUpCount = %s, parentIndex = %s,  parentTimes = %s, times = %s",
	// "1", allUpCount, parentIndex, parentTimes,
	// times));

	for (int i = parentIndex + 1; i < betDetailList.size(); i++) {
	    JzBetCodeReq betDetail = betDetailList.get(i);
	    int selCount = betDetail.sel.split(StringUtil.COMMA).length;
	    int currentTimes = selCount * parentTimes;
	    allUpCount++;

	    if (aupLg == allUpCount) {
		times += currentTimes;

		// System.out
		// .println(String
		// .format("^^^^^^递归计算注数：步骤%s, allUpCount = %s, parentIndex = %s, index = %s, parentTimes = %s, selCount = %s, currentTimes = %s, times = %s",
		// "2", allUpCount, parentIndex, i,
		// parentTimes, selCount, currentTimes,
		// times));

		allUpCount--;
		continue;
	    }

	    // System.out
	    // .println(String
	    // .format("^^^^^^递归计算注数：步骤%s, allUpCount = %s, parentIndex = %s, index = %s, parentTimes = %s, selCount = %s, currentTimes = %s, times = %s",
	    // "3", allUpCount, parentIndex, i,
	    // parentTimes, selCount, currentTimes, times));

	    times = this.computeTimes(betDetailList, times, aupLg, allUpCount,
		    i, currentTimes);
	    allUpCount--;

	    // System.out
	    // .println(String
	    // .format("^^^^^^递归计算注数：步骤%s, allUpCount = %s, parentIndex = %s, index = %s, parentTimes = %s, selCount = %s, currentTimes = %s, times = %s",
	    // "4", allUpCount, parentIndex, i,
	    // parentTimes, selCount, currentTimes, times));

	}

	// System.out
	// .println(String
	// .format("^^^^^^递归计算注数：步骤%s, allUpCount = %s, parentIndex = %s,  parentTimes = %s, times = %s",
	// "5", allUpCount, parentIndex, parentTimes,
	// times));

	return times;
    }

    /**
     * 描 述：根据投注方式，自动计算可投注的最多关数<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    private int calculateMaxPoolCount() {
	int maxPoolCount = 0;
	String[] betWays = this.getDetailType().split(StringUtil.COMMA);
	for (String betWay : betWays) {
	    BetWayEnum betWayEnum = BetWayEnum.find(betWay, this.getGameCode());
	    if (betWayEnum == null) {
		// 可能是错误的投注方式，不过在我们的测试用例中，只可能是混合过关投注了单场1#0
		betWayEnum = BetWayEnum.JCZQ_SPF_1x0;
	    }

	    int poolCount = betWayEnum.getAbgwAllup().getAupLg();
	    if (poolCount > maxPoolCount) {
		maxPoolCount = poolCount;
	    }
	}

	return maxPoolCount;
    }

    public void setDetailType(BetWayEnum[] wayEnums) {
	StringBuffer betWayBuffer = null;
	for (BetWayEnum wayEnum : wayEnums) {
	    if (betWayBuffer == null) {
		betWayBuffer = new StringBuffer();
	    } else {
		betWayBuffer.append(StringUtil.COMMA);
	    }
	    betWayBuffer.append(wayEnum.getCode());
	}
	this.setDetailType(betWayBuffer.toString());
    }

    public boolean isHHGG() {
	String gameCode = this.getGameCode();
	return GameEnum.JCZQ_HHGG.getGameCode().equals(gameCode);
    }

}
