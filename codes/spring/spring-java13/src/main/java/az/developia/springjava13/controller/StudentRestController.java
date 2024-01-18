package az.developia.springjava13.controller;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.springjava13.component.Student;
import az.developia.springjava13.exception.OurRuntimeException;
import az.developia.springjava13.repository.StudentRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/students")
public class StudentRestController {
	
 	@Autowired
 	private StudentRepository repository;

	@GetMapping
	public List<String> getStudents() {
		List<String> students = new ArrayList<>();
		students.add("Rustem");
		students.add("Saleh");
		students.add("Huseyn");
		students.add("Seid");
		return students;

	}
	
	
	@PostMapping(path="/add")
	public void add(@Valid @RequestBody Student s,BindingResult br) {
		 if(br.hasErrors()) {
			 throw new OurRuntimeException(br );
			 
		 }
		System.out.println(s);
		repository.save(s);
		
		// bu s obyektini bazaya gonder
//		try { // ORM=>JPA=>Hibernate
//			Connection conn=dataSource.getConnection();
//			Statement st=conn.createStatement();
//			st.executeUpdate("insert into students (name,surname) values ('"+s.getName()+"','"+s.getSurname()+"');");
//			conn.close();
			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		// {"name":"Huseyn","surname":"Huseynov"}
		
	}

}
