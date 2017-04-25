package org.cat.zb.handlers;

import javax.websocket.server.PathParam;

import org.cat.zb.entities.Msg;
import org.cat.zb.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgHandler {
	
	@Autowired
	private MsgService msgService;
	
	@ResponseBody
	@RequestMapping(value = "/getAllMsg.do")
	public String getAllMsg(){
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "deleteMsg.do")
	public String deleteMsgByUserId(@PathParam(value = "rqstuserid")String rqstuserid){
		int thisUserId = Integer.parseInt(rqstuserid);
		msgService.deleteMsgByUserId(thisUserId);
		return "true";
	}
	
	/*
	 * addMsg by user name
	 * 
	 * */
	@ResponseBody
	@RequestMapping("saveMsg.do")
	public String addMsg(@RequestParam("mseg") String mseg,@RequestParam("username") String username){
		Msg msg = new Msg();
		msg.setMsg(mseg);
		msg.setUserName(username);
		msgService.addMsg(msg);
		return "redirect:/messagebox";
	}
	public MsgService getMsgService() {
		return msgService;
	}

	public void setMsgService(MsgService msgService) {
		this.msgService = msgService;
	}
	
}
