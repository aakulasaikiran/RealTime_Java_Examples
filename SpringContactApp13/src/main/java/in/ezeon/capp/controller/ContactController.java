package in.ezeon.capp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ezeon.capp.command.LoginCommand;
import in.ezeon.capp.domain.Contact;
import in.ezeon.capp.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactservice;

	@RequestMapping(value = "/user/contact_form")
	public String contactForm(Model m) {
		Contact contact = new Contact();
		m.addAttribute("command", contact);
		return "contact_form";

	}
	
	
	
	
	@RequestMapping("/about")
	public String about(){
	
		
		return "about";
	}

	
	
	@RequestMapping("/home")
	public String home(Model m){
		m.addAttribute("command", new LoginCommand());

		return "index";
	}
	
	
	
	
	@RequestMapping("/home1")
	public String home1(Model m){
		m.addAttribute("command", new LoginCommand());

		return "index";
	}
	
	
	
	
	
	
	
	@RequestMapping("/help")
	public String help(){
	
		
		return "help";
	}

	
	
	

	@RequestMapping(value = "/user/clist")
	public String contactList(Model m, HttpSession session) {
		Integer userId = (Integer) session.getAttribute("userId");
		m.addAttribute("contactList", contactservice.findUserContact(userId));
		// contactservice

		return "clist";

	}

	@RequestMapping(value = "/user/contact_search")
	public String contactSearch(Model m, HttpSession session, @RequestParam("freeText") String freeText) {
		Integer userId = (Integer) session.getAttribute("userId");

		m.addAttribute("contactList", contactservice.findUserContact(userId, freeText));
		// contactservice

		return "clist";

	}

	@RequestMapping(value = "/user/del_contact")
	public String deleteContact(@RequestParam("cid") Integer contactId) {
		contactservice.delete(contactId);
		return "redirect:clist?act=del";
	}

	
	
	
	@RequestMapping(value = "/user/bulk_cdelete")
	public String deleteBulkContact(@RequestParam("cid") Integer[] contactIds) {
		contactservice.delete(contactIds);
		return "redirect:clist?act=dels";
	}
	
	
	
	@RequestMapping(value = "/user/edit_contact")
	public String prepareEditForm(Model m, HttpSession session, @RequestParam("cid") Integer contactId) {
		session.setAttribute("aContactId", contactId);

		Contact c = contactservice.findById(contactId);
		m.addAttribute("command", c);
		return "contact_form";
	}

	@RequestMapping(value = "/user/save_contact")
	public String saveOrUpdateContact(@ModelAttribute("command") Contact c, Model m, HttpSession session) {

		Integer cantactId = (Integer) session.getAttribute("aContactId");
		if (cantactId == null) {
			try {
				Integer userId = (Integer) session.getAttribute("userId");
				c.setUserId(userId);
				contactservice.save(c);
				return "redirect:clist?act=sv";
			} catch (Exception e) {
				e.printStackTrace();
				m.addAttribute("err", "Fail To Save Contact");
				return "contact_form";
			}
		} else {
			try {

				c.setContactId(cantactId);
				contactservice.update(c);
				return "redirect:clist?act=ed";
			} catch (Exception e) {
				e.printStackTrace();
				m.addAttribute("err", "Fail To Edit Contact");
				return "contact_form";
			}
		}
	}

}
