package com.chinasofti.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasofti.oa.bean.Notice;
import com.chinasofti.oa.bean.Page;
import com.chinasofti.oa.mapper.INoticeMapper;
import com.chinasofti.oa.service.INoticeService;
@Service
public class NoticeServiceImpl implements INoticeService<Notice>{
	@Resource
	private INoticeMapper noticeMapper;

	@Override
	public List<Notice> queryNotice(Page p) {
		// TODO Auto-generated method stub
		return noticeMapper.queryNotice(p);
	}

	@Override
	public int queryCount(Page p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(String ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Notice b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Notice b) {
		// TODO Auto-generated method stub
		return false;
	}

	
	


}
