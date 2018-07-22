package in.ezeon.capp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.domain.User;

public class TestUserDAOFindByProp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDAO=ctx.getBean(UserDAO.class);
		
		//List<User> users=userDAO.finfByProperty("userId", 14);
		List<User> users=userDAO.findByProperty("name", "Raj");
		for(User u:users){
			System.out.println(u.getName()+" "+u.getUserId()+" "+u.getEmail()+" "+u.getLoginName());
			
		}
		
		
	}
	
}
