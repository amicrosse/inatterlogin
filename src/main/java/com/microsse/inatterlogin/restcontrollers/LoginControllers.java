/**
 * 
 */
package com.microsse.inatterlogin.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microsse.inatterlogin.entities.AgentTransit;
import com.microsse.inatterlogin.loginService.LoginService;

/**
 * @author Microsse
 *
 */
@RestController
public class LoginControllers {

	@Autowired
	LoginService service;
	
	@RequestMapping(method = RequestMethod.POST, value="/login")
	public boolean login(@RequestBody AgentTransit login) {
		System.out.println(login.getUsername());
		return this.service.login(login);
	}	
}
