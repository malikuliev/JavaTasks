package az.developia.teacher;

import java.time.LocalDateTime;

import az.developia.teacher.entity.StudentEntity;
import az.developia.teacher.exception.OurRuntimeException;
import az.developia.teacher.repository.StudentRepository;

public class StudentAdd {

	public static void main(String[] args) {
		
		StudentEntity student = new StudentEntity(null, "Adil", "Aliyev", "055", LocalDateTime.of(2012, 1, 21, 12, 30));
		
		StudentRepository repository = new StudentRepository();
		try {
			repository.add(student);
		}

		catch (OurRuntimeException e) {
			System.out.println(e.getOurMessage());
		 }
		
	
	}
}
