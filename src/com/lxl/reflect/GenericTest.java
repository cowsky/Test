package com.lxl.reflect;

import org.junit.Test;

public class GenericTest {
	
	@Test
	public void test(){
		int[] array = {1,2,3};
		print("hello");
	}
	
	public <T> void print(T t){
		System.out.println(t);
	}
	public <T> void reverse(T[] array){
		int start = 0;
		int end = array.length-1;
		
		while(start<end){
			T temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
