package sec08.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		Window w = new Window();
		w.button1.touch();
		w.button2.touch();

	}

}
