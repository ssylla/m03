package fr.eni.m03d02.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.m03d02.bo.Formateur;
import fr.eni.m03d02.dal.FormateurDAO;

@Service
@Profile("default")
public class FormateurServiceImpl implements FormateurService {

	private FormateurDAO formateurDAO;
	
	@Autowired
	public FormateurServiceImpl(FormateurDAO formateurDAO) {
		this.formateurDAO = formateurDAO;
	}

	@Override
	public void add(String nom, String prenom, String email) {
		Formateur formateur = new Formateur(nom, prenom, email);
		formateurDAO.create(formateur);
	}

	@Override
	public List<Formateur> getFormateurs() {
		
		return formateurDAO.findAll();
	}
	
	

}
