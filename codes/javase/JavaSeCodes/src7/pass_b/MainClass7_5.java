package pass_b;

public class MainClass7_5 {

	public static void main(String[] args) {
		 Person p=new Person();
		 p.name="Adil";
		 p.exYear=4;
		 
		 SalaryCalculator calculator=new SalaryCalculator();
		 calculator.calculateSalary(p);
		 p.printInfo();
	}

}
