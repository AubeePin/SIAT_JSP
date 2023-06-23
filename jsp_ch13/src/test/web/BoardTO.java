package test.web;

import java.security.Timestamp;

public class BoardTO {
	private int num;
	private String author ;
	private String email;
	private String title;
	private String content;
	private String passwd;
	private Timestamp writeday;
	private int readcnt;
	private int rep_root;
	private int rep_step;
	private int rep_lndent;
	
	public BoardTO(int num, String author, String email, String title, String content, String passwd, Timestamp writeday, int readcnt, int rep_root, int rep_step, int rep_lndent) {
		this.num=num;
		this.author=author;
		this.email=email;
		this.title=title;
		this.content=content;
		this.passwd=passwd;
		this.writeday=writeday;
		this.readcnt=readcnt;
		this.rep_root=rep_root;
		this.rep_step=rep_step;
		this.rep_lndent=rep_lndent;
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Timestamp getWriteday() {
		return writeday;
	}

	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}

	public int getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}

	public int getRep_root() {
		return rep_root;
	}

	public void setRep_root(int rep_root) {
		this.rep_root = rep_root;
	}

	public int getRep_step() {
		return rep_step;
	}

	public void setRep_step(int rep_step) {
		this.rep_step = rep_step;
	}

	public int getRep_lndent() {
		return rep_lndent;
	}

	public void setRep_lndent(int rep_lndent) {
		this.rep_lndent = rep_lndent;
	}

	@Override
	public String toString() {
		return "BoardTO [num=" + num + ", author=" + author + ", email=" + email + ", title=" + title + ", content="
				+ content + ", passwd=" + passwd + ", writeday=" + writeday + ", readcnt=" + readcnt + ", rep_root="
				+ rep_root + ", rep_step=" + rep_step + ", rep_lndent=" + rep_lndent + "]";
	}
}
