package com.chinasofti.oa.service;

import java.util.List;
import java.util.Map;

import com.chinasofti.oa.bean.Notice;
import com.chinasofti.oa.bean.Page;

public interface INoticeService {
	public List<Notice> queryNotice(Map<String, Object> map);
	public long queryCount(Map<String, Object> map);;
	boolean add(Notice no);
	boolean update(Notice no);
	boolean delete(Notice no);
	
}
