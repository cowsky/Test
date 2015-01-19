package com.candice.hlj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


/**
 * 读取Excel文档中的数据
 * @author liuqiang
 *
 */
public class ReadXL {

	//Excel文件的存放位置
	public static String tobeRead = "D:/test.xls";
	public static void main(String[] args) throws IOException {
		//创建对Excel工作薄的引用
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tobeRead));
		//创建对工作表的引用
		HSSFSheet sheet = workbook.getSheet("Sheet0");
		//读取左上端单元
		HSSFRow row = sheet.getRow(0);
		HSSFCell cell = row.getCell(0);
		//输出单元内容
		System.out.println("左上端单元的值为:"+cell.getStringCellValue());
	}
}
