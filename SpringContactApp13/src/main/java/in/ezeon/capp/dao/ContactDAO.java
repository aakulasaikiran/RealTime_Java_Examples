package in.ezeon.capp.dao;

import java.util.List;

import in.ezeon.capp.domain.Contact;


public interface ContactDAO {
	public void save(Contact c);
	public void update(Contact c);
	public void delete(Contact c);
	public void delete(Integer contactId);
	public Contact findById(Integer cantactId);
	public List<Contact> findAll(); 
	public List<Contact> findByProperty(String propName,Object propValue);
}
