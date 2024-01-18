package p1;

public class Extra {
// 10 elem , 100
	// 10, 5
	public int giveArrayElement(int[] array, int index) throws SalehinExceptionSinifi{
		
		int result = 0;
		
		if (index >= array.length) {
			throw new SalehinExceptionSinifi("olmayan elemente murciet etdin qaqa");
		}

		result = array[index];

		return result;
	}
}
