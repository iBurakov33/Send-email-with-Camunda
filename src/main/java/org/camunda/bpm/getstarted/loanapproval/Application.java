package org.camunda.bpm.getstarted.loanapproval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class Application {
	  @Bean
	  public SendMail sendMail()
	  {
		  return new SendMail();
	  }

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

}