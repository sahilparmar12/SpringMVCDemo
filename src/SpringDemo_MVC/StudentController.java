package SpringDemo_MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController 
{
	@RequestMapping("/")
	public String mainPage()
	{ return "mainStudentPage"; }
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		//create student object
		Student student = new Student();
		// add the object to model
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) //when submit button is clicked the model object which 
	//is student will be called in this method and with the help of the mentioned annotation student object is mapped to theStudent
	// and then we can access the data easily using theStudent object
	{
		//log the input
		
		System.out.print("The name of student is = " + theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
	
	

}
