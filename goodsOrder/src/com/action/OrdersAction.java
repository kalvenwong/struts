package com.action;

import java.util.ArrayList;
import java.util.List;

import com.entity.Goods;
import com.opensymphony.xwork2.ActionSupport;
import com.service.GoodsService;
import com.service.impl.GoodsServiceImpl;

public class OrdersAction extends ActionSupport {
	 
	private List<Goods> goodsList =new ArrayList<Goods>();//��Ʒ�б�
	private Integer[] gids;//��Ʒid
	private Goods goods;//��Ʒ
	GoodsService gs=new GoodsServiceImpl();
	/**
	 * ��ʾ��Ʒ�б�
	 * @return
	 */
	public String showGoods(){
		//git test
		try {
			 goodsList=gs.findAll();
			 for (Goods g : goodsList) {
				g.getName();
			}
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
	}
	/**
	 * ������Ʒ
	 * @return
	 */
	public String buyGoods(){
		GoodsService gs=new GoodsServiceImpl();
		try {
			if(gids==null){
				return INPUT;
			}
			for (Integer gid : gids) {
				 goods=gs.findById(gid);
				 goodsList.add(goods);
			}
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
	}
	
	/**
	 * ��Ӷ���
	 * @return
	 */
	public String addorder(){
		return null;
	}
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	public Integer[] getGids() {
		return gids;
	}
	public void setGids(Integer[] gids) {
		this.gids = gids;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}

}
