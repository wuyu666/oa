package com.chinasofti.oa.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.oa.bean.Notice;
import com.chinasofti.oa.bean.Page;
import com.chinasofti.oa.service.INoticeService;
@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Resource	
	private INoticeService noticeService;
	
	
	@RequestMapping("/doSelect")
	@ResponseBody
	public String doSelect(Page page){
	List select=noticeService.queryNotice(page);
	System.err.println(select.toString());
	return null;
	}
}
