package com.dao;

import com.entity.OrderItem;

public interface OrderitemDao {
	/**
	 * ���涩����ϸ
	 * @param orderitem
	 */
	public void save(OrderItem orderitem)throws Exception;
	/**
	 * ɾ��������ϸ
	 * @param orderitem
	 */
	public void delete(OrderItem orderitem)throws Exception;
	/**
	 * ����id���Ҷ�����ϸ
	 * @param id
	 * @return
	 */
	public OrderItem findById(Integer id)throws Exception;
}
