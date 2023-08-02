package fr.eni.m03d02.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.m03d02.bo.Formateur;

public class FormateurDAOBouchon implements FormateurDAO {

	
	private static final List<Formateur> listeFormateurs;
	
	static {
		listeFormateurs = new ArrayList<>();
		listeFormateurs.add(new Formateur("Stéphane", "Gobin", "sgo@eni.fr"));
		listeFormateurs.add(new Formateur("Anne-Lise", "Baille", "alba@eni.fr"));
		listeFormateurs.add(new Formateur("Julien", "Trillard", "jtr@eni.fr"));
	}
	
	@Override
	public void create(Formateur formateur) {
		listeFormateurs.add(formateur);
	}

	@Override
	public List<Formateur> findAll() {
		return listeFormateurs;
	}
	
	

}
