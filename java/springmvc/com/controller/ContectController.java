package springmvc.com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.com.model.User;

@Controller
public class ContectController
{
	 
	//how to fetch data in springmvc
	// this is very old way fetch data in spring mvc
	//this fist way
	 // @GetMapping("/")
	 // public String  showIndex1() 
	  //{
		//return "contect";  
	  //}
	
	  //@RequestMapping("/contect")
	  //public String  showForm1() 
	  //{
		//return"contect";
	  //}
	  //@RequestMapping(path="/processform", method =RequestMethod.POST)
	 // public String handleform(HttpServletRequest request) 
	 // { 
	   // String email =request.getParameter("email");
	   // System.out.println("user email is then print"+ email); 
	 //   return " "; 
	//  }
	
   //}
	
	//this is very good way
	/*----------------how to show data forward  in second view in java SpringMvC--------*/
	//yah code kiya kaam karta hai ki hamare views data aata hai hamre controller aaur controller
	//   per data ko process kar rahe hai aaur phir sa data return phir dusare view per data ko dikha dete hai
	
	 //@GetMapping("/")
	// public String  showIndex() 
	// {
	//	return "contect";  
    //  }
	  //here is create handler method
	
	// @RequestMapping("/contect")
	//public String  showForm() 
	// {
	//	return"contect"; //here is put your view name 
	// }
	//@RequestMapping(path="/processform", method =RequestMethod.POST)
	//public String handleform(
				 //here is your fiest view matlab first jsp page
			 // @RequestParam("email")String email,
			 //@RequestParam("userName")String userName,
		 //@RequestParam("passWord")String passWord,Model model)
		  //{ 
	          
		     // System.out.println("email"+email);
		     // System.out.println("userName"+userName);
		     //  System.out.println("passWord"+passWord);
		       
		       //process 
		     // User user=new User();
		    // model.addAttribute("email",email);
			// model.addAttribute("userName",userName);
			 //model.addAttribute("passWord",passWord);
			// model.addAttribute("it is your user data object"+user);
			    
			 // return "success";
		// }
  //}	
	
	
	/*-------------------this is secod way-----------------------------------	*/
	//this is a good way
	//how to fetch data in springmvc
		// this is this is seconde way fetch data in springmvc
		//this fist way
	// this is this is seconde way fetch data in springmvc
			//this is a good way 
	 @GetMapping("/")
	  public String  showIndex() 
	  {
	   return "contect";  
	 }
	  //here is create handler method
	  @RequestMapping("/contect")
	 public String  showForm() 
	 {
	  return"contect"; //here is put your view name 
	 }
	   //here is second way
	 @RequestMapping(path="/processform", method =RequestMethod.POST)
	public String handleform(
			 //here is your fiest view matlab first jsp page
			 @RequestParam(name="email",required =false)String email,
			 @RequestParam("userName")String userName,
			 @RequestParam("passWord")String passWord,Model model)
	{ 
		
		 //here create a user name 
		 User user=new User();
	     user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(passWord);
		 
		 System.out.println(user);
		 
		 model.addAttribute(user);
		 return "succese"; 
	 }
 }	 
		 
		//here is stared first way of handler method put in side @ModelAttribute 
		// aab aapko aalge allge filed key request param nahi lagani hai aaur simply aaone 
		//  handler key aandre lagawo @ModelAttribute 

			// first(1) way
			
			 // System.out.println("it is the store of the data in java"+email);
			 // System.out.println("it is the  store of the data in java"+userName);
			  //System.out.println("it is the  store of the data in java "+passWord);
			 
	
		 //view sa data controller per lane key liye used huta hai Model ka
		//here is your stared your second  jsp page 
		//aaur teeno data ko ham fetch kar sakte hai succese
		
		//process
		 //first(1) way
		  
		 // model.addAttribute("email",email);
		 // model.addAttribute("userName",userName);
		  //model.addAttribute("passWord",passWord);
		  //model.addAttribute("it is your user data object"+user);
		 
	



/*----------->here is first way<--------*/

//@Controller
//public class ContectController 
//{
	//@GetMapping("/")
	//public String  showIndex11() {
		//return "contect";  
	//}
	//here is used @ModelAttribute
	//@RequestMapping("/contect")
	//public String  showForm() {
		//return"contect"; //here is put your view name 
	//}
	
	//here is stared first way of handler method put in side @ModelAttribute 
	 //aab aapko aalge allge filed key request param nahi lagani hai aaur simply aaone 
	 // handler key aandre lagawo @ModelAttribute 
	
	
	//here is used @modelAttribute() handler parameter in side first way
	// @RequestMapping(path="/processform", method =RequestMethod.POST)
	 //public String handleform11(@ModelAttribute User user,Model model)
	// { 
		//System.out.println(user);
		//model.addAttribute("it is your user data object"+user);
		 
   	 //return "succese"; 
	//}

//}

/*
 * <-----------------here is second way------------------------>
 */
	
//@Controller
//public class ContectController 
//{
	//@GetMapping("/")
	//public String  showIndex1() {
	//	return "contect";  
	//}
	//here is used @ModelAttribute
	//yaha per header hame contect page per dikhana hai tu ham aa jayenga contect page per ju view key ander bana hai contect.jsp
	//jaha RegistartionForm waha per ma herdaer dikha deta hu
	 // @RequestMapping("/contect")
	 // public String  showForm1(Model m) 
	 // {
	//	m.addAttribute("Header", "learnCode with altaf");
		//here i wiil show my decs in my fornte page view in side conect.jsp page
	//	m.addAttribute("Desc", "Home for programmers");
		//he hame show karana hai header key niche aapne jsp ma 
	   //return"contect"; //here is put your view name 
	 // }

	//here is used @modelAttribute()ya method upper ya RequestParam upper used kar sakte hai 
    //@RequestMapping(path="/processform", method =RequestMethod.POST)
	  //public String handleform1(@ModelAttribute User user,Model model)
	  //{ 
	   //System.out.println(user);
	   //model.addAttribute("it is your user data object"+user);
	   
	  //return "succese"; 
	//}

//}
//<------------Multipal data your controler same then you will become extra method--->
//@Controller
 // public class ContectController 
  //{
	
	//here is create extra method in springmvc
	//first call this method
	 // @ModelAttribute()
	 // public void commondataForModel(Model m) 
	//  {
		    //m.addAttribute("Header", "learnCode with altaf");
			//m.addAttribute("Desc", "Home for programmers");
			//System.out.println("show is your method ");
	  //}
	
	    // @GetMapping("/")
		//public String  showIndex() {
			//return "contect";  
		//}
		//here is used @ModelAttribute
		//yaha per header hame contect page per dikhana hai tu ham aa jayenga contect page per ju view key ander bana hai contect.jsp
		//jaha RegistartionForm waha per ma herdaer dikha deta hu
	     
	     //secod this method call
		//@RequestMapping("/contect")
		//public String  showForm(Model m) 
		//{
			//m.addAttribute("Header", "learnCode with altaf");
			//here i wiil show my decs in my fornte page view in side conect.jsp page
			//m.addAttribute("Desc", "Home for programmers");
			//he hame show karana hai header key niche aapne jsp ma 
		//	return"contect"; //here is put your view name 
		// }

		//here is used @modelAttribute()ya method upper ya RequestParam upper used kar sakte hai 
	     // @RequestMapping(path="/processform", method =RequestMethod.POST)
		 // public String handleform(@ModelAttribute User user,Model model)
		// { 
		  //System.out.println(user);
		 // model.addAttribute("it is your user data object"+user);
		 // System.out.println("showing is your form page");
		   
		 // return "succese"; 
		//}

//}
