package sec10.exam01;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() { //toString() ¿Á¡§¿«
		return company + "," +os;
	}

}
