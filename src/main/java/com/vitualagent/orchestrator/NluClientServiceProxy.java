package com.vitualagent.orchestrator;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@FeignClient("dialogflow-adaptor")
public interface NluClientServiceProxy {

	@PostMapping("/{agentName}/userQueryByAgent")
	public BotResponse handleUserQueryByAgent(@PathVariable("agentName") String agentName, @RequestBody UserRequest userRequest) ;
		
}
