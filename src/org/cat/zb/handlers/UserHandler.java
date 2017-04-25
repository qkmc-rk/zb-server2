package org.cat.zb.handlers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.cat.zb.entities.Msg;
import org.cat.zb.entities.User;
import org.cat.zb.service.MsgService;
import org.cat.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@SessionAttributes(value={"user"})
@Controller
public class UserHandler {
	
	@Autowired
	private UserService userService;
	@Autowired
	private MsgService msgService;
	
	@RequestMapping("index.html")
	public String indeX(){
		return "index";
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public ModelAndView login(@PathParam(value = "username")String username,@PathParam(value="password")String password){
		List<User> list = userService.getAllUsers();
		List<Msg> msg = msgService.getAllMsg();
		//map存放模型
		Map<String, Object> model = new HashMap<String,Object>();
		model.put("msglist", msg);
		for(int i=0; i<list.size();i++){
			if(list.get(i).getUser_name().equals(username) && list.get(i).getUser_password().equals(password)){
				model.put("user", list.get(i));
				return new ModelAndView("messagebox", model);
			}
		}
		return new ModelAndView("error");
	}
	
	@ResponseBody
	@RequestMapping("checkname.do")
	public String checkUser(@PathParam(value = "username") String username){
		List<User> list = userService.getAllUsers();
		for(int i=0; i<list.size();i++){
			if(list.get(i).getUser_name().equals(username))return "true";		//true表示用户名存在
		}
		return "false";					//false代表用户名不存在
	}
	
	@ResponseBody
	@RequestMapping(value = "checkpwd.do", method = RequestMethod.POST)				//密码只能使用POST方式，get方式无安全保障
	public String checkpassword(@PathParam(value = "password") String password){
		List<User> list = userService.getAllUsers();
		for(int i=0; i<list.size();i++){
			if(list.get(i).getUser_password().equals(password)){
				return "true";			//true表示用户名校验通过
			}
		}
		return "false";				//false代表用户名校验失败
	}
	
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public MsgService getMsgService() {
		return msgService;
	}

	public void setMsgService(MsgService msgService) {
		this.msgService = msgService;
	}
}
