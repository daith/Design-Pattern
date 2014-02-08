package com.design.command.case1.command;

import com.design.command.case1.machine.CommonMachine;

public class TurnOffCommand implements ActionCommand {

	public CommonMachine machine;

	
	
	public TurnOffCommand(CommonMachine machine) {
		super();
		this.machine = machine;
	}



	@Override
	public void excute() {
		machine.turnOff();

	}

}
