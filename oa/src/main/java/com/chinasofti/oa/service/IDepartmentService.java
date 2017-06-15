package com.chinasofti.oa.service;

import java.util.List;

import com.chinasofti.oa.bean.Department;

/**
 * 部门Service接口
 * @author wy
 * 2017年6月15日
 */

public interface IDepartmentService {
	List<Department> queryDepartment(Department department);
	int updateDepartment(Department department);
	int insertDepartment(Department department);
	int deleteDepartment(int id);
}
