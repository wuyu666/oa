package com.chinasofti.oa.service;

import java.util.List;

import com.chinasofti.oa.bean.Department;

/**
 * 部门Service接口
 * @author wy
 * 2017年6月15日
 */

public interface IDepartmentService {
	/**
	 * 查询部门
	 * @param department
	 * @return
	 */
	List<Department> queryDepartment(Department department);
	/**
	 * 修改部门
	 * @param department
	 * @return
	 */
	int updateDepartment(Department department);
	/**
	 * 添加部门
	 * @param department
	 * @return
	 */
	int insertDepartment(Department department);
	/**
	 * 删除部门
	 * @param id
	 * @return
	 */
	int deleteDepartment(int id);
}
