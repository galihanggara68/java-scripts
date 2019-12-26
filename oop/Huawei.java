package oop;

public class Huawei implements ModemRegulator{

	@Override
	public void decode() {
		System.out.println("Decoding . . .");
	}

	@Override
	public void encode() {
		System.out.println("Encoding . . .");
	}
	
	public void turnOn(){
		System.out.println("Turning On . . .");
	}

}
