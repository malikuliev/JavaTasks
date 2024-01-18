package az.developia.springjava13.config;

import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import az.developia.springjava13.component.Computer;
import az.developia.springjava13.component.Student;

@Configuration
public class MyConfig {

	 @Bean
	 
	public Student myStudent2() {
		Student s = new Student();
		s.setId(123);
		s.setName("Huseyn");
		return s;
	}
	
	@Bean
	 
	public Computer myComp2() {
		Computer s = new Computer();
		s.setId(123);
		s.setModel("Aspire");
		return s;
	}
	

}
