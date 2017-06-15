package com.chinasofti.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.chinasofti.oa.bean.Department;
import com.chinasofti.oa.mapper.IDepartmentMapper;
import com.chinasofti.oa.service.IDepartmentService;
/**
 * 部门Service接口实现类
 * @author wy
 * 2017年6月15日
 */
public class DepartmentServiceImpl implements IDepartmentService{
	@Resource
	private IDepartmentMapper departmentMapper;

	@Override
	public List<Department> queryDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.queryDepartment(department);
	}

	@Override
	public boolean updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.updateDepartment(department);
	}

	@Override
	public boolean insertDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.insertDepartment(department);
	}

	@Override
	public boolean deleteDepartment(int id) {
		// TODO Auto-generated method stub
		return departmentMapper.deleteDepartment(id);
	}

	@Override
	public Department queryDepartmentById(int id) {
		// TODO Auto-generated method stub
		return departmentMapper.queryDepartmentById(id);
	}

	

}
