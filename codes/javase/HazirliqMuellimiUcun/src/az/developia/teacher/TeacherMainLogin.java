package az.developia.teacher;

import az.developia.teacher.entity.TeacherEntity;
import az.developia.teacher.exception.OurRuntimeException;
import az.developia.teacher.repository.TeacherRepository;

public class TeacherMainLogin {

	public static void main(String[] args) {

		TeacherRepository repository = new TeacherRepository();

		try {
			if (repository.checkUserIfExists("ayxan35", "34")) {
				System.out.println("login oldun");
			} else {
				System.out.println("fail");
			}

		} catch (OurRuntimeException e) {
			System.out.println(e.getOurMessage());
		}

	}

}
