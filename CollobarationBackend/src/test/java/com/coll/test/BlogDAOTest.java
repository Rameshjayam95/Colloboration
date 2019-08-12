package com.coll.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coll.dao.BlogDAO;
import com.coll.model.Blog;

public class BlogDAOTest {

static BlogDAO blogDAO;
	
	
	@BeforeClass
	public static void executefirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.coll");
		context.refresh();
		blogDAO=(BlogDAO)context.getBean("blogDAO");
	}
	
	
	@Test
	public void addblogtest() {
		Blog blog=new Blog();
		blog.setBlogName("new blog");
		blog.setBlogContext("third content");
		blog.setCreateDate(new java.util.Date());
		blog.setUsername("issacjoe");
		assertTrue("problem in adding blog",blogDAO.addBlog(blog));
	}

}
