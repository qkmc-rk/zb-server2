package org.cat.zb.entities;

import java.util.Date;

public class Co2 {
	private int co2_id;
	private Date date_time;
	private double co2;
	public Co2() {}
	public Co2(int co2_id, Date date_time, double co2) {
		super();
		this.co2_id = co2_id;
		this.date_time = date_time;
		this.co2 = co2;
	}
	public int getCo2_id() {
		return co2_id;
	}
	public void setCo2_id(int co2_id) {
		this.co2_id = co2_id;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public double getCo2() {
		return co2;
	}
	public void setCo2(double co2) {
		this.co2 = co2;
	}
	@Override
	public String toString() {
		return "Co2 [co2_id=" + co2_id + ", date_time=" + date_time + ", co2=" + co2 + "]";
	}
	
	
}
