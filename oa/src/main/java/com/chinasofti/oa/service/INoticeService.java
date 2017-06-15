package com.chinasofti.oa.service;

import java.util.List;

import com.chinasofti.oa.bean.Page;

public interface INoticeService<B> {
	List<B> queryNotice(Page p);
	int queryCount(Page p);
	boolean delete(String ids);
	boolean update(B b);
	boolean add(B b);
}
