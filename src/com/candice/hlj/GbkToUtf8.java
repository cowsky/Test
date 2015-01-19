package com.candice.hlj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class GbkToUtf8 {

	public static void main(String[] args) throws IOException {
		File filein = new File("G:/edn_xxx_20000101_0264956.txt");
		File fileout = new File("G:/result1.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileout, true), "utf-8"));
		
		String line = null;
		StringBuilder content = new StringBuilder();
		
		while((line = br.readLine())!=null){
			String iso = new String(line.getBytes("utf-8"),"iso-8859-1");
			String utf8 = new String(iso.getBytes("iso-8859-1"),"utf-8");
			content.append(utf8);
		}
		
		bw.write(content.toString());
		
		br.close();
		bw.close();
		
		System.out.println("ja");
		System.out.println("ja1");
	}
}
