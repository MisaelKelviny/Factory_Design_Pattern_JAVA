package br.edu.univas.factory;

import br.edu.univas.socialmedias.Facebook;
import br.edu.univas.socialmedias.Instagram;
import br.edu.univas.socialmedias.Linkedin;
import br.edu.univas.socialmedias.Twitter;

public class FactoryCreator {
	
	public static final int facebook = 1;
	public static final int instagram = 2;
	public static final int twitter = 3;
	public static final int linkedin = 4;
	
	public FactoryCreator() {}
	
	public static FactoryInterface getSocialMedia(int options) {
		FactoryInterface Ifactory;
		switch(options) {
		case facebook:
			Ifactory = new Facebook();
			break;
		case instagram:
			Ifactory = new Instagram();
			break;
		case twitter:
			Ifactory = new Twitter();
			break;
		case linkedin:
			Ifactory = new Linkedin();
			break;
		default:
			return null;
		}
		return Ifactory;
	}
	
}
