package in.ezeon.capp.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import in.ezeon.capp.dao.BaseDAO;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.domain.User;
import in.ezeon.capp.exception.UserBlockedException;
import in.ezeon.capp.rm.UserRowMapper;

@Service
public class UserServiceImpl extends BaseDAO implements UserService {

	@Autowired
	private UserDAO userDAO;

	// 1
	public void register(User u) {

		userDAO.save(u);

	}

	// 2
	public User login(String loginName, String password) throws UserBlockedException {

		String sql = "SELECT userId,name,phone,email,address,role,loginStatus,loginName FROM USER WHERE loginName=:ln AND password=:pw";
		Map m = new HashMap();
		m.put("ln", loginName);
		m.put("pw", password);
		try {
			User u = getNamedParameterJdbcTemplate().queryForObject(sql, m, new UserRowMapper());
			if (u.getLoginStatus().equals(UserService.LOGIN_STATUS_BLOCKED)) {
				throw new UserBlockedException("Your Account has been Blocked, Contact to Admin");
			}
			else {
				return u;
			}
			
		} catch (EmptyResultDataAccessException ex) {
			return null;
		}

	}

	
	public void changeLoginStatus(Integer userId, Integer loginStatus) {
		// TODO Auto-generated method stub

	}

	
    public List<User> getUserList() {
        return userDAO.findByProperty("role", UserService.ROLE_USER);
    }

	public Boolean isUsernameExist(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
   