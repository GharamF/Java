package com.Gharam.controllerspractice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	 @RequestMapping("/{Location}")
	    public String Dojo(@PathVariable("Location") String Location){
		 if (Location.equals("dojo")) {
			 return "The Dojo is awesome!";
		 }
		 if (Location.equals("burbank-dojo")) {
				return "Burbank Dojo is located in Southern California.";
		 }
		 if (Location.equals("san-jose")) {
			 return "SJ dojo is the headquarters";
		 }
		 else return "hello World";
	 }	

}
