package com.chinasofti.oa.mapper;

import java.util.List;
import java.util.Map;

import com.chinasofti.oa.bean.Notice;
import com.chinasofti.oa.bean.Page;

public interface INoticeMapper {
	public List<Notice> queryNotice(Map<String, Object> map);
	public long queryCount(Map<String, Object> map);;
	boolean add(Notice no);
	boolean update(Notice no);
	boolean delete(Notice no);
}
