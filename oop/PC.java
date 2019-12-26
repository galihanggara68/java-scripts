package oop;

public class PC {
	public void receiveModemData(ModemRegulator modem){
		modem.encode();
		modem.decode();
	}
}
