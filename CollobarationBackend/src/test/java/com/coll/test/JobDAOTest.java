package com.coll.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coll.dao.JobDAO;
import com.coll.model.Job;

public class JobDAOTest {

	static JobDAO jobDAO;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void executefirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.coll");
		context.refresh();
		jobDAO=(JobDAO)context.getBean("jobDAO");
	}
	
	@Test
	public void addjobtest() {
		Job job=new Job();
		job.setJobDesignation("illistrator");
		job.setCompanyName("P3 airbus");
	    job.setCTC(400000);
	    job.setJobLocation("Bangalore");
	    job.setLastDate(new java.util.Date(2019,07,20));
	    job.setSkills("java");
	    assertTrue("problem in adding job",jobDAO.addJob(job));
	}

	}