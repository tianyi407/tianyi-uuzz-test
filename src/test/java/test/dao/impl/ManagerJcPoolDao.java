package test.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import test.common.db.model.ManagerJcPoolModel;

@Repository("managerJcPoolDao")
public class ManagerJcPoolDao extends IbatisDAO {

    /**
     * 描 述：查询全部在售奖池数据<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    @SuppressWarnings({ "deprecation", "unchecked" })
    public List<ManagerJcPoolModel> querySellingJcPools() {
	List<ManagerJcPoolModel> list = getSqlMapClientTemplate().queryForList(
		"querySellingJcPools");
	return list;
    }

}
