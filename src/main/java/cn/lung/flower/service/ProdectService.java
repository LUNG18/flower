package cn.lung.flower.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lung.flower.mapper.ProdectMapper;
import cn.lung.flower.pojo.Prodect;


@Service
public class ProdectService {

	@Resource
	private ProdectMapper pm;

	public List<Prodect> getPlist() {
		
		return pm.getPlist();
	}
	
	
}
