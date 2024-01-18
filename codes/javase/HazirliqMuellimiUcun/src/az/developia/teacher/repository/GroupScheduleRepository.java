package az.developia.teacher.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


import az.developia.teacher.entity.GroupScheduleEntity;

import az.developia.teacher.exception.OurRuntimeException;

public class GroupScheduleRepository {
	public void addSchedules(GroupScheduleEntity groupSchedule) {
		String query = "INSERT INTO group_schedules " + "(group_id,day,hour) values " + "("
				+ groupSchedule.getGroupId() + "," + groupSchedule.getDay() + ",'" + groupSchedule.getHour()
				+ "')";

		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/java13_teacher?useSSL=false&serverTimezone=UTC",
					"root", "1234" );
			Statement state = connect.createStatement();
			state.executeUpdate(query);

			connect.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());

  
}
		
	}
}
