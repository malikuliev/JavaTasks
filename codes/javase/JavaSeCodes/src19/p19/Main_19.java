package p19;

 
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main_19 {

	public static void main(String[] args) {
		 
		
		LocalDate l1=LocalDate.now(); 
		// immutable, mutable
		System.out.println(l1);
		
		LocalDate l2=LocalDate.of(2010, 3, 5);
		
		System.out.println(l2.isBefore(l1));
		
		System.out.println(l1.plusWeeks(1));
		System.out.println(l1);
		
		// local date to date
		Date d2 = Date.valueOf(l2);
		System.out.println(d2.toLocalDate());
		
		Timestamp.valueOf(LocalDateTime.now()).toLocalDateTime();
		
		
	}

}
