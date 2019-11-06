package test.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import test.common.db.model.BetRecordModel;

@Repository("tradeJikaiRecordDao")
public class TradeJikaiRecordDao extends IbatisDAO {

    /**
     * 描 述：查询投注成功的 指定投注账户、刮开状态、数量的投注记录<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param bettingNo
     * @param count
     * @param openState
     * @return
     */
    @SuppressWarnings({ "deprecation", "unchecked" })
    public List<String> queryNeedOpenLotteryCode(String bettingNo, int count,
	    int openState) {
	Map<String, Object> condition = new HashMap<String, Object>();
	condition.put("bettingNo", bettingNo);
	condition.put("count", count);
	condition.put("openState", openState);

	List<String> list = getSqlMapClientTemplate().queryForList(
		"queryNeedOpenLotteryCode", condition);
	return list;
    }

    /**
     * 描 述：查询非投注成功的 指定投注账户、数量的投注记录<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param bettingNo
     * @param count
     * @return
     */
    @SuppressWarnings({ "deprecation", "unchecked" })
    public List<String> queryBetFailLotteryCode(String bettingNo, int count) {
	Map<String, Object> condition = new HashMap<String, Object>();
	condition.put("bettingNo", bettingNo);
	condition.put("count", count);

	List<String> list = getSqlMapClientTemplate().queryForList(
		"queryBetFailLotteryCode", condition);
	return list;
    }

    /**
     * 描 述：查询投注成功的 指定投注账户以外、指定数量的投注记录<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param bettingNo
     * @param count
     * @return
     */
    @SuppressWarnings({ "deprecation", "unchecked" })
    public List<String> queryAnotherLotteryCode(String bettingNo, int count) {
	Map<String, Object> condition = new HashMap<String, Object>();
	condition.put("bettingNo", bettingNo);
	condition.put("count", count);

	List<String> list = getSqlMapClientTemplate().queryForList(
		"queryAnotherLotteryCode", condition);
	return list;
    }
    
    /**
     * 描 述：采样投注记录各状态值的数据（投注状态、兑奖状态），反馈代销者投注记录号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param count
     * @return
     */
    @SuppressWarnings({ "deprecation", "unchecked" })
    public List<BetRecordModel> queryEachStateAgentSidJk(int count) {
	List<BetRecordModel> list = getSqlMapClientTemplate().queryForList(
		"queryEachStateAgentSidJk", count);
	return list;
    }


}
