package cn.lung.flower.controller;

import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

	@RequestMapping("image")
	public String getImage(String image){
		if(image != null){
			try {
				System.out.println(image);
				BASE64Decoder decoder = new BASE64Decoder();
				byte[] bytes = decoder.decodeBuffer(image);
				for (int i = 0; i < bytes.length; ++i) {
	                if (bytes[i] < 0) {// 调整异常数据
	                    bytes[i] += 256;
	                }
	            }
				OutputStream out = new FileOutputStream("d:/lung/test.jpg");
				out.write(bytes);
				out.flush();
				out.close();
				return "ok";
			} catch (Exception e) {
				e.printStackTrace();
				return "not";
			}
		}
		return "not";
	}

	@RequestMapping("info")
	public void info(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sequence", "0001");
		map.put("date", "2018/01/04");
		map.put("chetaihao", "1#");
		map.put("productName", "产品名称");
		map.put("specification", "规格");
		map.put("memo", "备注");
		map.put("inspectRecordBizList", "一个list");

		HSSFWorkbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("测试表");
		Row row = sheet.createRow(0);
		int i = 0;
		for(String key : map.keySet()){
			Cell cell = row.createCell(i);
			cell.setCellValue((String) map.get(key));
			i++;
		}
		OutputStream fos = null;
		try {
			fos = response.getOutputStream();
			String userAgent = request.getHeader("USER-AGENT");
			String fileName = "test";
			try {
				if(StringUtils.contains(userAgent, "Mozilla")){
					fileName = new String(fileName.getBytes(), "ISO8859-1");
				}else {
					fileName = URLEncoder.encode(fileName, "utf8");
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/vnd.ms-excel;charset=utf-8");// 设置contentType为excel格式
			response.setHeader("Content-Disposition", "Attachment;Filename="+ fileName+".xls");
			wb.write(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
