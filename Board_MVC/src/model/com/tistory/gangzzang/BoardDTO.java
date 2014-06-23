// BoardDTO.java

package model.com.tistory.gangzzang;

import java.util.Date;

public class BoardDTO {
	private int no; // 글번호
	private String id; // 아이디
	private String pwd; // 비밀번호
	private String title; // 제목
	private String content; // 내용
	private Date regdate; // 작성일
	private int hit; // 조회수
	private int parent; // 글 그룹 번호
	private int sort; // 답글 정렬 번호
	private int tab; // 들여 쓰기

	public BoardDTO() {
		super();
	}

	public BoardDTO(int no, String id, String pwd, String title, String content, Date regdate, int hit, int parent, int sort, int tab) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
		this.parent = parent;
		this.sort = sort;
		this.tab = tab;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getTab() {
		return tab;
	}

	public void setTab(int tab) {
		this.tab = tab;
	}
} // BoardDTO