package com.candice.hlj;

import java.io.UnsupportedEncodingException;

public class t1 {
	public static void main(String[] args){
		String ss = "»ªÁ¢¾ý";
		String s;
		try {
			s = new String(ss.getBytes("iso-8859-1"));
			System.out.println("s:"+s);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
