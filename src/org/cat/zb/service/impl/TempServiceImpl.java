package org.cat.zb.service.impl;

import java.util.List;

import org.cat.zb.dao.TempDao;
import org.cat.zb.entities.Temp;
import org.cat.zb.service.TempService;

public class TempServiceImpl implements TempService{

	
	private TempDao tempDao;
	
	@Override
	public void saveOneTemp(Temp temp) {
		tempDao.saveTemp(temp);
	}

	@Override
	public List<Temp> getOneHundredRecord() {
		return tempDao.getOneHundredRecord();
	}

	/*
	 * setters and getters
	 * */
	public TempDao getTempDao() {
		return tempDao;
	}

	public void setTempDao(TempDao tempDao) {
		this.tempDao = tempDao;
	}
}
