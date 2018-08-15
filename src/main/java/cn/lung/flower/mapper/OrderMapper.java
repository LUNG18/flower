package cn.lung.flower.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.lung.flower.pojo.Order;

public interface OrderMapper {

	
//	@Insert("insert into orders values(null,#{onum},#{},#{ototal},#{},#{ostate},#{otime})")
//	public void insertOrder(Order order);

	@Select("select * from orders where uid = #{uid} limit 0,10")
	public List<Order> getOrderByUid(int uid);
}
