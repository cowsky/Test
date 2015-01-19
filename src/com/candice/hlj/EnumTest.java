package com.candice.hlj;

import org.junit.Test;

public class EnumTest {

	@Test
	public void testEnum(){
		Grade a = Grade.A;
		System.out.println(a.getValue());
	}
}


enum Grade{
	//A,B,C,D,E�൱�ڶ���
	A("100-90"),
	B("89-80"),
	C("79-70"),
	D("69-60"),
	E("59-0");
	
	private String value;
	
	private Grade(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}