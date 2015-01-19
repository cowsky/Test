package com.candice.hlj;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;

/**
 * ����Excel�ĵ�
 * @author liuqiang
 *
 */
public class CreateXL {

	//excel�ļ�Ҫ��ŵ�λ��
	public static String outputFile = "D:/test.xls";
	public static void main(String[] args) throws IOException {
		//�����µ�excel������
		HSSFWorkbook  workbook = new HSSFWorkbook();
		//��Excel���������½�һ����������Ϊȱʡֵ
		//��Ҫ�½�һ��Ϊ��Ч��ָ�ꡱ�Ĺ����������Ϊ
		//HSSFSheet sheet = workbook.createSheet("Ч��ָ��");
		HSSFSheet sheet = workbook.createSheet();
		//������0��λ�ô����У���˵��У�
		HSSFRow row = sheet.createRow((short)0);
		//������0��λ�ô�����Ԫ�����϶ˣ�
		HSSFCell cell = row.createCell((short)0);
		//���嵥Ԫ�������Ϊ�ַ���
		cell.setCellType(HSSFCell.CELL_TYPE_STRING);
		//�ڵ�Ԫ��������һЩ����
		cell.setCellValue("����ֵ");
		//�½�һ������ļ�
		FileOutputStream out = new FileOutputStream(outputFile);
		//����Ӧ��Excel����������
		workbook.write(out);
		out.flush();
		//�����������ر��ļ�
		out.close();
		System.out.println("�ļ�����");
	}
}
