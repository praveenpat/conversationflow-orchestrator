package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class InputToggle extends CardElement{
	
	private String title;
	private String value;
	private String valueOff;
	private String valueOn;
	
	
	public InputToggle() {
		super();
		this.setType(AdaptiveUiConstants.CARD.INPUT_TOGGLE);
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
	public String getValueOff() {
		return valueOff;
	}
	public void setValueOff(String valueOff) {
		this.valueOff = valueOff;
	}
	public String getValueOn() {
		return valueOn;
	}
	public void setValueOn(String valueOn) {
		this.valueOn = valueOn;
	}
	
	

}
