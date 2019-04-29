package com.vitualagent.conversation.response.ui;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author praveen
 *
 *   Action class that supports ShowCard,Submit and OpenUrl action types
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Action {
	
	
	private String type;
	private String title;
	private String iconUrl;
	
	
	//used only with action submit
	private Map<String,Object> data;
	
	//used only with action showcard
	private AdaptiveCard card;
	
	
	public Action() {
		super();
		
	}



	public Action(String type) {
		super();
		this.type = type;
	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public AdaptiveCard getCard() {
		return card;
	}
	public void setCard(AdaptiveCard card) {
		this.card = card;
	}
	

}
