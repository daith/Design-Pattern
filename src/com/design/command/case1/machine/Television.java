package com.design.command.case1.machine;

public class Television implements CommonMachine {
	
	
	@Override
	public void turnOn() {
		System.out.println("TV is on");

	}

	@Override
	public void turnOff() {
		System.out.println("TV is off");

	}

}
