package org.cat.zb.service;

import java.util.List;

import org.cat.zb.entities.Msg;

public interface MsgService {
	List<Msg> getAllMsg();
	void deleteMsgByUserId(int userId);
	
	void addMsg(Msg msg);
}
