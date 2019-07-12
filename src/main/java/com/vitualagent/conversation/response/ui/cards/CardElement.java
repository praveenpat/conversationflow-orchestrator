package com.vitualagent.conversation.response.ui.cards;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardElement {
	
	private String type;
	private String id;
	private String spacing;
	private String separator;
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpacing() {
		return spacing;
	}
	public void setSpacing(String spacing) {
		this.spacing = spacing;
	}
	public String getSeparator() {
		return separator;
	}
	public void setSeparator(String separator) {
		this.separator = separator;
	}
	
	
	

}
