package in.ezeon.capp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import in.ezeon.capp.domain.Contact;
import in.ezeon.capp.rm.ContactRowMapper;

@Repository
public class ContactDAOImpl extends BaseDAO implements ContactDAO {
	// sava
	public void save(Contact c) {

		String sql = "INSERT INTO CONTACT(userId,name,phone,email,address,remark)VALUES(:userId,:name,:phone,:email,:address,:remark)";
		Map m = new HashMap();
		m.put("userId", c.getUserId());
		m.put("name", c.getName());
		m.put("phone", c.getPhone());
		m.put("email", c.getEmail());
		m.put("address", c.getAddress());
		m.put("remark", c.getRemark());
		SqlParameterSource ps = new MapSqlParameterSource(m);
		KeyHolder kh = new GeneratedKeyHolder();
		getNamedParameterJdbcTemplate().update(sql, ps, kh);
		c.setContactId(kh.getKey().intValue());
	}

	// update
	public void update(Contact c) {

		String sql = "UPDATE CONTACT SET name=:name,phone=:phone,email=:email,address=:address,remark=:remark WHERE contactId=:contactId";
		Map m = new HashMap();
		m.put("contactId", c.getContactId());
		m.put("name", c.getName());
		m.put("phone", c.getPhone());
		m.put("email", c.getEmail());
		m.put("address", c.getAddress());
		m.put("remark", c.getRemark());
		getNamedParameterJdbcTemplate().update(sql, m);
	}

	// delete
	public void delete(Contact c) {
		this.delete(c.getContactId());

	}

	// deletebyid
	public void delete(Integer contactId) {

		String sql = "DELETE FROM  CONTACT WHERE contactId=?";
		getJdbcTemplate().update(sql, contactId);
	}

	// findbtid
	public Contact findById(Integer cantactId) {
		String sql = "SELECT contactId, userId, name, phone, email, address, remark FROM contact WHERE contactId=?";
		return getJdbcTemplate().queryForObject(sql, new ContactRowMapper(), cantactId);

	}

	// list
	public List<Contact> findAll() {
		String sql = "SELECT (contactId,userId,name,phone,email,address,remark)FROM CONTACT ";
		return getJdbcTemplate().query(sql, new ContactRowMapper());

	}

	// list
	public List<Contact> findByProperty(String propName, Object propValue) {
		String sql = "SELECT contactId, userId, name, phone, email, address, remark FROM contact WHERE " + propName
				+ "=?";
		return getJdbcTemplate().query(sql, new ContactRowMapper(), propValue);

	}

}
