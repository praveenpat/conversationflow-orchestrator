package com.vitualagent.conversation.response.ui;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class AdaptiveCard {
	
	private String version;
	
	private String fallbackText;
	
	private String backgroundImage;
	
	private String speak;
	
	private String lang;
	
	private  String type = AdaptiveUiConstants.ADAPTIVE_CARD;
	
	private Action[] actions;
	
	
	
	
	
}
