package org.cat.zb.entities;

import java.util.Date;

public class Light {
	
	/*
	 * @ light_id 光照强度的id
	 * @ date_time 目前时间
	 * @ light 光照强度
	 * */
	private int light_id;
	private Date date_time;
	private double light;
	
	/*
	 * constructors
	 * */
	public Light() {}
	public Light(int light_id, Date date_time, double light) {
		super();
		this.light_id = light_id;
		this.date_time = date_time;
		this.light = light;
	}
	
	/*
	 * getters and setters
	 * */
	public int getLight_id() {
		return light_id;
	}
	public void setLight_id(int light_id) {
		this.light_id = light_id;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public double getLight() {
		return light;
	}
	public void setLight(double light) {
		this.light = light;
	}
	
	/*
	 * toString()
	 * */
	@Override
	public String toString() {
		return "Light [light_id=" + light_id + ", date_time=" + date_time + ", light=" + light + "]";
	}
	
	
}
