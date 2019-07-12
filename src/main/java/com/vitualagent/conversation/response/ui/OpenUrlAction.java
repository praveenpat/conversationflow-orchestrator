package com.vitualagent.conversation.response.ui;

public class OpenUrlAction  extends Action{

	public OpenUrlAction() {
		super(AdaptiveUiConstants.ACTION.ACTION_OPENURL);
		
	}
	
	  //used only with action openUrl
		private String url;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	
	

}
