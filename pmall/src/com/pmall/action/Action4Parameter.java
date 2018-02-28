package com.pmall.action;

import org.apache.struts2.ServletActionContext;


public class Action4Parameter extends Action4Service {
	//������Ϣ
	protected String msg;
	
	//����ҳ����������
	protected String sort;
	//��ǰ�����ڵ�webӦ�����ƣ�������ս̳���������tmall_ssh
	protected String contextPath;
	
	//�����ؼ���
	protected String keyword;
	
	//��������
	protected int num;
	
	//�����������ɵĶ�����id
	protected int oiid;
	
	//ͨ�����ﳵѡ�еĶ��������id
	protected int[] oiids;
	
	//����ҳ����ʾ���ܽ��
	protected float total;
	
	
	//�ڽ������۵�ҳ�棬�Ƿ�ֻ��ʾ���ۼ�¼�������ṩ����
	protected boolean showonly;
	

	
	public Action4Parameter(){
		contextPath = ServletActionContext.getServletContext().getContextPath();
	}
	
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}


	public String getKeyword() {
		return keyword;
	}


	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getOiid() {
		return oiid;
	}


	public void setOiid(int oiid) {
		this.oiid = oiid;
	}


	public int[] getOiids() {
		return oiids;
	}


	public void setOiids(int[] oiids) {
		this.oiids = oiids;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public boolean isShowonly() {
		return showonly;
	}


	public void setShowonly(boolean showonly) {
		this.showonly = showonly;
	}



	
	
	
}
