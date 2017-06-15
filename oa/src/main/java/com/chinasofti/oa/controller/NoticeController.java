package com.chinasofti.oa.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.oa.bean.Notice;
import com.chinasofti.oa.service.NoticeService;
@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Resource	
	private NoticeService noticeService;
	@RequestMapping("/doSelect")
	@ResponseBody
	public Notice doSelect(Notice notice){
	Notice select=noticeService.queryNotice(notice);
	System.err.println(select.toString());
	return select;
	}
}
