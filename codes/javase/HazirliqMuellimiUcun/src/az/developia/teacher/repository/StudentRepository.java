package az.developia.teacher.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import az.developia.teacher.entity.StudentEntity;
import az.developia.teacher.entity.TeacherEntity;
import az.developia.teacher.exception.OurRuntimeException;

public class StudentRepository {

	public void add(StudentEntity student) {
		System.out.println("");
		String query = "INSERT INTO students " + "(name,surname,phone,birthday) values " + "('" + student.getName()
				+ "','" + student.getSurname() + "','" + student.getPhone() + "','" + student.getBirthhday() + "');";
		try {

			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/java13_teacher?useSSL=false&serverTimezone=UTC", "root", "1234");
			Statement st = conn.createStatement();

			st.executeUpdate(query);

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void deleteById(Integer id) {

		String query = "DELETE FROM java13_teacher.students WHERE (id = '" + id + "');";
		try {

			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/java13_teacher?useSSL=false&serverTimezone=UTC", "root", "1234");
			Statement st = conn.createStatement();

			st.executeUpdate(query);

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	public StudentEntity findById(Integer id) throws OurRuntimeException{
		StudentEntity entity = new StudentEntity();

		try {

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java13_teacher?useSSL=false&serverTimezone=UTC",
					"root", "1234");
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM  students where id=" + id + "");

			if (rs.next()) {
				entity.setId(rs.getInt("id"));
				entity.setName(rs.getString("name"));
				entity.setSurname(rs.getString("surname"));
				entity.setPhone(rs.getString("phone"));
				entity.setBirthhday(rs.getTimestamp("birthday").toLocalDateTime());
			} else {

			}

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (entity.getId() == null) {
			throw new OurRuntimeException("muellim tapilmadi, id = " + id);
		}
		return entity;
	}
	
	public ArrayList<StudentEntity> findAll() {

		ArrayList<StudentEntity> entities = new ArrayList<>();

		try {

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java13_teacher?useSSL=false&serverTimezone=UTC",
					"root", "1234");
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM students ");

			while (rs.next()) {
				StudentEntity entity = new StudentEntity();
				entity.setId(rs.getInt("id"));
				entity.setName(rs.getString("name"));
				entity.setSurname(rs.getString("surname"));
				entity.setPhone(rs.getString("phone"));
				entity.setBirthhday(rs.getTimestamp("birthday").toLocalDateTime());
				entities.add(entity);
			}

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return entities;
	}
	
	
	
	
	
	
	
	

}
