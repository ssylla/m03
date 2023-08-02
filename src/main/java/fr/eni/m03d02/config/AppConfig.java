package fr.eni.m03d02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import fr.eni.m03d02.bll.FormateurService;
import fr.eni.m03d02.bll.FormateurServiceBouchon;
import fr.eni.m03d02.bll.FormateurServiceImpl;
import fr.eni.m03d02.dal.FormateurDAO;
import fr.eni.m03d02.dal.FormateurDAOBouchon;

@Configuration
public class AppConfig {

	@Bean
	FormateurDAO getBeanFormateurDAO() {
		FormateurDAO dao = new FormateurDAOBouchon();
		//TODO : faire les initialisation d'usage avant de renvoyer l'objet pour la première fois.
		return dao;
	}

	@Bean
	@Profile("default")
	FormateurService getBeanFormateurService() {
		return new FormateurServiceImpl(getBeanFormateurDAO());
	}
	@Bean
	@Profile("dev")
	FormateurService getBeanFormateurServiceBouchon() {
		return new FormateurServiceBouchon();
	}
}
