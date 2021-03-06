package com.vitualagent.orchestrator;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vitualagent.conversation.response.ui.Action;
import com.vitualagent.conversation.response.ui.AdaptiveCard;
import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;
import com.vitualagent.conversation.response.ui.OpenUrlAction;
import com.vitualagent.conversation.response.ui.cards.TextBlock;

@RestController
public class VirtualAgentController {
	
    Logger log = LoggerFactory.getLogger(VirtualAgentController.class);
    
    @Autowired
    ApplicationServiceConfig config;
    
    @Autowired
    NluClientServiceProxy nluClientProxy;
		
	
	@PostMapping("/userQuery")
	public AdaptiveCard userQuery(@RequestBody UserRequest request) {
		
		log.info(request.getUserQuery());
		if(!CollectionUtils.isEmpty(request.getParameters())) {
			request.getParameters().forEach((k,v)-> log.info("Key {} , Value  {}",k,v));
			
		}
		
		if(!CollectionUtils.isEmpty(request.getChannelAttributes())) {
			request.getChannelAttributes().forEach((k,v)-> log.info("Key {} , Value  {}",k,v));
			
		}
		log.info(request.getActionName());
		AdaptiveCard resp= new AdaptiveCard();
		
		TextBlock textblock=new TextBlock();
		textblock.setText("Hello World !!");
		resp.addCardElement(textblock);
		
		List<Action> actions= new ArrayList<Action>();
		
		OpenUrlAction action1= new OpenUrlAction();
		
		action1.setTitle("This is openurl Action");
		action1.setIconUrl("/images/icon.icon");
		action1.setUrl("some external url");

		actions.add(action1);
		
		Action action2= new Action();
		
		
		
		action2.setTitle("This is parent Action");
		action2.setIconUrl("/images/icon.icon");
		action2.setType(AdaptiveUiConstants.ACTION.ACTION_SHOWCARD);
		AdaptiveCard showCard= new AdaptiveCard();
		
		TextBlock textblock2=new TextBlock();
		textblock2.setText("Hello World 2!!");
		showCard.addCardElement(textblock2);
		
		action2.setCard(showCard);
		
		actions.add(action2);
		
		resp.setActions(actions);
		
		
		return resp;
	}
	
	
	
	
	@GetMapping("/showTextBlock")
	public AdaptiveCard showTextBlock() {
		AdaptiveCard resp= new AdaptiveCard();
	
		resp.setFallbackText("Fallback Text");
		resp.setBackgroundImage("https://cdn.pixabay.com/photo/2017/08/30/01/05/milky-way-2695569_1280.jpg");
		
		TextBlock textblock=new TextBlock();
		textblock.setText("Hello World !!");
		textblock.setColor("light");
		
		resp.addCardElement(textblock);
		return resp;
		
	}
	
	

	@GetMapping("/showConfig")
	public ApplicationServiceConfig showConfig() {
		return config;
	}
	
	
	
	@PostMapping("/userQueryByAgent")
	public BotResponse handleUserQuery(@RequestBody UserRequest userRequest) {
		return nluClientProxy.handleUserQueryByAgent("AccountMaintenance", userRequest);
	}
	
	
	@MessageMapping("/botrequest")
    @SendTo("/topic/botresponse")
    public BotResponse greeting(UserRequest userRequest) throws Exception {
        return nluClientProxy.handleUserQueryByAgent("AccountMaintenance", userRequest);
    }
	
}
