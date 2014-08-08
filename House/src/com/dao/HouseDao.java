package com.dao;

import java.util.List;

import com.entity.House;

public interface HouseDao {


	/**
	 * ��ʾȫ��������Ϣ
	 * @return
	 */
	public List<House> findAllHouse()throws Exception;
	
	/**
	 * ͨ����ҳ���ҷ�����Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<House> findAllHouseByPage(int pageNo, int pageSize)throws Exception;
	
	/**
	 * ͨ��������ҳ���ҷ�����Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @param title
	 * @return
	 * @throws Exception
	 */
	public List<House> findAllHouseByPage(int pageNo, int pageSize,String title)throws Exception;
	/**
	 * ����idɾ��������Ϣ
	 * @param id
	 * @throws Exception
	 */
	public void deleteHouse(Integer id)throws Exception;
}
