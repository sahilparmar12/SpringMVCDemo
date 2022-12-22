package SpringDemo_MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyCOntroller 
{
	@RequestMapping("/showForm")
	public String displayTheForm()
	{
		return "sillyForm";
	}

}