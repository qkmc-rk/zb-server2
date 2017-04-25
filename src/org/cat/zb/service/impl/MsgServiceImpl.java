package org.cat.zb.service.impl;

import java.util.List;

import org.cat.zb.dao.MsgDao;
import org.cat.zb.entities.Msg;
import org.cat.zb.service.MsgService;

public class MsgServiceImpl implements MsgService{

	private MsgDao msgDao;
	
	@Override
	public List<Msg> getAllMsg() {
		return msgDao.getAllMsg();
	}

	@Override
	public void deleteMsgByUserId(int userId) {
		msgDao.deleteMsgByUserId(userId);
	}
	
	public MsgDao getMsgDao() {
		return msgDao;
	}
	public void setMsgDao(MsgDao msgDao) {
		this.msgDao = msgDao;
	}

	@Override
	public void addMsg(Msg msg) {
		msgDao.addMsg(msg);
	}
}
