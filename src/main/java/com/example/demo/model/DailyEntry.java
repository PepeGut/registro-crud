package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "registro")
public class DailyEntry {
	
	@Id
	private String userId;
	
	private String userName;
	private String date;
	private String punchIn;
	private String punchOut;
	
	
	
	public DailyEntry() {
		super();
	}


	public DailyEntry(String userId, String userName, String date, String punchIn, String punchOut) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.date = date;
		this.punchIn = punchIn;
		this.punchOut = punchOut;
	}

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPunchIn() {
		return punchIn;
	}
	public void setPunchIn(String punchIn) {
		this.punchIn = punchIn;
	}
	public String getPunchOut() {
		return punchOut;
	}
	public void setPunchOut(String punchOut) {
		this.punchOut = punchOut;
	}

}
