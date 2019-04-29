package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class FactSet extends CardElement{
	
	private Fact[] facts;
	
	

	public FactSet() {
		super();
		this.setType(AdaptiveUiConstants.CARD.FACT_SET);
	}

	public Fact[] getFacts() {
		return facts;
	}

	public void setFacts(Fact[] facts) {
		this.facts = facts;
	}

}
