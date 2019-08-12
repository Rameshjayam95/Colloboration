package com.coll.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coll.dao.ForumDAO;
import com.coll.model.Forum;

public class ForumDAOTest {

	static ForumDAO forumDAO;
	@SuppressWarnings("resource")
	@BeforeClass
	public static void executefirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.coll");
		context.refresh();
		forumDAO=(ForumDAO)context.getBean("forumDAO");
	}

	@Test
	public void addforumtest() {
		Forum forum=new Forum();
		forum.setForumName("new forum");
		forum.setForumContent("iam create content");
		forum.setCreateDate(new java.util.Date());
		forum.setUsername("issacjoe");
		forum.setStatus("NA");
		assertTrue("problem in adding forum",forumDAO.addForum(forum));
	}
}