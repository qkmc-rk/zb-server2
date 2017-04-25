package org.cat.zb.handlers;

import java.io.IOException;
import java.util.List;

import org.cat.zb.entities.User;
import org.cat.zb.service.UserService;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestHandler {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/helloWorld.html")
	public String getUser(){
		System.out.println("fuck the world");
		return "success";
	}

	@ResponseBody
	@RequestMapping("/userList.html")
	public String userlist() throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		List<User> list =  userService.getAllUsers();
		String users = "";
		/*for(int i=0; i<list.size();i++){
			users += mapper.writeValueAsString(list.get(i));
		}*/
		users = mapper.writeValueAsString(list);
		return users;
	}
	
	@RequestMapping("testModel.do")
	public String testModel(Model model){
		return "redirect:/testModel";
	}
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
