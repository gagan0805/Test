package com.jspiders.spring.userManagement.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.spring.userManagement.component.User;

@Repository
public class UserRepository {
	
	@Autowired
	private User user1;

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}
	
	public void userDetails()
	{
		user1.setUserId(101);
		user1.setUserName("Nandan");
		user1.setUserContact(9876543280l);
		
		System.out.println("User: " + user1.getUserId()+"  "+
									  user1.getUserName()+"  "+
								      user1.getUserContact());
	}
	
	public void hibernateInteraction()
	{
		User u1 = new User();
    	u1.setUserId(101);
		u1.setUserName("Nandan");
		u1.setUserContact(9876543280l);
    
    	Configuration cfg = new Configuration().configure().
    										addAnnotatedClass(User.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	session.save(u1);
    	
    	transaction.commit();
    	session.close();
	}
}
