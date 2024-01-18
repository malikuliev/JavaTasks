package d15_generics;

public class Siyahi<T> {

	Object[] massivim = null;
	int index = 0;
	int inc = 0;

	public Siyahi(int initial, int increment) {
		massivim = new Object[initial];
		this.inc = increment;
	}

	public void yenisi(T i) {

		if (index == massivim.length) {
			Object[] yeniMassiv = new Object[massivim.length + inc];// 6
			for (int j = 0; j < massivim.length; j++) {
				yeniMassiv[j] = massivim[j];
			}
			massivim = yeniMassiv;
		}

		massivim[index] = i;
		index++;

	}

	public String hamisiniQaytar() {
		String s = "[";
		for (int i = 0; i < index; i++) {

			if (index == i + 1) {
				s = s + massivim[i];
			} else {
				s = s + massivim[i] + ", ";
			}
		}
		return s + "]";
	}

	
	
	
	// 5
	public void silmek(int index) {
		if(index<this.index) { // 6
			// sil kodunu yaz
			Object[] yeniMassiv = new Object[this.index-1];// 3
			
			for (int j = 0; j < this.index; j++) {//  0 1 2 3
				if(j==index) {
					continue;
				}
				
				if(j<index) {
					yeniMassiv[j] = massivim[j];
				}else {
					yeniMassiv[j-1] = massivim[j];
				}
				
			}
			massivim = yeniMassiv;
			this.index--;
		}else {
			System.out.println("silmke istediyin indexkde elem yoxdu");
		}
	}
}
