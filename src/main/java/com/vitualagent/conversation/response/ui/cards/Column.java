package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.Action;
import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class Column extends CardElement{
	
	private CardElement[] items;
	private Action selectAction;
	private String style;
	private String width;
	
	
	public Column() {
		super();
		this.setType(AdaptiveUiConstants.CARD.COLUMN);
	}
	public CardElement[] getItems() {
		return items;
	}
	public void setItems(CardElement[] items) {
		this.items = items;
	}
	public Action getSelectAction() {
		return selectAction;
	}
	public void setSelectAction(Action selectAction) {
		this.selectAction = selectAction;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	
	

}
