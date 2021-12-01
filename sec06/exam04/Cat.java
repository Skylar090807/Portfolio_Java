package sec06.exam04;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	@Override
	public void run() {
		System.out.println("살금살금");
	}

	@Override
	public void fight() {
		System.out.println("날카로운 발톱, ");
	}
}
