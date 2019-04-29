package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class InputChoiceSet extends CardElement{
	
	private InputChoice[] choices;
	private boolean isMultiSelect;
	private String style;
	private String value;
	
	
	
	public InputChoiceSet() {
		super();
		this.setType(AdaptiveUiConstants.CARD.INPUT_CHOICESET);
	}
	
	public InputChoice[] getChoices() {
		return choices;
	}
	public void setChoices(InputChoice[] choices) {
		this.choices = choices;
	}
	public boolean isMultiSelect() {
		return isMultiSelect;
	}
	public void setMultiSelect(boolean isMultiSelect) {
		this.isMultiSelect = isMultiSelect;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	

}
