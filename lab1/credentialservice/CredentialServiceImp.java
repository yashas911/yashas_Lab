package yashas.com.lab1.credentialservice;
import java.util.*;

import yashas.com.lab1.model.Employee;

public class CredentialServiceImp implements CredentialService {
	
	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		String email = firstName+lastName+"@"+department+".yashasInc.com";
		
		return email;
	}
	
	@Override
	public char[] generatePassword() {
		
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%&*";
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		Random random = new Random ( ) ;
		char [ ] password = new char [ 8 ] ;
		for ( int i = 0 ; i < 8 ; i ++ ) {
		    password [i] = values.charAt(random.nextInt(values.length())) ;
		
		}
		
		return password;
	}
	
	@Override
	public void showCredentials(Employee emp, String email, char[] password) {
		
		System.out.println("Mr. "+emp.getFirstName()+" your email address is "+email);
		System.out.println("and the password assigned is "+password.toString());
		
	}


}
