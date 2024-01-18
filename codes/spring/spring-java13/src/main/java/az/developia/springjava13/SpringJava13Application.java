package az.developia.springjava13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.springjava13.component.Student;

// component scan
// auto config
// config
@SpringBootApplication
public class SpringJava13Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(SpringJava13Application.class, args);

		//Student studentBean = c.getBean("myStudent1", Student.class);
		
		//Student studentBean2 = c.getBean("myStudent1", Student.class);
		// singleton
		// prototype
		// System.out.println(studentBean.getName());
//System.out.println(studentBean.getComputer().getModel());
//		String[] beanNames = c.getBeanDefinitionNames();
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
	}

}
