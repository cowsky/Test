package com.lxl.train;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Compare {

	public Map<String, String> grade;//ԭʼ�ȼ�
	public Map<String, String> rank;//������
	
	
	private static Compare instance = null;
	
	public static Compare getInstance(){
		if(instance==null){
			instance = new Compare();
		}
		return instance;
	}
	
	public Compare(){
		init();
	}
	
	public void init(){
		grade = new HashMap<String, String>();
		rank = new HashMap<String, String>();
	}
	
	//��ȡԭʼ�Ա��ļ�
	public void readOriginFile(String Filename){
		File file = new File(Filename);
		String content = null;
		BufferedReader br = null;
		String[] split;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while((content=br.readLine())!=null){
				split = content.split("\\s");
				grade.put(split[2], split[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//��ȡ����ļ�
	public void readResultFile(String Filename){
		File file = new File(Filename);
		String content = null;
		BufferedReader br = null;
		String[] split;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while((content=br.readLine())!=null){
				split = content.split("\\s");
				rank.put(split[2], split[4]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//�ԱȽ��
	public void compare(Writer write){
		StringBuilder content = null;
		for(Iterator<String> iterrs = rank.keySet().iterator();iterrs.hasNext();){
			String name = iterrs.next();
			if(grade.containsKey(name)){
				content = new StringBuilder();
				content.append(name).append("\t").append(rank.get(name)).append("\t").append(grade.get(name)).append("\n");
				try {
					//д���ĵ�
					write.write(content.toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}  
	public void getResult(String originFilename, String resultFilename, String writeFilename){
		readOriginFile(originFilename);
		readResultFile(resultFilename);
		//�Ա�
		BufferedWriter bw = null;
		File file = new File(writeFilename);
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
			//����Ա�
			compare(bw);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String originFilename = "G:/1652.txt"; 
		String resultFilename = "G:/1000.txt";
		String writeFilename = "G:/result.txt";
		Compare.getInstance().getResult(originFilename, resultFilename, writeFilename);
		
	}
}
