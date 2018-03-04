package com.bwf.dao;

import java.util.List;

import com.bwf.bean.StudentBean;

/**
 * mybatis支持接口直接绑定持久化功能， ibatis没有这个功能
 * 
 *   该持久层接口不需要有实现类
 * 
 * @author Administrator
 *
 */
public interface IStudentDao {
	
	public boolean addStudent(StudentBean bean);

	public List<StudentBean> queryStudent(StudentBean bean);
	
	public boolean deleteStudent(StudentBean bean);
	
	public boolean updateStudent(StudentBean bean);
	
}
