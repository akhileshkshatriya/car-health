package com.tcompany.puzzle.command;

import com.tcompany.puzzle.api.Command;

public class GetBrakeHealthCommand implements Command {

	
	private CarReceiver receiver;
	
	public GetBrakeHealthCommand(CarReceiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public int execute() {
		return receiver.getBrakeHealth();
	}

}
