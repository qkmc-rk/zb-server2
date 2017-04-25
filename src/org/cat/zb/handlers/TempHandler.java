package org.cat.zb.handlers;

import java.util.Date;

import javax.websocket.server.PathParam;

import org.cat.zb.entities.Temp;
import org.cat.zb.service.MsgService;
import org.cat.zb.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TempHandler {
	
	@Autowired
	private TempService tempService;
	
	@ResponseBody
	@RequestMapping(value="savetemp.do")
	public String saveTemp(String ruankuntemp){
		System.out.println(ruankuntemp);
		Temp tmp = new Temp();
		tmp.setDate_time(new Date());
		tmp.setTemp(Double.parseDouble(ruankuntemp));
		tempService.saveOneTemp(tmp);
		return "true";
	}
	
	@RequestMapping("getTemp.do")
	public String getOneHundredTemp(){
		ModelAndView mav = new ModelAndView();
		
		return "temp";
	}
	
}
