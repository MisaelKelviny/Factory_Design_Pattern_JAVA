package br.edu.univas.main;

import br.edu.univas.factory.FactoryCreator;
import br.edu.univas.factory.FactoryInterface;

public class startApp {

	public static void main(String[] args) {
		
		FactoryInterface factory = FactoryCreator.getSocialMedia(FactoryCreator.facebook);
		factory.mySocialMedia();
		
		factory = FactoryCreator.getSocialMedia(FactoryCreator.instagram);
		factory.mySocialMedia();
		
		factory = FactoryCreator.getSocialMedia(FactoryCreator.twitter);
		factory.mySocialMedia();
		
		factory = FactoryCreator.getSocialMedia(FactoryCreator.linkedin);
		factory.mySocialMedia();
		
	}

}
