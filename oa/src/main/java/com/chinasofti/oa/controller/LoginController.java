package com.chinasofti.oa.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.oa.bean.Log;
import com.chinasofti.oa.service.ILoginService;

/**
 * 登录的操作层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired 
	private ILoginService loginService;
   //登录的查询方法
	
	@RequestMapping("/queryLogin")
	@ResponseBody
	public String queryLogin(Log log,HttpServletRequest request,HttpServletResponse response,Model model) throws IOException{
		//得到主页传过来的username和password
		String username=log.getUsername();
		String password=log.getPassword();
		String msg="用户名可用!";
		System.out.println(username+"------------");
		
		//把得到的用户名和密码放入到log 对象中
		log.setUsername(username);
		log.setPassword(password);
		
		//flag是查询数据库返回的状态true or flase
		Boolean flag=loginService.querylogin(log);
	    //flag==true进去
		if(flag){
			response.setContentType("text/plain;charset=UTF-8");
			response.getWriter().write(msg);
		}else{//flag==flase进来
			msg="用户名或者密码错误";
			response.setContentType("text/plain;charset=UTF-8");
			response.getWriter().write(msg);
		}
		return null;
	}
	
	
}
