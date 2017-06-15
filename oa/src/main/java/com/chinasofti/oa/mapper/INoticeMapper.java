package com.chinasofti.oa.mapper;

import java.util.List;
import com.chinasofti.oa.bean.Page;

public interface INoticeMapper<B> {
	List<B> queryNotice(Page p);
	int queryCount(Page p);
	boolean delete(String ids);
	boolean update(B b);
	boolean add(B b);
}
