package com.ssafy.board.model.dto;

public class SearchCondition {
	private String key = "none";
	private String word;
	private String orderBy = "none";
	private String orderByDir;
	
	public SearchCondition() {
//		this.key="none";
//		this.orderBy="none";
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderByDir() {
		return orderByDir;
	}
	public void setOrderByDir(String orderByDir) {
		this.orderByDir = orderByDir;
	}
	
	
	
}
