package p1;

public class SalehinExceptionSinifi extends RuntimeException {
	private String bizimMesaj;

	public SalehinExceptionSinifi(String m) {
		bizimMesaj = m;
	}

	public String getBizimMesaj() {
		return bizimMesaj;
	}
}
