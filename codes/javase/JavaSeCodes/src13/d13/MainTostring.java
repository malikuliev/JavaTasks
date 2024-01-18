package d13;

public class MainTostring {

	public static void main(String[] args) {
		Computer dell = new Computer("inspiron", 12);
		Computer acer = new Computer("inspiron", 12);
		String nese="nese";

		System.out.println(acer.equals(dell));
		
		acer=null;
		
		System.gc();
		
	}

}
