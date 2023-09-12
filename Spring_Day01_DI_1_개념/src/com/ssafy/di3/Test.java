package com.ssafy.di3;

public class Test {
	public static void main(String[] args) {
		
		//느슨한 결합!
		Desktop computer = new Desktop();
		Laptop computer2 = new Laptop();
		Programmer p = new Programmer(computer);
		p.coding();
		
		p.setComputer(computer);
		p.coding();
	}
}
