package com.vitualagent.orchestrator;


import java.util.Map;

public class UserRequest {
	
	String queryText;
	
	Map<String,Object> parameters;
	
	Map<String,String> channelAttributes;
	
	String conversationId;
	
	String actionName;

	public Map<String, String> getChannelAttributes() {
		return channelAttributes;
	}

	public void setChannelAttributes(Map<String, String> channelAttributes) {
		this.channelAttributes = channelAttributes;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
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

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

}
