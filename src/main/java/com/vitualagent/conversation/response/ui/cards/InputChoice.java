package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class InputChoice {
	
	private String type;
	private String title;
	private String value;
	
	
	
	public InputChoice() {
		super();
		this.setType(AdaptiveUiConstants.CARD.INPUT_CHOICE);
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
