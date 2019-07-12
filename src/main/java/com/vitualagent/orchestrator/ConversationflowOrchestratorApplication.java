package com.vitualagent.orchestrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.vitualagent.orchestrator")
public class ConversationflowOrchestratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversationflowOrchestratorApplication.class, args);
	}

}
