package com.service;

import java.util.List;

import com.entity.Goods;

public interface GoodsService {
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
