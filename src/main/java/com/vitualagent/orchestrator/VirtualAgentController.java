package com.vitualagent.orchestrator;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vitualagent.conversation.response.ui.Action;
import com.vitualagent.conversation.response.ui.AdaptiveUiConstants;
import com.vitualagent.conversation.response.ui.OpenUrlAction;

@RestController
public class VirtualAgentController {
	
    Logger log = LoggerFactory.getLogger(VirtualAgentController.class);
    
    @Autowired
    ApplicationServiceConfig config;
		
	
	@PostMapping("/userQuery")
	public BotResponse userQuery(@RequestBody UserRequest request) {
		
		log.info(request.getQueryText());
		if(!CollectionUtils.isEmpty(request.getParameters())) {
			request.getParameters().forEach((k,v)-> log.info("Key {} , Value  {}",k,v));
			
		}
		
		if(!CollectionUtils.isEmpty(request.getChannelAttributes())) {
			request.getChannelAttributes().forEach((k,v)-> log.info("Key {} , Value  {}",k,v));
			
		}
		log.info(request.getActionName());
		BotResponse resp= new BotResponse("Just a Sample Response");
		
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
		
		actions.add(action2);
		
		resp.setActions(actions.toArray(new Action[actions.size()]));
		
		
		return resp;
	}

	@GetMapping("/showConfig")
	public ApplicationServiceConfig showConfig() {
		return config;
	}
}
