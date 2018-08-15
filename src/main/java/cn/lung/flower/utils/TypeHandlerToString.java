package cn.lung.flower.utils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
@MappedTypes({String[].class})
//@MappedJdbcTypes({JdbcType.VARCHAR})
public class TypeHandlerToString implements TypeHandler<String[]>{

	public void setParameter(PreparedStatement ps, int i, String[] parameter, JdbcType jdbcType) throws SQLException {
		if(parameter == null){
			ps.setNull(i,Types.VARCHAR);
		}else {
			StringBuffer p = new StringBuffer();
			System.out.println(1);
			for (String v : parameter) {
				p = p.append(v).append(",");
				p.deleteCharAt(p.length()-1);
			}
			ps.setString(i, p.toString());
		}
	}

	public String[] getResult(ResultSet rs, String columnName) throws SQLException {
		String columnValue = rs.getString(columnName);  
		System.out.println(2);
        return this.getStringArray(columnValue); 
	}

	public String[] getResult(ResultSet rs, int columnIndex) throws SQLException {
		String columnValue = rs.getString(columnIndex);  
		System.out.println(3);
        return this.getStringArray(columnValue); 
	}

	public String[] getResult(CallableStatement cs, int columnIndex) throws SQLException {
		String columnValue = cs.getString(columnIndex);  
		System.out.println(4);
        return this.getStringArray(columnValue); 
	}

	//抽出代码为一个方法，防止代码重复
	private String[] getStringArray(String columnValue) {  
        if (columnValue == null)  
               return null;  
        return columnValue.split(",");  
 }

}
