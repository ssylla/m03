package fr.eni.m03d02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.eni.m03d02.bll.FormateurService;
import fr.eni.m03d02.bo.Formateur;

@Component
public class FormateurController {

	@Autowired
	private FormateurService formateurService;

	public FormateurController( /* Qualifier("getBeanFormateurService") */ FormateurService formateurService) {
		this.formateurService = formateurService;
	}

	public void afficherFormateurs() {
		List<Formateur> lstFormateurs = formateurService.getFormateurs();
		System.out.println(lstFormateurs);
	}

	public FormateurService getFormateurService() {
		return formateurService;
	}

	public void setFormateurService(FormateurService formateurService) {
		System.out.println("Appel du setter");
		this.formateurService = formateurService;
	}

}
