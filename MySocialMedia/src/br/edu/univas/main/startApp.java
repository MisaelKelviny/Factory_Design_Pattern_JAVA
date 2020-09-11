package br.edu.univas.main;

import br.edu.univas.socialmedias.Facebook;
import br.edu.univas.socialmedias.Instagram;
import br.edu.univas.socialmedias.Linkedin;
import br.edu.univas.socialmedias.Twitter;

public class startApp {

	public static void main(String[] args) {
		
		Facebook facebook = new Facebook();
		Instagram insta = new Instagram();
		Linkedin linkedin = new Linkedin();
		Twitter twitter = new Twitter();
		
		facebook.mySocialMedia();
		insta.mySocialMedia();
		linkedin.mySocialMedia();
		twitter.mySocialMedia();
	}

}
