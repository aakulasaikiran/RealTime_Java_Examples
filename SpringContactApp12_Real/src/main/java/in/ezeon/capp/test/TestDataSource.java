package in.ezeon.capp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ezeon.capp.config.SpringRootConfig;

public class TestDataSource {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		DataSource ds = ctx.getBean(DataSource.class);
		JdbcTemplate jt = new JdbcTemplate(ds);
		String sql = "INSERT INTO User (name,phone,email,address,loginName,password) values(?,?,?,?,?,?)";
		Object[] paaram = new Object[] { "saikiran", "9701887045", "aakulasaikiran@gmail.com", "chelgal", "saikiran",
				"saikiran" };
		jt.update(sql, paaram);
		System.out.println("Sql Successfully Exicuted....");
	}
}
