package com.bwf.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwf.bean.StudentBean;
import com.bwf.dao.IStudentDao;

@Controller
public class StudentController {

	@Autowired
	private IStudentDao studentDao;
	private Log log = LogFactory.getLog(getClass());

	@RequestMapping("/queryStudent.do")
	public String queryPage(StudentBean student, HttpServletRequest request) {
		log.info("查询所有的学生信息，传入参数student：" + student);

		List list = studentDao.queryStudent(student);
		request.setAttribute("studentList", list);
		return "/queryStudent.jsp";
	}

}
