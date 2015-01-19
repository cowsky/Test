package com.lxl.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * ∑¥…‰∑Ω∑®
 * @author liuqiang
 *
 */
public class demo1 {
	
	
	@Test
	public void test1() throws Exception{
		Class clazz = Class.forName("com.lxl.reflect.Student");
		Student student = (Student) clazz.newInstance();
		//Student student = new Student();
		Method method = clazz.getMethod("print", String.class);
		method.invoke(student, "zhangsan");
		
	}
	
	
	@Test
	public void test2() throws Exception{
		Class clazz = Class.forName("com.lxl.reflect.Student");
		Student student = (Student) clazz.newInstance();
		Field field = clazz.getDeclaredField("address");
		field.setAccessible(true);
		field.set(student, "wuhan");
		System.out.println(field.get(student));
	}
}
