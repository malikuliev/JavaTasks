package az.developia.springjava13.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
 @RequestMapping(path="/home")
public class HomeController {

	
	@GetMapping
	public String showHome() {
		return "home";
	}
	 
	@GetMapping(path="/students")
	public String showStudents(@RequestParam
			(name="q",required = false,defaultValue = "") String q) {
		
		     List<String> students=new ArrayList<>();
		     students.add("Rustem");
		     students.add("Saleh");
		     students.add("Huseyn");
		     students.add("Seid");
		     
		     List<String> studentsFiltered=new ArrayList<>();
		     
		     students.stream().forEach(e->{
		    	 if(e.contains(q)) {
		    		 studentsFiltered.add(e);
		    	 }
		     });
		     
		     
		     
		     System.out.println(studentsFiltered);
		     
		return "students";
	}
	
	@GetMapping(path="/kitablar")
	public String showBooks(Model m) {
		m.addAttribute("books", m);
		System.out.println("salam");
		return "books";
	}
	
	
}
