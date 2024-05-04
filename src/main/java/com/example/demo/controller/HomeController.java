package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.EntriesService;
import com.example.demo.service.UserService;
import com.example.demo.entity.DiaryEntries;
import com.example.demo.entity.Users;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private EntriesService entriesservice;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mav=new ModelAndView("home");
		
		return mav;
	}
	
	
	
	
	
	
	@GetMapping("/register")
	public ModelAndView  save() {
		ModelAndView  mav=new ModelAndView();
		mav.addObject("users", new Users());
		mav.setViewName("Registration");
		
		return mav;
	}
	
	@PostMapping("/saveuser")
	public ModelAndView post(Users users) {
		ModelAndView mav=new ModelAndView();
		Users user=userService.save(users);
		
		mav.setViewName("home");
		return mav;
	}
	
	
	
	@PostMapping("/authentication")
	public ModelAndView authentication(@ModelAttribute("users") Users users) {
		ModelAndView mav=new ModelAndView("home");
		
		Users u1=userService.findByuserName(users.getUserName());
		
		
		if(u1!=null && users.getPassword().equals(u1.getPassword())){
			
			mav.setViewName("afterlogin");
			mav.addObject("name", u1.getUserName());
			session.setAttribute("user", u1);
			
			List<DiaryEntries> entry=null;
			try {
				entry=entriesservice.findByUserId(u1.getId());
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			mav.addObject("entrylist",entry);
		}
		mav.addObject("err","Invalid credientials");
		
		return mav;
	}
	
	@GetMapping("/Addentry")
	public ModelAndView add() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("Entry", new DiaryEntries());
		mav.setViewName("AddEntries");
		
		return mav;
	}
	

	@PostMapping("/saveentry")
	public ModelAndView saveEntry(DiaryEntries diaryEntries) {
		ModelAndView mav=new ModelAndView();
		DiaryEntries de=entriesservice.save(diaryEntries);
		Users u1=(Users)session.getAttribute("user");
		
		List<DiaryEntries> entry=null;
		try {
			entry=entriesservice.findByUserId(u1.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("entrylist",entry);
		
		mav.setViewName("afterlogin");
		return mav;
	}
	
	@GetMapping("/viewentry")
	public ModelAndView viewentry(@RequestParam("id") int id) {
		ModelAndView mav=new ModelAndView("viewdiary");
		Users u1=(Users)session.getAttribute("user");
		if(u1==null) {
			mav.setViewName("home");
		}
		
		DiaryEntries de=entriesservice.getById(id);
		mav.addObject("entry", de);
		return mav;
	}
	
	@GetMapping("userhome")
	public ModelAndView userhome() {
		ModelAndView mav=new ModelAndView("afterlogin");
		
		Users u1=(Users)session.getAttribute("user");
		List<DiaryEntries> entry=null;
		try {
			 entry=entriesservice.findByUserId(u1.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("entrylist",entry);
		return mav;
	}
	
	@GetMapping("/updateentry")
	public ModelAndView updateentry(@RequestParam("id") int id) {
		ModelAndView mav=new ModelAndView("updateentry");
		DiaryEntries de=entriesservice.getById(id);
		
		Users u1=(Users)session.getAttribute("user");
		if(u1==null) {
			mav.setViewName("home");
		}
		mav.addObject("entry", de);
		return mav;
		
	}
	@PostMapping("/updatesuccessful")
	public ModelAndView saveEntryupdate(DiaryEntries diaryEntries) {
		ModelAndView mav=new ModelAndView();
		DiaryEntries de=entriesservice.update(diaryEntries);
		Users u1=(Users)session.getAttribute("user");
		
		List<DiaryEntries> entry=null;
		try {
			entry=entriesservice.findByUserId(u1.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("entrylist",entry);
		
		mav.setViewName("afterlogin");
		return mav;
	}
	
	@GetMapping("/deleteentry")
	public ModelAndView deleteentry(@RequestParam("id") int id) {
		ModelAndView mav=new ModelAndView("afterlogin");
		DiaryEntries de=entriesservice.getById(id);
		entriesservice.delete(de);
		
        Users u1=(Users)session.getAttribute("user");
       
		if(u1==null) {
			mav.setViewName("home");
		}
		
		List<DiaryEntries> entry=null;
		try {
			entry=entriesservice.findByUserId(u1.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("entrylist",entry);
		
		return mav;
	}	
	
	@GetMapping("/signout")
	public ModelAndView signout() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("home");
		session.invalidate();
		return mav;
	}

}
