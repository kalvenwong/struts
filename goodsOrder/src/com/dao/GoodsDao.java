package com.dao;

import java.util.List;

import com.entity.Goods;

public interface GoodsDao {
	/**
	 * ����id������Ʒ
	 * @param id
	 * @return
	 */
	public Goods findById(Integer id)throws Exception;
	/**
	 * ����������Ʒ�б�
	 * @return
	 */
	public List<Goods> findAll()throws Exception;
}
