package com.candice.hlj;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;

/**
 * 创建Excel文档
 * @author liuqiang
 *
 */
public class CreateXL {

	//excel文件要存放的位置
	public static String outputFile = "D:/test.xls";
	public static void main(String[] args) throws IOException {
		//创建新的excel工作薄
		HSSFWorkbook  workbook = new HSSFWorkbook();
		//在Excel工作薄中新建一工作表，其名为缺省值
		//如要新建一名为“效益指标”的工作表，其语句为
		//HSSFSheet sheet = workbook.createSheet("效益指标");
		HSSFSheet sheet = workbook.createSheet();
		//在索引0的位置创建行（最顶端的行）
		HSSFRow row = sheet.createRow((short)0);
		//在索引0的位置创建单元格（左上端）
		HSSFCell cell = row.createCell((short)0);
		//定义单元格的类型为字符串
		cell.setCellType(HSSFCell.CELL_TYPE_STRING);
		//在单元格中输入一些内容
		cell.setCellValue("增加值");
		//新建一输出流文件
		FileOutputStream out = new FileOutputStream(outputFile);
		//把相应的Excel工作簿存盘
		workbook.write(out);
		out.flush();
		//操作结束，关闭文件
		out.close();
		System.out.println("文件生成");
	}
}
