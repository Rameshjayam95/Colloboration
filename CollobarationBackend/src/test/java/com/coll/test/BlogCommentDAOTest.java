package com.coll.test;



import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coll.dao.BlogCommentDAO;
import com.coll.model.BlogComment;

public class BlogCommentDAOTest
{

static BlogCommentDAO blogcommentDAO;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void executefirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.coll");
		context.refresh();
		blogcommentDAO=(BlogCommentDAO)context.getBean("blogcommentDAO");
	}
	@Test
	public void addblogcommenttest() {
		BlogComment blogcomment=new BlogComment();
		blogcomment.setBlogComment("good");
		blogcomment.setCommentDate(new java.util.Date());
		blogcomment.setUsername("issacjoe");
		assertTrue("problem in adding blog comment",blogcommentDAO.addBlogComment(blogcomment));
}
}
