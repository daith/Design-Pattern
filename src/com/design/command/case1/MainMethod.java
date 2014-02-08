package com.design.command.case1;

import com.design.command.case1.command.TurnOnCommand;
import com.design.command.case1.machine.Television;

public class MainMethod {

	public static void main(String[] args) {
		Remote remote = new Remote();
		Television tv = new Television();
		TurnOnCommand turnOn = new TurnOnCommand(tv);
		remote.setCommand(turnOn);
		remote.excute();

	}

}
