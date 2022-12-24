package SpringDemo_MVC.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD}) //where we can use this annotations
@Retention(RetentionPolicy.RUNTIME)//for how long this annotation will be stored or used
public @interface CoursrCode 
{
	//@CourseCode(value="LUV", message="The course code must start with LUV")
	
	//define default course code
	public String value() default "LUV";
	
	//define the default error message
	public String message() default "The course code must start with LUV";
	
	//define default group
	public Class<?>[] groups() default{}; // can group similar constraints
	
	//define de3fault payload // provides custom details about validation failure (security level, error code etc)
	
	public Class<? extends Payload>[] payload() default {};
	
	

}
