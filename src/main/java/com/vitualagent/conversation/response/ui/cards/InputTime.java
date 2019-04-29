package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class InputTime extends CardElement{
	
	private String max;
	private String min;
	private String placeholder;
	private String value;
	
	
	public InputTime() {
		super();
		this.setType(AdaptiveUiConstants.CARD.INPUT_TIME);
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public String getPlaceholder() {
		return placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
