package com.candice.hlj;

import org.junit.Test;

public class ParamChangeable {
	
	
	@Test
	public void testSum(){
		sum(1,2,3,4,5,6);
	}
	public void sum(int ...nums){
		//�ɱ�������Ե�����������
		int sum = 0;
		for(int num : nums){
			sum += num;
		}
		System.out.println(sum);
	}
}
