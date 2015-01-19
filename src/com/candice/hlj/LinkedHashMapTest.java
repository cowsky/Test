package com.candice.hlj;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("zhangsan", 132);
		map.put("lisi", 2323);
		map.put("wangwu", 233333);
		
		for(Iterator<String> iter = map.keySet().iterator();iter.hasNext();){
			System.out.println(map.get(iter.next()));
		}
	}
}
