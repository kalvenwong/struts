package com.action;

import java.util.HashMap;
import java.util.Map;

import com.biz.HouseBiz;
import com.biz.impl.HouseBizImpl;
import com.opensymphony.xwork2.ActionSupport;

public class HouseAction extends ActionSupport {
		private int page;   //页码
	    private int rows;   // 每页记录数(pageSize)
	    private Map<String, Object> result = new HashMap<String, Object>();
	    private String title;//模糊查询框
	    private int id;//房屋id
	    //8.10 addd
	    HouseBiz hb= new HouseBizImpl();

	    /**
	     * 查询分页房间信息
	     * @return
	     */
	    public String listHouse(){
	    	try {
	    		result=hb.findAllHouseByPage(page, rows,title);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	
	    	return SUCCESS;
	    }
	    public String deleteHouse(){
	    	try {
				hb.deleteHouse(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	return SUCCESS;
	    }
		
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public int getRows() {
			return rows;
		}
		public void setRows(int rows) {
			this.rows = rows;
		}
		public Map<String, Object> getResult() {
			return result;
		}
		public void setResult(Map<String, Object> result) {
			this.result = result;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	
		
}
