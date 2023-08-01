package fr.eni.m03d02.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("weControllerBean")
@Scope("prototype")
public class WelcomeController {

	public void welcome() {
		System.out.println("Bienvenue dans la démo de Spring Container - "+toString());
	}
}
