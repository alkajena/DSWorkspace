package com.alka;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/Display")
public class AddController {
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.CREATED)
	public ModelAndView add(HttpServletRequest request/*,@RequestBody Student s,@RequestParam(required=false) String roll*/){
		
		
		
		/*int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int z=i+j;*/
		List<Student> list=new ArrayList();
		Student s1=new Student();
		Student s2=new Student();
		
		/*s1.setId(s.getId());
		s1.setName(s.getName());
		s1.setRoll(roll);
		
		s2.setId(s.getId());
		s2.setName(s.getName());
		s2.setRoll(roll);
		
		list.add(s1);
		list.add(s2);
		
		ModelAndView mv=new ModelAndView();
		//mv.addObject("result", s);
		mv.addObject("display.jsp");*/
		
		//return mv;
		ModelAndView mv=new ModelAndView();
		mv.addObject("result", 30);
		mv.addObject("Display.jsp");
		
		return mv;
	}
}
