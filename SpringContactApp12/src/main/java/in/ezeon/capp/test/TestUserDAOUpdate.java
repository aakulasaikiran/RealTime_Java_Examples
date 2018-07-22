package in.ezeon.capp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.domain.User;

public class TestUserDAOUpdate {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDAO=ctx.getBean(UserDAO.class);
		User u=new User();
		u.setName("kiransai aakula");
		u.setPhone("9948052926");
		u.setEmail("saiias@gmail.com");
		u.setAddress("chelgal");
		u.setRole(1);
		u.setLoginStatus(1);
		u.setUserId(14);
		userDAO.update(u);;
		System.out.println("---Data Updated Successfully by DAOUpdate-------");
	}
	
}
