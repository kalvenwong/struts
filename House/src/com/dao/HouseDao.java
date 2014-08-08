package com.dao;

import java.util.List;

import com.entity.House;

public interface HouseDao {


	/**
	 * 显示全部房屋信息
	 * @return
	 */
	public List<House> findAllHouse()throws Exception;
	
	/**
	 * 通过分页查找房屋信息
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<House> findAllHouseByPage(int pageNo, int pageSize)throws Exception;
	
	/**
	 * 通过条件分页查找房屋信息
	 * @param pageNo
	 * @param pageSize
	 * @param title
	 * @return
	 * @throws Exception
	 */
	public List<House> findAllHouseByPage(int pageNo, int pageSize,String title)throws Exception;
	/**
	 * 根据id删除房屋信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteHouse(Integer id)throws Exception;
}
