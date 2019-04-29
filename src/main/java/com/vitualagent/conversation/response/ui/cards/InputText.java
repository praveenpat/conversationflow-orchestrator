package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class InputText extends CardElement{
	
	private boolean isMultiline;
    private int maxLength;
    private String placeholder;
    private String style;
    
    
    
	public InputText() {
		super();
		this.setType(AdaptiveUiConstants.CARD.INPUT_TEXT);
	}
	public boolean isMultiline() {
		return isMultiline;
	}
	public void setMultiline(boolean isMultiline) {
		this.isMultiline = isMultiline;
	}
	public int getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	public String getPlaceholder() {
		return placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
    
    
}
