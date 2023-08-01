package fr.eni.m03d02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.eni.m03d02.controller.FormateurController;
import fr.eni.m03d02.controller.WelcomeController;

@SpringBootApplication
public class M03D02Application {

	public static void main(String[] args) {
		
		//Récupération contexte / conteneur 
		ApplicationContext ctx = SpringApplication.run(M03D02Application.class, args);
		
		
		//Récupération / Injection par nom
		WelcomeController welcomeCtrler = (WelcomeController) ctx.getBean("weControllerBean");
		welcomeCtrler.welcome();
		
		//Récupération / Injection par type 
		WelcomeController welcomeCtrlerType = (WelcomeController) ctx.getBean(WelcomeController.class);
		welcomeCtrlerType.welcome();
		WelcomeController welcomeCtrlerType2 = (WelcomeController) ctx.getBean(WelcomeController.class);
		welcomeCtrlerType2.welcome();
		
		
		FormateurController formateurController = ctx.getBean(FormateurController.class);
		formateurController.afficherFormateurs();
		formateurController.afficherFormateurs();
	}
}
