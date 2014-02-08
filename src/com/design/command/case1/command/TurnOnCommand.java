package com.design.command.case1.command;

import com.design.command.case1.machine.CommonMachine;

public class TurnOnCommand implements ActionCommand {

	public CommonMachine machine;

	
	
	public TurnOnCommand(CommonMachine machine) {
		super();
		this.machine = machine;
	}



	@Override
	public void excute() {
		machine.turnOn();

	}

}
