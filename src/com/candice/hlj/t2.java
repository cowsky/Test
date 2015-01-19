package com.candice.hlj;

public class t2 {
	static {
		int x = 6;
	}
    static int x=3,y;
    public static void mymethod(){
    	y = x++ + ++x;
    	System.out.println("mymethodx:"+x);
    	System.out.println("mymethody:"+y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x--;
		System.out.println("mainx:"+x);
		mymethod();
		System.out.println(x +y++ +x);
	}

}
