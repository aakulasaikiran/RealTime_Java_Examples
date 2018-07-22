package in.ezeon.capp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import in.ezeon.capp.domain.User;
import in.ezeon.capp.rm.UserRowMapper;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

	public void save(User u) {

		String sql = "INSERT INTO USER(name,phone,email,address,loginName,password,role,loginStatus)values(:name,:phone,:email,:address,:loginName,:password,:role,:loginStatus)";
		Map m = new HashMap();
		m.put("name", u.getName());
		m.put("phone", u.getPhone());
		m.put("email", u.getEmail());
		m.put("address", u.getAddress());
		m.put("loginName", u.getLoginName());
		m.put("password", u.getPassword());
		m.put("role", u.getRole());
		m.put("loginStatus", u.getLoginStatus());

		KeyHolder kh = new GeneratedKeyHolder();
		SqlParameterSource ps = new MapSqlParameterSource(m);

		super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
		Integer userId = kh.getKey().intValue();
		u.setUserId(userId);
	}

	// phone,email,address,loginName,password,role,loginStatus
	public void update(User u) {

		String sql = "UPDATE User set name=:name,phone=:phone,email=:email,address=:address,role=:role,loginStatus=:loginStatus where userId=:userId";
		Map m = new HashMap();
		m.put("name", u.getName());
		m.put("phone", u.getPhone());
		m.put("email", u.getEmail());
		m.put("address", u.getAddress());
		m.put("role", u.getRole());
		m.put("loginStatus", u.getLoginStatus());
		m.put("userId", u.getUserId());

		getNamedParameterJdbcTemplate().update(sql, m);

	}

	public void delete(User u) {
		this.delete(u.getUserId());

	}

	public void delete(Integer userId) {
		String sql = "DELETE FROM User WHERE userId=?";
		getJdbcTemplate().update(sql, userId);

	}

	public User findById(Integer userId) {

		String sql = "SELECT userId,name,phone,email,address,loginName,role,loginStatus " + "FROM user WHERE userId=?";
		User u = getJdbcTemplate().queryForObject(sql, new UserRowMapper(), userId);

		return u;

	}

	
	
	
	
	
	public List<User> findAll() {
		String sql = "SELECT userId,name,phone,email,address,loginName,role,loginStatus " + "FROM user";
	
		List<User> users= getJdbcTemplate().query(sql,new UserRowMapper());
	return users;
	}

	
public List<User> findByProperty(String propName, Object propValue) {
		
		
	String sql = "SELECT userId,name,phone,email,address,loginName,role,loginStatus " + "FROM user WHERE "+propName+"=?";
	
		
		return getJdbcTemplate().query(sql,new UserRowMapper(),propValue);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
