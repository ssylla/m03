package fr.eni.m03d02.dal;

import java.util.List;

import fr.eni.m03d02.bo.Formateur;

public interface FormateurDAO {
	
	void create(Formateur formateur);
	List<Formateur> findAll();
}
