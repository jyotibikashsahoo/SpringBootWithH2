/**
 * 
 */
package com.springbootH2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author jyotibikashsahoo
 *
 */
@Entity
public class Chat {
	@Id
	private Long id;
	@Column(name="session_id")
	private String chatSessionId;
	private String type;
	private String agent_mail;
	private String agent_type;
	private String agent_name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChatSessionId() {
		return chatSessionId;
	}
	public void setChatSessionId(String chatSessionId) {
		this.chatSessionId = chatSessionId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAgent_mail() {
		return agent_mail;
	}
	public void setAgent_mail(String agent_mail) {
		this.agent_mail = agent_mail;
	}
	public String getAgent_type() {
		return agent_type;
	}
	public void setAgent_type(String agent_type) {
		this.agent_type = agent_type;
	}
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	/**
	 * @param id
	 * @param chatSessionId
	 * @param type
	 * @param agent_mail
	 * @param agent_type
	 * @param agent_name
	 */
	public Chat(Long id, String chatSessionId, String type, String agent_mail, String agent_type, String agent_name) {
		super();
		this.id = id;
		this.chatSessionId = chatSessionId;
		this.type = type;
		this.agent_mail = agent_mail;
		this.agent_type = agent_type;
		this.agent_name = agent_name;
	}
	/**
	 * 
	 */
	public Chat() {
		super();
	}
	

}
