package com.vitualagent.conversation.response.ui.cards;

import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;

public class Media extends CardElement{
	
	private MediaSource[] sources;
	
	private String poster;
	
	private String altText;
	
	

	public Media() {
		super();
		this.setType(AdaptiveUiConstants.CARD.MEDIA);
	}

	public MediaSource[] getSources() {
		return sources;
	}

	public void setSources(MediaSource[] sources) {
		this.sources = sources;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}
	
	

}
