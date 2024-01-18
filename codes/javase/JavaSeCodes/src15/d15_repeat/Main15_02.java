package d15_repeat;

public class Main15_02 {

	public static void main(String[] args) throws Exception {
		
		
		  MyList<Integer> l=new MyList<>(2, 2);
		  l.addNew(10);
		  l.addNew(11);
		  l.addNew(12);
		  l.addNew(13);
		  l.addNew(14);
		  l.addNew(15);
		  l.removeMethod(1);
		  l.removeMethod(2);
		  
		  System.out.println(l.strReturn());
		  
		  
		  
		 
		
	}

	public static double tapGorek(double i) throws  Exception{

		if(i==0) {
			throw new RuntimeException("0 yazma");
		}
		double tapdim = Math.pow(i, 2D);
		return tapdim;
	}

	
	
}
