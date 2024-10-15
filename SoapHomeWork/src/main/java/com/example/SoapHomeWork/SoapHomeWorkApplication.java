package com.example.SoapHomeWork;

import com.example.SoapHomeWork.services.GameService;
import com.example.SoapHomeWork.webServices.GameWebService;
import jakarta.xml.ws.Endpoint;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapHomeWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapHomeWorkApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(GameService gameService) {
		return runner -> {
			String url = "http://0.0.0.0/8088/";
        	Endpoint.publish(url , new GameWebService(gameService));
        	System.out.println(url + " deployed");
		};
	}
}
