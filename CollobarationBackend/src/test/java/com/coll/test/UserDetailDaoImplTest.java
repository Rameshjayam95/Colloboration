package com.coll.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coll.dao.UserDetailDAO;
import com.coll.model.UserDetail;

public class UserDetailDaoImplTest {

	static UserDetailDAO userdetailDAO;
	
	
	@BeforeClass
	public static void executefirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.coll");
		context.refresh();
		userdetailDAO=(UserDetailDAO)context.getBean("userdetailDAO");
	}

	@Test
	public void addusertest() {
		UserDetail user=new UserDetail();
		user.setUsername("ramesh");
		user.setFirstname("Jayam");
		user.setSurname("ramesh");
		user.setPassword("Ramesh12");
		user.setEmailId("rameshjayam95@gmail.com");
		assertTrue("problem in adding user",userdetailDAO.addUser(user));
	}

}
