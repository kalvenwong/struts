package com.biz;

import java.util.Map;

public interface HouseBiz {
	
	/**
	 * 通过分页查找房屋信息
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public Map<String,Object> findAllHouseByPage(int pageNo, int pageSize, String title)throws Exception;
	/**
	 * 根据id删除房屋信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteHouse(Integer id)throws Exception;
}
