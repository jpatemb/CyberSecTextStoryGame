import java.util.Scanner;

public class UsernamePassword {
	
	Scanner nu = new Scanner(System.in);
	String netuser = nu.nextLine();
	String nuser = netuser;
	
	Scanner np = new Scanner(System.in);
	String netpass = np.nextLine();
	String npass = netpass;
	
	public String NetworkUsername() {
		return nuser;
	}
	
	//Returns Network Username
	public String getNUser() {
		return nuser;
	}

	//Sets Network Username
	public void setNUser(String nuser) {
		this.nuser = nuser;
	}
	
	
	public String NetworkPassword() {
		return npass;
	}

	//Returns Network Password
	public String getNPass() {
		return npass;
	}

	//Sets Network Password
	public void setNPass(String npass) {
		this.npass = npass;
	}

}
