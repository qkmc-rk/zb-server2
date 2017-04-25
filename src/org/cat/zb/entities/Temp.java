package org.cat.zb.entities;

import java.util.Date;

public class Temp {
	/*
	 * @temp_id �¶ȵ�ID
	 * @date_time ��ǰʱ��
	 * @temp �¶�
	 * */
	private int temp_id;
	private Date date_time;
	private double temp;
	/*
	 * ���췽��
	 * */
	public Temp(int temp_id, Date date_time, double temp) {
		super();
		this.temp_id = temp_id;
		this.date_time = date_time;
		this.temp = temp;
	}
	public Temp() {}
	
	/*
	 * getter and setter
	 * */
	public int getTemp_id() {
		return temp_id;
	}
	public void setTemp_id(int temp_id) {
		this.temp_id = temp_id;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	/*
	 * toString()����
	 * */
	@Override
	public String toString() {
		return "Temp [temp_id=" + temp_id + ", date_time=" + date_time + ", temp=" + temp + "]";
	}
}
