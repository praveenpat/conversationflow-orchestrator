package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class TextBlock extends CardElement{
	
	private String text;
	
	private String color;
	
	private String horizontalAlignment;
	
	private boolean isSubtle;
	
	private int maxLines;
	
	private String size;
	
	private String weight;
	
	private boolean wrap;
	
	

	public TextBlock() {
		super();
		this.setType(AdaptiveUiConstants.CARD.TEXT_BLOCK);
	}
	
	

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHorizontalAlignment() {
		return horizontalAlignment;
	}

	public void setHorizontalAlignment(String horizontalAlignment) {
		this.horizontalAlignment = horizontalAlignment;
	}

	public boolean isSubtle() {
		return isSubtle;
	}

	public void setSubtle(boolean isSubtle) {
		this.isSubtle = isSubtle;
	}

	public int getMaxLines() {
		return maxLines;
	}

	public void setMaxLines(int maxLines) {
		this.maxLines = maxLines;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public boolean isWrap() {
		return wrap;
	}

	public void setWrap(boolean wrap) {
		this.wrap = wrap;
	}
	
	
	

}
