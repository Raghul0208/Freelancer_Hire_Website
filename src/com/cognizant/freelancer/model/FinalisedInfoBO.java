package com.cognizant.freelancer.model;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.cognizant.freelancer.controller.FinalisedInfo;
import com.cognizant.freelancer.dao.FinalisedInfo_DAO;

public class FinalisedInfoBO {

	public int addFinalInfo(List<FinalisedInfo> list){
		// TODO Auto-generated method stub
		
		FinalisedInfo_DAO fidao=new FinalisedInfo_DAO();
		int num=fidao.addFinalInfo(list);
		return num;
	}

}
