package datasource.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bwf.bean.StudentBean;
import com.bwf.dao.IStudentDao;

@ContextConfiguration("classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class DataSourceTest {

	@Autowired private IStudentDao studentDao;
	
	@Test public void conn(){
		System.out.println("--studentDao:"+studentDao);
		
		StudentBean bean =new StudentBean();
		
		List<StudentBean> list = studentDao.queryStudent(bean);
		System.out.println("---size:"+list.size());
		System.out.println("--list:"+list);
	}
}
