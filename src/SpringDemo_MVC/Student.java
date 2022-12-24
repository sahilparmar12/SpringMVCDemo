package SpringDemo_MVC;

public class Student 
{
	private String firstName;
	
	private String lastName; 
	
	private String country;
	
	private String favLang;
	
	private String[] os;
	
	public Student() 
	{
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

}
