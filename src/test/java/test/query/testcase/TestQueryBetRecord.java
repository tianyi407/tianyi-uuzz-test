// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.query.testcase;

import org.junit.Test;

import test.common.vo.QueryBetRecordVo;
import test.query.TestQueryBase;

import com.uuzz.lottery.constant.game.GameTypeEnum;

/**
 * 类 名: TestQueryBetRecord<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestQueryBetRecord extends TestQueryBase {

//     private GameTypeEnum gameType = GameTypeEnum.DC;

//    private GameTypeEnum gameType = GameTypeEnum.JK;

     private GameTypeEnum gameType = GameTypeEnum.CTZC;

//     private GameTypeEnum gameType = GameTypeEnum.JCZQ;

    /**
     * 描 述：查询投注记录，都是DB存在的，各状态每种1条<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testQueryRecord1() {
	QueryBetRecordVo vo = new QueryBetRecordVo(gameType);
	this.queryBetRecord(vo);
    }

    /**
     * 描 述：基于用例1，增加不存在的投注记录<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testQueryRecord2() {
	QueryBetRecordVo vo = new QueryBetRecordVo(gameType);
	vo.setContainNoExistRecord(true);
	this.queryBetRecord(vo);
    }

    /**
     * 描 述：基于用例2，增加不匹配的代销者<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testQueryRecord3() {
	QueryBetRecordVo vo = new QueryBetRecordVo(gameType);
	vo.setContainNoExistRecord(true);
	vo.setContainOtherAgentNo(true);
	this.queryBetRecord(vo);
    }

    /**
     * 描 述：基于用例3，增加重复投注记录<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testQueryRecord4() {
	QueryBetRecordVo vo = new QueryBetRecordVo(gameType);
	vo.setContainNoExistRecord(true);
	vo.setContainOtherAgentNo(true);
	vo.setContainDuplicateRecord(true);
	this.queryBetRecord(vo);
    }
    
    /**
     * 描 述：不从DB取投注记录，结果应该都不存在<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testQueryRecord5() {
	QueryBetRecordVo vo = new QueryBetRecordVo(gameType);
	vo.setGetAgentSidFromDB(false);
	vo.setContainNoExistRecord(true);
	vo.setContainOtherAgentNo(true);
	vo.setContainDuplicateRecord(true);
	vo.setWantCount(1);
	this.queryBetRecord(vo);
    }
    
    /**
     * 描 述：超出100条<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testQueryRecord6() {
	QueryBetRecordVo vo = new QueryBetRecordVo(gameType);
	vo.setContainNoExistRecord(true);
	vo.setContainOtherAgentNo(true);
	vo.setContainDuplicateRecord(true);
	vo.setWantCount(40);
	this.queryBetRecord(vo, false);
    }
    
    /**
     * 描 述：各条件都具备，每种条件条数为2<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testQueryRecord7() {
	QueryBetRecordVo vo = new QueryBetRecordVo(gameType);
	vo.setContainNoExistRecord(true);
	vo.setContainOtherAgentNo(true);
	vo.setContainDuplicateRecord(true);
	vo.setWantCount(2);
	this.queryBetRecord(vo);
    }

}
