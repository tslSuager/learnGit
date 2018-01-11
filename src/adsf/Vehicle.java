package adsf;

public class Vehicle {
	int speed;
	int size;
	int xPoint;
	int yPoint;
	public void move(int xPiont,int yPoint) {
		this.setxPoint(yPoint).setyPoint(yPoint);
	}
	
	public Vehicle setSize(int size) {
		this.size = size;
		return this;
	}
	
	public Vehicle setxPoint(int xPoint) {
		this.xPoint = xPoint;
		return this;
	}

	public Vehicle setyPoint(int yPoint) {
		this.yPoint = yPoint;
		return this;
	}

	public Vehicle setSpeed(int speed) {
		if(this.speed>=0)
		this.speed = speed;
		return this;
	}
	public void speedUp(int speedUp) {
		this.setSpeed(speedUp+speed);
	}
	public void speedDown(int speedDown) {
		if(speedDown<speed)
		this.setSpeed(speed-speedDown);
	}
	@Override
	public String toString() {
		return "Vehicle [速度speed=" + speed + "m/s"+", 车的大小size=" + size + "m"+ ", x坐标xPoint=" + xPoint +  "m"+", y坐标yPoint=" + yPoint +  "m"+"]";
	}
	
}
