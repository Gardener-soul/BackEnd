package com.ssafy.board.model.dto;

import java.util.Date;

public class Board {
	private static int no = 1; //클래스 변수
	private int id; //0 - List의 size로 하면 안됨
	private String title;
	private String writer;
	private String content;
	private String regDate; //null
	private int viewCnt; //0
	
	public Board() {
	}

	public Board(String title, String writer, String content) {
		super();
		this.id=no++;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date().toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", viewCnt=" + viewCnt + "]";
	}
	
	
	
}
