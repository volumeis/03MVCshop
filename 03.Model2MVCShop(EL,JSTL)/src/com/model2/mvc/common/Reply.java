package com.model2.mvc.common;

import java.sql.Date;


import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.domain.User;

public class Reply {
	
	//Field
	int replyNo;
	User user;
	Product product;
	int ref;
	Date date;
	String comment;
	
	public Reply() {
	}
	public Reply(int replyNo, User user, Product product, int ref, Date date, String comment) {
		super();
		this.replyNo = replyNo;
		this.user = user;
		this.product = product;
		this.ref = ref;
		this.date = date;
		this.comment = comment;
	}


	public int getReplyNo() {
		return replyNo;
	}


	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
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


	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", user=" + user + ", product=" + product+ ", ref=" + ref + ", date="
				+ date + ", comment=" + comment + "]";
	}
	
}
