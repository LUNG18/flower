package cn.lung.flower.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.lung.flower.pojo.Prodect;

public interface ProdectMapper {

	@Select("select * from prodect")
	public List<Prodect> getPlist();

}
