package com.service;

import com.entity.Orders;

public interface OrdersService {
	/**
	 * ���涩��
	 * @param orders
	 */
	public void save(Orders orders)throws Exception;
	/**
	 * ɾ������
	 * @param orders
	 */
	public void delete(Orders orders)throws Exception;
	/**
	 * ����id���Ҷ���
	 * @param id
	 * @return
	 */
	public Orders findById(Integer id)throws Exception;
}
