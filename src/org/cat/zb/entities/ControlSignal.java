package org.cat.zb.entities;

public class ControlSignal {
	private int control_id;
	private boolean fan_open;
	private boolean humer_open;
	//µÆÅÝ´ò¿ª
	private boolean bomb_open;
	
	private boolean CO2er_open;
	private boolean fert_open;
	public ControlSignal() {}
	public ControlSignal(int control_id, boolean fan_open, boolean humer_open, boolean bomb_open, boolean cO2er_open,
			boolean fert_open) {
		super();
		this.control_id = control_id;
		this.fan_open = fan_open;
		this.humer_open = humer_open;
		this.bomb_open = bomb_open;
		CO2er_open = cO2er_open;
		this.fert_open = fert_open;
	}
	public int getControl_id() {
		return control_id;
	}
	public void setControl_id(int control_id) {
		this.control_id = control_id;
	}
	public boolean isFan_open() {
		return fan_open;
	}
	public void setFan_open(boolean fan_open) {
		this.fan_open = fan_open;
	}
	public boolean isHumer_open() {
		return humer_open;
	}
	public void setHumer_open(boolean humer_open) {
		this.humer_open = humer_open;
	}
	public boolean isBomb_open() {
		return bomb_open;
	}
	public void setBomb_open(boolean bomb_open) {
		this.bomb_open = bomb_open;
	}
	public boolean isCO2er_open() {
		return CO2er_open;
	}
	public void setCO2er_open(boolean cO2er_open) {
		CO2er_open = cO2er_open;
	}
	public boolean isFert_open() {
		return fert_open;
	}
	public void setFert_open(boolean fert_open) {
		this.fert_open = fert_open;
	}
	@Override
	public String toString() {
		return "ControlSignal [control_id=" + control_id + ", fan_open=" + fan_open + ", humer_open=" + humer_open
				+ ", bomb_open=" + bomb_open + ", CO2er_open=" + CO2er_open + ", fert_open=" + fert_open + "]";
	}
	
	
}
