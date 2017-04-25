package org.cat.zb.service;

import java.util.List;

import org.cat.zb.entities.Temp;

public interface TempService {
	/*
	 * @method save one temp record
	 * @return null
	 * */
	void saveOneTemp(Temp temp);
	
	/*
	 * @return list of temp objects
	 * @method getOneHundredRecord
	 * */
	List<Temp> getOneHundredRecord();
}
