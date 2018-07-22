package in.ezeon.capp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.domain.User;

public class TestUserDAOSave {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDAO=ctx.getBean(UserDAO.class);
		User u=new User();
		u.setName("kiransai");
		u.setPhone("8143941110");
		u.setEmail("440saiias@gmail.com");
		u.setAddress("chelgal");
		u.setLoginName("kiransai");
		u.setPassword("kiransai");
		u.setRole(1);
		u.setLoginStatus(1);
		userDAO.save(u);
		System.out.println("---Data Saved Successfully bt DAO-------");
	}
	
}
