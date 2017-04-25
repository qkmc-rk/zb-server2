package org.cat.zb.dao;

import java.util.List;

import org.cat.zb.entities.Msg;

public interface MsgDao {
	List<Msg> getAllMsg();
	
	void deleteMsgByUserId(int userId);
	
	void addMsg(Msg msg);
}
