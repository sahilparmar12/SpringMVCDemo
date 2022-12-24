package SpringDemo_MVC;

import javax.validation.Valid;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coustomer")
public class CoustomerController 
{
	
	//@InitBinder annotation will be called everytime a web request arrives in this controller
	@InitBinder
	public void initBinderPreProcessor(WebDataBinder dataBinder)
	{
		var str = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, str);
	}
	
	
	@RequestMapping("/showForm") // the url that will this method will be /coustomer/showForm
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer", new Coustomer());
		return "coustomer-form";
	}
	
	@RequestMapping("/submitForm")
	public String processForm(
			@Valid // to tell the method we are handling validation
			@ModelAttribute("customer") Coustomer thecustomer, // binds customer i.e.the model object to Coustomer class
			BindingResult theBindingResult) // THis contains all the result of validations that were performed on the frontend
	{
		
		System.out.println("Binding Result = " + theBindingResult);
		if(theBindingResult.hasErrors())
		{
			System.out.println("VALIDATION FAILED");
			return "coustomer-form";
		}
		
		else
			return "coustomer-confirmation";
	}

}
