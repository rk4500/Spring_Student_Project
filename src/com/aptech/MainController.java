package com.aptech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aptech.DAO.UserModelDAO;
import com.aptech.model.UserDataModel;
import com.aptech.model.UserLoginModel;
import com.aptech.service.UserLoginModelService;

@Controller
public class MainController {		

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Login() {
		ModelAndView ModAndView = new ModelAndView("Login");	
		UserLoginModel UserLogin = new UserLoginModel();		
		ModAndView.addObject("UserLogin", UserLogin);
		return ModAndView;			
	}
	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public ModelAndView Register() {
		ModelAndView ModAndView = new ModelAndView("Register");
		UserDataModel UserRegData = new UserDataModel();		
		ModAndView.addObject("UserRegData", UserRegData);
		return ModAndView;			
	}
	
	@PostMapping("/SubmitLoginDetails")
	public ModelAndView SubmitLoginDetails(UserLoginModel UserLogin) {
		UserLoginModelService UserLoginMService = new UserLoginModelService();
		UserDataModel UserData = UserLoginMService.verifycredentials(UserLogin);
		if(UserData != null) {
			ModelAndView ModAndViewDisp = new ModelAndView("Home");
			ModAndViewDisp.addObject("UserData", UserData); 
			return ModAndViewDisp;	
		}
		else {
			ModelAndView ModAndViewErr = new ModelAndView("Error");
			return ModAndViewErr;		
		}	
	}
	
	@PostMapping("/SubmitRegistrationDetails")
	public ModelAndView SubmitRegistrationDetails(UserDataModel UserData) {
		UserModelDAO UserRegMDAO = new UserModelDAO();
		UserRegMDAO.CreateUser(UserData);
		ModelAndView ModAndViewDisp = new ModelAndView("Home");
		ModAndViewDisp.addObject("UserData", UserData); 
		return ModAndViewDisp;	
	}
	
}
