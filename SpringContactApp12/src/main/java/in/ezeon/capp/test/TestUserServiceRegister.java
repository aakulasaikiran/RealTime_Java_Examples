package in.ezeon.capp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.capp.config.SpringRootConfig;

import in.ezeon.capp.domain.User;
import in.ezeon.capp.services.UserService;



public class TestUserServiceRegister {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		// UserServiceImpl userserviceimpl = ctx.getBean(UserServiceImpl.class);
		UserService userService = ctx.getBean(UserService.class);
		User u = new User();
		u.setName("akshitha");
		u.setPhone("9948052926");
		u.setEmail("saiias@gmail.com");
		u.setAddress("chelgal1");
		u.setLoginName("akshitha");
		u.setPassword("akshitha");
		u.setRole(UserService.ROLE_ADMIN);
		 u.setLoginStatus(userService.LOGIN_STATUS_ACTIVE);
		userService.register(u);
		System.out.println("---Data Saved Successfully by Service-------");
	}

}
