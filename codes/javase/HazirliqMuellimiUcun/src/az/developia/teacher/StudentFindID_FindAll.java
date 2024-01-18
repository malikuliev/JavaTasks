package az.developia.teacher;

import az.developia.teacher.repository.StudentRepository;

public class StudentFindID_FindAll {

	public static void main(String[] args) {
		StudentRepository repo1=new StudentRepository();
		System.out.println(repo1.findById(6));
		StudentRepository repo=new StudentRepository();
		System.out.println(repo.findAll());
	}

}
