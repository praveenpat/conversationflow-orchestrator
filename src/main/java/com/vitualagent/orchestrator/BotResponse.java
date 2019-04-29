package com.vitualagent.orchestrator;

import com.vitualagent.conversation.response.ui.Action;

public class BotResponse {
	

	String fulfillmentText;
	
	Action[] actions;
	

	public BotResponse() {
		super();
		
	}

	public Action[] getActions() {
		return actions;
	}


	public void setActions(Action[] actions) {
		this.actions = actions;
	}


	

	public BotResponse(String fulfillmentText) {
		super();
		this.fulfillmentText = fulfillmentText;
	}

	public String getFulfillmentText() {
		return fulfillmentText;
	}

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	

}
