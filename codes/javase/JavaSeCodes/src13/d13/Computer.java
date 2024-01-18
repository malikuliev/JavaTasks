package d13;

public class Computer implements Cloneable{
	public String model;
	public int year;

	@Override
	public String toString() {

		return model;
	}

	public Computer(String model, int year) {

		this.model = model;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		Computer that = null;
		if (obj instanceof Computer) {
			that = (Computer) obj;
		} else {
			return false;
		}

		if (this.model.equals(that.model) && this.year == that.year) {
			return true;
		} else {
			return false;
		}

	}
	
	@Override
	protected void finalize() {
		 System.out.println("gozde 1 dene");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 
		return super.clone();
	}
}
