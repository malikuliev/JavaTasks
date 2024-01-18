package az.developia.teacher;

import az.developia.teacher.exception.OurRuntimeException;
import az.developia.teacher.repository.StudentRepository;

public class StudentDeleteById {

	public static void main(String[] args) {
		try {

			StudentRepository repository = new StudentRepository();

			repository.deleteById(4);
		} catch (OurRuntimeException e) {
			System.out.println(e.getOurMessage());

		}

	}

}
