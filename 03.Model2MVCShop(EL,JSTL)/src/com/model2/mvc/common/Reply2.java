package com.model2.mvc.common;

import java.util.Date;

public class Reply2 {
	
	//Field
	int replyNo;
	String user;
	int product;
	int ref;
	Date date;
	String comment;
	int depth;
	
	public Reply2() {
	}
	public Reply2(int replyNo, String user, int product, int ref, Date date, String comment, int depth) {
		super();
		this.replyNo = replyNo;
		this.user = user;
		this.product = product;
		this.ref = ref;
		this.date = date;
		this.comment = comment;
		this.depth = depth;
	}


	public int getReplyNo() {
		return replyNo;
	}


	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public int getProduct() {
		return product;
	}


	public void setProduct(int product) {
		this.product = product;
	}


	public int getRef() {
		return ref;
	}


	public void setRef(int ref) {
		this.ref = ref;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}
	

	public int getDepth() {
		return depth;
	}


	public void setDepth(int depth) {
		this.depth = depth;
	}



	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", user=" + user + ", product=" + product+ ", ref=" + ref + ", date="
				+ date + ", comment=" + comment + "]";
	}
	
}
