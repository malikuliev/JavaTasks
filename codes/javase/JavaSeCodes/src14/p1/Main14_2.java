package p1;

public class Main14_2 {

	public static void main(String[] args) {

		Extra e1 = new Extra();
		int[] myArray = { 4, 2, 6, 1 };

		try {
			e1.giveArrayElement(myArray, 2);// SalehinExceptionSinifi
			
			int a=9;int b=0;
			int c=a/b;// AritmeticExc
			System.out.println(c);
			
		} catch (SalehinExceptionSinifi e) {
			System.out.println(e.getBizimMesaj());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("qaranti");
		}

	}

}
