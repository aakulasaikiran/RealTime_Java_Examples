package in.ezeon.capp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ezeon.capp.dao.BaseDAO;
import in.ezeon.capp.dao.ContactDAO;
import in.ezeon.capp.domain.Contact;
import in.ezeon.capp.rm.ContactRowMapper;
import in.ezeon.capp.util.StringUtil;

@Service
public class ContactServiceImpl extends BaseDAO implements ContactService {
	@Autowired
	private ContactDAO contactDAO;

	public void save(Contact c) {
		contactDAO.save(c);

	}

	public void update(Contact c) {
		contactDAO.update(c);

	}

	public void delete(Integer contactId) {

		contactDAO.delete(contactId);
	}

	public void delete(Integer[] contactIds) {
		String ids = StringUtil.toCommaSeparatedString(contactIds);

		String sql = "DELETE FROM CONTACT WHERE contactId IN(" + ids + ")";
		getJdbcTemplate().update(sql);
	}

	public List<Contact> findUserContact(Integer userId) {

		return contactDAO.findByProperty("userId", userId);

	}

	public List<Contact> findUserContact(Integer userId, String txt) {

		String sql = "SELECT contactId, userId, name, phone, email, address, remark FROM contact WHERE userId=? AND (name LIKE '%"
				+ txt + "%' OR address LIKE '%" + txt + "%' OR phone LIKE '%" + txt + "%' OR email LIKE '%" + txt
				+ "%' OR remark LIKE '%" + txt + "%')";
		return getJdbcTemplate().query(sql, new ContactRowMapper(), userId);
	}

	public Contact findById(Integer cotactId) {

		return contactDAO.findById(cotactId);

	}

}
