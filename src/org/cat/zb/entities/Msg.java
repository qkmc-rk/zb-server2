package org.cat.zb.entities;

public class Msg {
	private int msg_id;
	private String userName;
	private String msg;
	
	/*
	 * getters and setters
	 * */
	public int getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	/*
	 * constructors
	 * */
	public Msg(int msg_id, String userName, String msg) {
		super();
		this.msg_id = msg_id;
		this.userName = userName;
		this.msg = msg;
	}
	public Msg() {}
	
	/*
	 * toString()
	 * */
	@Override
	public String toString() {
		return "Msg [msg_id=" + msg_id + ", userName=" + userName + ", msg=" + msg + "]";
	}
}
