/**
 * 
 */
package com.microsse.inatterlogin.loginServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microsse.inatterlogin.entities.AgentTransit;
import com.microsse.inatterlogin.loginService.LoginService;
import com.microsse.inatterlogin.repository.AgentRepository;

/**
 * @author Microsse
 *
 */

@Component
public class LoginServiceImpl implements LoginService {

	@Autowired
	AgentRepository repository;
	
	@Override
	public boolean login(AgentTransit agent) {
		int x = this.repository.login(agent.getUsername(), agent.getPasswd()).size();
		if(x == 1)
			return true;
		else return false;
	}

}
