package oop;

public class Smartfren implements ModemRegulator{

	@Override
	public void decode() {
		System.out.println("Decoding With Manchester . . .");
	}

	@Override
	public void encode() {
		System.out.println("Encoding With Bi-Phase . . .");
	}

}
