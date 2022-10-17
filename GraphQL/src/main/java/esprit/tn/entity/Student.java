package esprit.tn.entity;

public class Student {
	 

	private final String cin;
	private final String nompre;
	private final String email;

	public Student(String cin, String nompre, String email) {
	this.cin = cin;
	this.nompre = nompre;
	this.email = email;
	}

	public String getCin() {

	return cin;
	}

	public String getNompre() {
	return nompre;
	}

	public String getEmail() {
	return email;
	} 

	 
}
