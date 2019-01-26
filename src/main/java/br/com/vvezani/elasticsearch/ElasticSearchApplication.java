package br.com.vvezani.elasticsearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ElasticSearchApplication {

	private static final Logger logger = LoggerFactory.getLogger(ElasticSearchApplication.class);
	private int number = 0;

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onStartUp() throws InterruptedException {
		for (;;) {
			logger.info("Request number " + number++ + " number was processed!");
			Thread.sleep(1000);
		}
	}

}

