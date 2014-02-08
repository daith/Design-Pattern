package com.design.command.case1;

import com.design.command.case1.command.ActionCommand;
import com.design.command.case1.command.TurnOnCommand;

public class Remote {

	public ActionCommand command;

	public void setCommand(ActionCommand command) {
		this.command = command;
	}			
	
	
	public void excute(){
		command.excute();
	}


	
	
}
