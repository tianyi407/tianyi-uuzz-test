package test.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import test.common.db.model.ManagerJcOddsModel;

@Repository("managerJcOddsDao")
public class ManagerJcOddsDao extends IbatisDAO {

    /**
     * 描 述：查询全部在售奖池赔率数据<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    @SuppressWarnings({ "deprecation", "unchecked" })
    public List<ManagerJcOddsModel> querySellingJcOdds(String gameCode) {
	List<ManagerJcOddsModel> list = getSqlMapClientTemplate().queryForList(
		"querySellingJcOdds", gameCode);
	return list;
    }

}
