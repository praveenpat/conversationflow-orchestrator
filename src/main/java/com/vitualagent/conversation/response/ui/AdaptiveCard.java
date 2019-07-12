package com.vitualagent.conversation.response.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vitualagent.conversation.response.ui.cards.CardElement;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class AdaptiveCard {
	
	private String version = "1.0";
	
	private String fallbackText;
	
	private String backgroundImage;
	
	private String speak;
	
	private String lang;
	
	private  String type = AdaptiveUiConstants.ADAPTIVE_CARD;
	
	private List<Action> actions;
	
	private List<CardElement> body;
	
	
	public void addAction(Action e) {
		
		if (CollectionUtils.isEmpty(actions)) {
			this.actions=new ArrayList<>();
		}
		
		this.actions.add(e);
	}
	
	
	public void addCardElement(CardElement element) {
		
		if (CollectionUtils.isEmpty(body)) {
			this.body=new ArrayList<>();
		}
		
		this.body.add(element);
		
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public String getSpeak() {
		return speak;
	}

	public void setSpeak(String speak) {
		this.speak = speak;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public List<CardElement> getBody() {
		return body;
	}

	public void setBody(List<CardElement> body) {
		this.body = body;
	}
	

	
	
	
}
