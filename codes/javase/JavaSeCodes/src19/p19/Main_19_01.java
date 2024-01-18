package p19;

public class Main_19_01 {

	public static void main(String[] args) {
		// 2 8 10 16
		// 2 01
		// 8 01234567
		// 10 0123456789
		// 16 0123456789ABCDEF

		String ikilik = "1101";
		String s = "5252";
		System.out.println(ikilik);

		int onluq = Integer.parseInt(ikilik, 2);
		int onluqS = Integer.parseInt(s, 8);
		System.out.println(onluq);
		System.out.println(onluqS);
		
		Integer.toBinaryString(3);
		

	}

}
