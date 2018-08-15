<%@ page import="java.io.*, sun.misc.BASE64Decoder"%>
<% 
	String result = null;
	try {
		String image = request.getParameter("image");
		if(image != null){
			image = image.substring(image.indexOf(",")+1,image.length()-1);
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] bytes = decoder.decodeBuffer(image);
			for (int i = 0; i < bytes.length; ++i) {
		        if (bytes[i] < 0) {// 调整异常数据
		            bytes[i] += 256;
		        }
		    }
			OutputStream os = new FileOutputStream("d:/lung/test.jpg");
			os.write(bytes);
			os.flush();
			os.close();
			result = "true";
		}else{
			result = "false";
		}
	} catch (Exception e) {
		result = "error";
	}
%>
<%= result %>