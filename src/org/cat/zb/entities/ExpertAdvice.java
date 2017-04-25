package org.cat.zb.entities;

public class ExpertAdvice {
	private int advice_id;
	private double temp_max;
	private double temp_min;
	private double hum_max;
	private double hum_min;
	private double co2_max;
	private double co2_min;
	private double light_max;
	private double light_min;
	private double fert_max;
	private double fert_min;
	public ExpertAdvice(int advice_id, double temp_max, double temp_min, double hum_max, double hum_min, double co2_max,
			double co2_min, double light_max, double light_min, double fert_max, double fert_min) {
		super();
		this.advice_id = advice_id;
		this.temp_max = temp_max;
		this.temp_min = temp_min;
		this.hum_max = hum_max;
		this.hum_min = hum_min;
		this.co2_max = co2_max;
		this.co2_min = co2_min;
		this.light_max = light_max;
		this.light_min = light_min;
		this.fert_max = fert_max;
		this.fert_min = fert_min;
	}
	public ExpertAdvice() {
		super();
	}
	public int getAdvice_id() {
		return advice_id;
	}
	public void setAdvice_id(int advice_id) {
		this.advice_id = advice_id;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getHum_max() {
		return hum_max;
	}
	public void setHum_max(double hum_max) {
		this.hum_max = hum_max;
	}
	public double getHum_min() {
		return hum_min;
	}
	public void setHum_min(double hum_min) {
		this.hum_min = hum_min;
	}
	public double getCo2_max() {
		return co2_max;
	}
	public void setCo2_max(double co2_max) {
		this.co2_max = co2_max;
	}
	public double getCo2_min() {
		return co2_min;
	}
	public void setCo2_min(double co2_min) {
		this.co2_min = co2_min;
	}
	public double getLight_max() {
		return light_max;
	}
	public void setLight_max(double light_max) {
		this.light_max = light_max;
	}
	public double getLight_min() {
		return light_min;
	}
	public void setLight_min(double light_min) {
		this.light_min = light_min;
	}
	public double getFert_max() {
		return fert_max;
	}
	public void setFert_max(double fert_max) {
		this.fert_max = fert_max;
	}
	public double getFert_min() {
		return fert_min;
	}
	public void setFert_min(double fert_min) {
		this.fert_min = fert_min;
	}
	@Override
	public String toString() {
		return "ExpertAdvice [advice_id=" + advice_id + ", temp_max=" + temp_max + ", temp_min=" + temp_min
				+ ", hum_max=" + hum_max + ", hum_min=" + hum_min + ", co2_max=" + co2_max + ", co2_min=" + co2_min
				+ ", light_max=" + light_max + ", light_min=" + light_min + ", fert_max=" + fert_max + ", fert_min="
				+ fert_min + "]";
	}
	
	
}
