package test.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import test.common.db.model.BetRecordModel;

@Repository("tradeSportRecordDao")
public class TradeSportRecordDao extends IbatisDAO {

    /**
     * 描 述：采样投注记录各状态值的数据（投注状态、兑奖状态），反馈代销者投注记录号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param count
     * @return
     */
    @SuppressWarnings({ "deprecation", "unchecked" })
    public List<BetRecordModel> queryEachStateAgentSidCtzc(int count) {
	List<BetRecordModel> list = getSqlMapClientTemplate().queryForList(
		"queryEachStateAgentSidCtzc", count);
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
    public List<BetRecordModel> queryEachStateAgentSidJczq(int count) {
	List<BetRecordModel> list = getSqlMapClientTemplate().queryForList(
		"queryEachStateAgentSidJczq", count);
	return list;
    }

}
