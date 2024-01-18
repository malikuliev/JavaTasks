package d13;

public class Main13_3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		 
		Computer hp=new Computer("pavilion", 12);
		
		
		
		Computer hpClone=(Computer) hp.clone();
		hp.model="dsdasd";
		System.out.println(hpClone);
		
		
	}

}
