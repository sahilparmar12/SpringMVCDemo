package SpringDemo_MVC;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import SpringDemo_MVC.validation.CoursrCode;

public class Coustomer
{
	private String firstName;
	
	
	@NotNull(message = "cant be null") //setting validation rule on the parameter
	@Size(min = 1, message = "cant be null")
	private String lastName;
	
	@NotNull(message = "cant be null")
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 10, message = "value should be lesser than 10")
	private Integer freePasses;
	
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "value must contain 5 chars only")
	private String postalCode;
	
	@CoursrCode(value="TOP", message="The course code must start with top")
	//value is the value which will be checked if we dont give any value than it will use the default value
	private String courseCode;
	
	public Coustomer()
	{
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
