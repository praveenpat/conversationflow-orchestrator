package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.Action;
import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class ColumnSet extends CardElement {

	private Column[] columns;
	private Action selectAction;
	
	
	
	public ColumnSet() {
		super();
		this.setType(AdaptiveUiConstants.CARD.COLUMN_SET);
	}
	
	
	public Column[] getColumns() {
		return columns;
	}
	public void setColumns(Column[] columns) {
		this.columns = columns;
	}
	public Action getSelectAction() {
		return selectAction;
	}
	public void setSelectAction(Action selectAction) {
		this.selectAction = selectAction;
	}
	
	
	
}
