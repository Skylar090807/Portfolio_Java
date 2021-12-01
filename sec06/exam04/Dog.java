package sec06.exam04;

public class Dog extends Animal {
	public Dog() {
		this.kind = "Æ÷À¯·ù";
	}

	@Override
	public void sound() {
		System.out.println("¸Û¸Û");
	}
	
	@Override
	public void run() {
		System.out.println("²±Ãæ²±Ãæ");
	}

	@Override
	public void fight() {
		System.out.println("³¯Ä«·Î¿î ÀÌ»¡ ");
	}

}
