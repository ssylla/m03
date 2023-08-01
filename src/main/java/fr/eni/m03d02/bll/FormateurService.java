package fr.eni.m03d02.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.m03d02.bo.Formateur;


public interface FormateurService {

	void add(String nom, String prenom, String email);
	List<Formateur> getFormateurs(); 
}
