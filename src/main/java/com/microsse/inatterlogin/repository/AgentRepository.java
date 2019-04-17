/**
 * 
 */
package com.microsse.inatterlogin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.microsse.inatterlogin.entities.AgentTransit;

/**
 * @author Microsse
 *
 */
public interface AgentRepository extends JpaRepository<AgentTransit, Long>{
	
	@Query("select p from Agent p where p.username = ?1 and p.passwd = ?2")
	List<AgentTransit> login(String username, String passwd);
}
