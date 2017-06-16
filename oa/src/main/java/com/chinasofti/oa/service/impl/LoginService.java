package com.chinasofti.oa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasofti.oa.bean.Log;
import com.chinasofti.oa.mapper.LogMapper;
import com.chinasofti.oa.service.ILoginService;
/**
 * 登录验证查询service
 * @author Administrator
 *
 */
@Service("loginService")
public class LoginService implements ILoginService{
    @Resource 
    private LogMapper logMapper;
    
	@Override
	public boolean querylogin(Log log) {
		// TODO Auto-generated method stub
		return logMapper.querylogin(log);
	}

}
