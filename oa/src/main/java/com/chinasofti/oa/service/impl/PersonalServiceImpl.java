package com.chinasofti.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import com.chinasofti.oa.bean.Personal;
import com.chinasofti.oa.mapper.PersonalMapper;
import com.chinasofti.oa.service.IPersonalService;

public class PersonalServiceImpl implements IPersonalService {
	@Resource
	private	PersonalMapper personalMapper;
	@Override
	public List<Personal> query(Personal personal) {
		
		return personalMapper.query(personal);
	}
   
	
	
	

}
