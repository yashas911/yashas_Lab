package yashas.com.lab1.credentialservice;
import yashas.com.lab1.model.*;

public interface CredentialService {
	public char[] generatePassword();
	public String generateEmailAddress(String firstName,String lastName,String department);
	public void showCredentials(Employee emp,String email, char[] password);

}
