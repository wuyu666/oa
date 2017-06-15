package com.chinasofti.oa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasofti.oa.bean.Notice;
import com.chinasofti.oa.mapper.NoticeMapper;
import com.chinasofti.oa.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService{
	@Resource
	private NoticeMapper noticeMapper;
	
	@Override
	public Notice queryNotice(Notice no) {
		// TODO Auto-generated method stub
		return noticeMapper.queryNotice(no);
	}

}
