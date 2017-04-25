package org.cat.zb.entities;

import java.util.Date;

public class Hum {
	private int hum_id;
	private Date date_time;
	private double hum;
	public int getHum_id() {
		return hum_id;
	}
	public void setHum_id(int hum_id) {
		this.hum_id = hum_id;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public double getHum() {
		return hum;
	}
	public void setHum(double hum) {
		this.hum = hum;
	}
	public Hum(int hum_id, Date date_time, double hum) {
		super();
		this.hum_id = hum_id;
		this.date_time = date_time;
		this.hum = hum;
	}
	public Hum() {
		super();
	}
	@Override
	public String toString() {
		return "Hum [hum_id=" + hum_id + ", hum=" + hum + "]";
	}
	
	
}
