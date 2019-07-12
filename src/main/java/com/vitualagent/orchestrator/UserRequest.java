package com.vitualagent.orchestrator;


import java.util.Map;

public class UserRequest {
	
	
	private String sessionId;
	
	private String userQuery;
	
	private String languageCode;
	
	
	Map<String,Object> parameters;
	
	Map<String,String> channelAttributes;
	
	
	String actionName;
	
	
	
	
	
	

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserQuery() {
		return userQuery;
	}

	public void setUserQuery(String userQuery) {
		this.userQuery = userQuery;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Map<String, String> getChannelAttributes() {
		return channelAttributes;
	}

	public void setChannelAttributes(Map<String, String> channelAttributes) {
		this.channelAttributes = channelAttributes;
	}

	

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	

}
