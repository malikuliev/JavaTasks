package ders9.access;

class ClassA2 { // package access modi default

	{
		
	}
	static {

	}

	private String s1; // encap

	public String getNese() {
		return s1;
	}

	public void setNese(String s, String pass) {
		if (pass.equals("1234")) {
			s1 = s;
		}

	}
}
