package oop;

import java.util.List;

public class Mouse {
	protected boolean leftButton; // True -> clicked, False -> not clicked
	protected boolean rightButton;
	
	// Constructor -> method yang akan dijalankan saat pertama kali
	// class dibuat object atau dinew
	public Mouse(){
		this.leftButton = false;
		this.rightButton = false;
	}
	
	public void leftClick(){
		this.leftButton = true;
		System.out.println("Mouse");
	}
	
	public void rightClick(){
		this.rightButton = true;
	}
}
