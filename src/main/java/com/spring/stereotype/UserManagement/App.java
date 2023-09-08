package com.spring.stereotype.UserManagement;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.userManagement.repository.UserRepository;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext bean = new ClassPathXmlApplicationContext("spring.xml");
    	UserRepository urepo = bean.getBean(UserRepository.class);
    	
//    	urepo.userDetails();
    	
    	urepo.hibernateInteraction();
    	
    		
    }
}
