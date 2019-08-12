package com.coll.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DBconfigTest {

	 @BeforeClass
	    public static void First()
	    {
	    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    	context.scan("com.coll");
	    	context.refresh();
	    }
	 @Test
	 public void test()
	 {
		 System.out.println("DB Connected");
	 }
}
