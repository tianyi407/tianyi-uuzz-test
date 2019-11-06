// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.query.service;

import org.springframework.stereotype.Component;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.manager.IceServiceProxy;
import com.uuzz.lottery.manager.entity.AreaCodeEntityListReturn;
import com.uuzz.lottery.manager.entity.AreaEntity;
import com.uuzz.lottery.manager.entity.CityEntity;
import com.uuzz.lottery.manager.entity.ProvinceEntity;
import com.uuzz.lottery.manager.service.SentServiceToManagerPrx;
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
public class QueryManagerSysData {

    /**
     * 描 述：查询地区代码：getAreaCode<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    public AreaCodeEntityListReturn getAreaCode() {
	try {

	    SentServiceToManagerPrx ice = IceServiceProxy.getManagerService();
	    AreaCodeEntityListReturn resp = ice.getAreaCode();
	    printResp(resp);
	    return resp;

	} catch (IceException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return null;
    }

    private void printResp(AreaCodeEntityListReturn resp) {

	int provinceCount = 0;
	int cityCount = 0;
	int districtCount = 0;

	ProvinceEntity[] provinceArray = resp.provinceEntityLists;
	if (provinceArray != null) {
	    provinceCount = provinceArray.length;
	}

	String resultModel = StringUtil.NEW_LINE
		+ "====查询地区代码 响应：status = [%s], resultCode = [%s], msg = [%s], ProvinceEntity[].length = [%s]======";

	String resultMsg = String.format(resultModel, resp.status,
		resp.resultCode, resp.msg, provinceCount);

	System.out.println(resultMsg);

	if (provinceCount == 0) {
	    return;
	}

	for (ProvinceEntity province : provinceArray) {

	    String pModel = "=====省代码 详情：AreaEntity：code=[%s], name=[%s], parentCode=[%s], desc=[%s], CityEntity[].length=[%s].";

	    AreaEntity pArea = province.area;
	    CityEntity[] cityArray = province.cityEntitylists;
	    if (pArea == null) {
		System.out.println("=====省代码 为空，数据错误！");
		continue;
	    }

	    if (cityArray != null) {
		cityCount = cityArray.length;
	    } else {
		cityCount = 0;
	    }

	    System.out.println(String.format(pModel, pArea.code,
		    pArea.name, pArea.parentCode, pArea.desc, cityCount));

	    if (cityArray != null) {
		String cModel = "======市代码 详情：AreaEntity：code=[%s], name=[%s], parentCode=[%s], desc=[%s], AreaEntity[].length=[%s].";
		for (CityEntity city : cityArray) {
		    AreaEntity cArea = city.area;
		    AreaEntity[] districtArray = city.districtEntitylists;

		    if (cArea == null) {
			System.out.println("======市代码 为空，数据错误！");
			continue;
		    }

		    if (districtArray != null) {
			districtCount = districtArray.length;
		    } else {
			districtCount = 0;
		    }

		    System.out.println(String.format(cModel, cArea.code,
			    cArea.name, cArea.parentCode, cArea.desc,
			    districtCount));

		    if (districtArray != null) {

			String dModel = "=======区代码 详情：AreaEntity：code=[%s], name=[%s], parentCode=[%s], desc=[%s].";
			for (AreaEntity area : districtArray) {
			    if (area == null) {
				System.out.println("=======区代码 为空，数据错误！");
				continue;
			    }

			    System.out.println(String.format(dModel,
				    area.code, area.name, area.parentCode,
				    area.desc));
			}
		    }
		}
	    }
	}
    }

}
