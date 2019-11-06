// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.query.service;

import org.springframework.stereotype.Component;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.manager.IceServiceProxy;
import com.uuzz.lottery.manager.entity.JcMatch;
import com.uuzz.lottery.manager.entity.JcMatchNoStartResp;
import com.uuzz.lottery.manager.entity.JcMatchResult;
import com.uuzz.lottery.manager.entity.JcMatchResultResp;
import com.uuzz.lottery.manager.entity.JcScore;
import com.uuzz.lottery.manager.service.SentServiceToPassportPrx;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: QueryJcData<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
@Component
public class QueryJcData {

    /**
     * 描 述：查询未开赛赛事（竞彩）：getJcMatchNoStart<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    public JcMatchNoStartResp getJcMatchNoStart(int sportNo, String version) {
	try {

	    SentServiceToPassportPrx ice = IceServiceProxy
		    .getManagerForPassportService();
	    JcMatchNoStartResp resp = ice.getJcMatchNoStart(sportNo, version);
	    printResp(resp);
	    return resp;

	} catch (IceException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return null;
    }

    private void printResp(JcMatchNoStartResp resp) {

	int matchSize = 0;
	JcMatch[] jcMatchArray = resp.jcMatchs;
	if (jcMatchArray != null) {
	    matchSize = jcMatchArray.length;
	}

	String resultModel = StringUtil.NEW_LINE
		+ "======查询未开赛赛事 响应：status = [%s], version = [%s], resultCode = [%s], msg = [%s], JcMatch[].length = [%s]======";

	String resultMsg = String.format(resultModel, resp.status,
		resp.version, resp.resultCode, resp.msg, matchSize);

	System.out.println(resultMsg);

	if (matchSize == 0) {
	    return;
	}

	resultModel = "======查询未开赛赛事 详情：JcMatch：sportNo=[%s], matchId=[%s], matchNo=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             leagueId=[%s], leagueCode=[%s], leagueName=[%s], leagueNameShort=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             homeId=[%s], homeCode=[%s], homeName=[%s], homeNameShort=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             guestId=[%s], guestCode=[%s], guestName=[%s], guestNameShort=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             matchState=[%s], businessDate=[%s], matchTime=[%s], createTime=[%s], updateTime=[%s].";

	for (JcMatch match : jcMatchArray) {
	    System.out.println(String.format(resultModel, match.sportNo,
		    match.matchId, match.matchNo, match.leagueId,
		    match.leagueCode, match.leagueName, match.leagueNameShort,
		    match.homeId, match.homeCode, match.homeName,
		    match.homeNameShort, match.guestId, match.guestCode,
		    match.guestName, match.guestNameShort, match.matchState,
		    match.businessDate, match.matchTime, match.createTime,
		    match.updateTime));
	}

    }

    /**
     * 描 述：查询指定赛事及赛果（竞彩）：getJcMatchResult<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    public JcMatchResultResp getJcMatchResult(long[] jcMatchIds) {
	try {

	    SentServiceToPassportPrx ice = IceServiceProxy
		    .getManagerForPassportService();
	    JcMatchResultResp resp = ice.getJcMatchResult(jcMatchIds);
	    printResp(resp);
	    return resp;

	} catch (IceException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return null;
    }

    private void printResp(JcMatchResultResp resp) {

	int matchSize = 0;
	JcMatchResult[] jcMatchResultArray = resp.jcMatchResults;
	if (jcMatchResultArray != null) {
	    matchSize = jcMatchResultArray.length;
	}

	String resultModel = StringUtil.NEW_LINE
		+ "======查询指定赛事及赛果 响应：status = [%s], resultCode = [%s], msg = [%s], JcMatchResult[].length = [%s]======";

	String resultMsg = String.format(resultModel, resp.status,
		resp.resultCode, resp.msg, matchSize);

	System.out.println(resultMsg);

	if (matchSize == 0) {
	    return;
	}

	resultModel = StringUtil.NEW_LINE
		+ "======赛事详情：JcMatchResult：sportNo=[%s], matchId=[%s], matchNo=[%s], exsits=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             leagueId=[%s], leagueCode=[%s], leagueName=[%s], leagueNameShort=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             homeId=[%s], homeCode=[%s], homeName=[%s], homeNameShort=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             guestId=[%s], guestCode=[%s], guestName=[%s], guestNameShort=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             matchState=[%s],  resultState=[%s], "
		+ StringUtil.NEW_LINE
		+ "                             businessDate=[%s], matchTime=[%s], createTime=[%s], updateTime=[%s].";

	String scoreModel = "======赛果详情：JcScore：section=[%s], homeScore=[%s], guestScore=[%s], issueTime=[%s], createTime=[%s], updateTime=[%s].";

	for (JcMatchResult match : jcMatchResultArray) {
	    System.out.println(String.format(resultModel, match.sportNo,
		    match.matchId, match.matchNo, match.exsits, match.leagueId,
		    match.leagueCode, match.leagueName, match.leagueNameShort,
		    match.homeId, match.homeCode, match.homeName,
		    match.homeNameShort, match.guestId, match.guestCode,
		    match.guestName, match.guestNameShort, match.matchState,
		    match.resultState, match.businessDate, match.matchTime,
		    match.createTime, match.updateTime));

	    JcScore[] jcScoreArray = match.jcScores;
	    for (JcScore score : jcScoreArray) {
		System.out.println(String.format(scoreModel, score.section,
			score.homeScore, score.guestScore, score.issueTime,
			score.createTime, score.updateTime));
	    }
	}

    }
}
