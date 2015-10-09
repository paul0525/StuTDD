package com.tdd;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

	@Test
	public void testCreate(){
		
		Student stu = new Student("Jame Dong");
		String name = stu.getName();
		Assert.assertEquals("Jame Dong", name);
	}
}
