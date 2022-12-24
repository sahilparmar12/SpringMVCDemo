package SpringDemo_MVC.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CoursrCode, String>
// ConstraintValidator uses annotation CourseCode and accept type String
{

	private String coursePrefix;
	
	
	// this method will give true or false if our validate and this will contain our validation code
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result;
		if(theCode != null)
			result = theCode.startsWith(coursePrefix);
		else {
			result = true;
		}
		
		return result;
	}

	@Override
	public void initialize(CoursrCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

}
