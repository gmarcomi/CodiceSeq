package com.sirius.sequenziatore.server.controller.common;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sirius.sequenziatore.server.model.User;
import com.sirius.sequenziatore.server.service.LoginService;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	@Autowired
	LoginService loginService;
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String receiveRequest(@RequestBody User toBeLogged){
		int result=loginService.checkLogin(toBeLogged);
		if(result==0)
			throw new IllegalStateException("Credenziali non corrette");
		if(result==1)
			return "User";
		if(result==2)
			return "ProcessOwner";
		return null;
	}
	@ExceptionHandler(IllegalStateException.class)
	@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY,   reason = "Errore credenziali non corrette")
	public void handleException3(IllegalStateException ex, HttpServletResponse response) throws IOException{
		//invia al client un errore 422
	}
}