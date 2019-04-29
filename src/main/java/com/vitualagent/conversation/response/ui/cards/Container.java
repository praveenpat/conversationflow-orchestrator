package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.Action;
import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class Container extends CardElement {
	
	
	private CardElement[] items;
	
	private Action selectAction;
	
	private String style;
	
	private ContentAlignment verticalContentAlignment;

	
	
	public Container() {
		super();
		this.setType(AdaptiveUiConstants.CARD.CONTAINER);
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

	public ContentAlignment getVerticalContentAlignment() {
		return verticalContentAlignment;
	}

	public void setVerticalContentAlignment(ContentAlignment verticalContentAlignment) {
		this.verticalContentAlignment = verticalContentAlignment;
	}
	
	

}
