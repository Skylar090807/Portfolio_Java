package sec04.exam01.mycompany;

import sec04.exam01.hankook.*;
import sec04.exam01.hyndai.Engine;
import sec04.exam01.kumho.*;
public class Car {
	//field
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	//new 클래스명 빨간 줄에 커서 위치하고
	//Ctrl+Shift+O :import 자동
	
	sec04.exam01.hankook.Tire tire3 = new sec04.exam01.hankook.Tire();
	sec04.exam01.kumho.Tire tire4 = new sec04.exam01.kumho.Tire();
	
	//필드
    private int speed;
	private boolean stop;
		
	
		
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) { 
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	

}
