/**
 * 
 */
package com.microsse.inatterlogin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Microsse
 *
 */
@Entity(name = "Agent")
public class AgentTransit implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "a_id", nullable = false)
	private Long id;
	
	@Column(name = "a_first_name", nullable = false, length = 30)
	private String fist_name;
	
	@Column(name = "a_last_name", nullable = false, length = 30)
	private String last_name;
	
	@Column(name = "a_username", nullable = false, length = 30)
	private String username;
	
	@Column(name = "a_passwd", nullable = false, length = 128)
	private String passwd;
	
	@Column(name = "a_signature")
	private String signature;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFist_name() {
		return fist_name;
	}
	public void setFist_name(String fist_name) {
		this.fist_name = fist_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
