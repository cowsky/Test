package com.lxl.train;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindNoExiteFileName {
	
	/**
	 * 
	 * @param sorceFilename 9.txt
	 * @param directionFilename	topic9
	 * @throws IOException 
	 */
	public void findNoExiteFileName(String sorceFilename, String directionFilename) throws IOException{
		File filesorce = new File(sorceFilename);
		File filedirect = new File(directionFilename);
		Map<String,Integer> filename = getFilename(filedirect);
		BufferedReader br = new BufferedReader(new FileReader(filesorce));
		String content = null;
		String[] split = null;
		String name = null;
		while((content=br.readLine())!=null){
			split = content.split("\\s");
			name = split[2];
			if(filename.containsKey(name)){
				filename.put(name, 1);
			}
		}
		
		if(br!=null)
			br.close();
		
		//找出不存在的
		String res = find(filename);
		System.out.println(res);
	}
	
	private Map<String,Integer> getFilename(File filedirect) throws FileNotFoundException{
		Map<String,Integer> filename = new HashMap<String,Integer>();
		String[] names = filedirect.list();
		for(String name : names){
			name = name.substring(0, name.indexOf(".txt"));
			filename.put(name,0);
		}
		return filename;
	}
	
	private String find(Map<String,Integer> map){
		StringBuilder strbuilder = new StringBuilder();
		for(Iterator<String> iter = map.keySet().iterator();iter.hasNext();){
			String key = iter.next();
			if(map.get(key)==0){
				strbuilder.append(key).append("\n");
			}
		}
		return strbuilder.toString();
	}
	public static void main(String[] args) throws IOException {
		String sorceFilename = "G:/9.txt";
		String directionFilename = "G:/topic9";
		new FindNoExiteFileName().findNoExiteFileName(sorceFilename, directionFilename);
	}
}
