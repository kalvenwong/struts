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
		// ��ѯ��ҳ����
		if(title==null){
			list = hDao.findAllHouseByPage(pageNo, pageSize);
		}else{
			list = hDao.findAllHouseByPage(pageNo, pageSize,title);
		}
		
		// ��ѯ���м�¼��
		int count = hDao.findAllHouse().size();
		// ��װMap total = ȫ����¼������rows=��ѯ�����ķ�ҳ����
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
