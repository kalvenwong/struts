package com.biz;

import java.util.Map;

public interface HouseBiz {
	
	/**
	 * ͨ����ҳ���ҷ�����Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public Map<String,Object> findAllHouseByPage(int pageNo, int pageSize, String title)throws Exception;
	/**
	 * ����idɾ��������Ϣ
	 * @param id
	 * @throws Exception
	 */
	public void deleteHouse(Integer id)throws Exception;
}
