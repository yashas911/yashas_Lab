package yashas.com.lab1.test;

import yashas.com.lab1.credentialservice.CredentialService;
import yashas.com.lab1.credentialservice.CredentialServiceImp;
import yashas.com.lab1.model.*;
import java.util.*;
public class CredentialTest {
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you First Name");
		String firstName = sc.nextLine();
		System.out.println("Enter the Last Name");
		String lastName = sc.nextLine();
		char[] genpassword;
		String email;
		
		Employee e = new Employee(firstName,lastName);
		CredentialService cs = new CredentialServiceImp();
		System.out.println("Enter the department\n1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
		{
			email = cs.generateEmailAddress(firstName.toLowerCase(), lastName.toLowerCase(), "tech");
			genpassword = cs.generatePassword();
			cs.showCredentials(e, email, genpassword);
		}
		break;
		case 2:
		{
			email = cs.generateEmailAddress(firstName.toLowerCase(), lastName.toLowerCase(), "admin");
			genpassword = cs.generatePassword();
			cs.showCredentials(e, email, genpassword);
			
		}
		break;
		case 3:
		{
			email = cs.generateEmailAddress(firstName.toLowerCase(), lastName.toLowerCase(), "humres");
			genpassword = cs.generatePassword();
			cs.showCredentials(e, email, genpassword);
			
		}
		break;
		case 4:
		{
			email = cs.generateEmailAddress(firstName.toLowerCase(), lastName.toLowerCase(), "legal");
			genpassword = cs.generatePassword();
			cs.showCredentials(e, email, genpassword);
			
		}
		break;
		
		default: System.out.println("Invalid Choice");
		}
		
		
		sc.close();
	}

}
