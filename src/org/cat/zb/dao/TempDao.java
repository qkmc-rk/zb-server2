package org.cat.zb.dao;

import java.util.List;

import org.cat.zb.entities.Temp;

public interface TempDao {
	/*
	 * method: save a temp record
	 * @return null
	 * */
	void saveTemp(Temp temp);
	List<Temp> getOneHundredRecord();
}
