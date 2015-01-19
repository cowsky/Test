package com.candice.hlj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


/**
 * ��ȡExcel�ĵ��е�����
 * @author liuqiang
 *
 */
public class ReadXL {

	//Excel�ļ��Ĵ��λ��
	public static String tobeRead = "D:/test.xls";
	public static void main(String[] args) throws IOException {
		//������Excel������������
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tobeRead));
		//�����Թ����������
		HSSFSheet sheet = workbook.getSheet("Sheet0");
		//��ȡ���϶˵�Ԫ
		HSSFRow row = sheet.getRow(0);
		HSSFCell cell = row.getCell(0);
		//�����Ԫ����
		System.out.println("���϶˵�Ԫ��ֵΪ:"+cell.getStringCellValue());
	}
}
