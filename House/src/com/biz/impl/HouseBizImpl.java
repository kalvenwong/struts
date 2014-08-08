package com.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.biz.HouseBiz;
import com.dao.HouseDao;
import com.dao.impl.HouseDaoImpl;
import com.entity.House;

public class HouseBizImpl implements HouseBiz {
	HouseDao hDao = new HouseDaoImpl();

	public Map<String, Object> findAllHouseByPage(int pageNo, int pageSize,String title)
			throws Exception {
		List<House> list;
		// 查询分页方法
		if(title==null){
			list = hDao.findAllHouseByPage(pageNo, pageSize);
		}else{
			list = hDao.findAllHouseByPage(pageNo, pageSize,title);
		}
		
		// 查询所有记录数
		int count = hDao.findAllHouse().size();
		// 封装Map total = 全部记录数　　rows=查询出来的分页数据
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", count);
		map.put("rows", list);
		return map;
	}

	public void deleteHouse(Integer id) throws Exception {
		// TODO Auto-generated method stub
		hDao.deleteHouse(id);
	}

}
