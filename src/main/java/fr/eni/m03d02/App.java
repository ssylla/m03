package fr.eni.m03d02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.eni.m03d02.controller.WelcomeController;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	WelcomeController weController;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	@Override
	public void run(String... args) throws Exception {
		weController.welcome();
		
	}
	
}
