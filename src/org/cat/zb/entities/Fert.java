package org.cat.zb.entities;

import java.util.Date;

public class Fert {
	private int fert_id;
	private Date date_time;
	private double hum;
	public Fert(int fert_id, Date date_time, double hum) {
		super();
		this.fert_id = fert_id;
		this.date_time = date_time;
		this.hum = hum;
	}
	public Fert() {
		super();
	}
	public int getFert_id() {
		return fert_id;
	}
	public void setFert_id(int fert_id) {
		this.fert_id = fert_id;
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
	@Override
	public String toString() {
		return "Fert [fert_id=" + fert_id + ", hum=" + hum + "]";
	}
	
	
	
}
