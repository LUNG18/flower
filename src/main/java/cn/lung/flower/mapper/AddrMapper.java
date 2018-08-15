package cn.lung.flower.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.lung.flower.pojo.AddrInfo;

public interface AddrMapper {

	
//	@Insert("insert into addrinfo values (null,#{uid},#{aname},#{azipcode},#{atel},#{aaddr},#{aemail},#{atime})")
//	public void add(AddrInfo addrInfo);

	@Select("select * from addrinfo where uid = #{uid} limit 0,10")
	public List<AddrInfo> getAddrByUid(int uid);
}
