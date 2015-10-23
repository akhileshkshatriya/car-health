package com.tcompany.puzzle.command;

import com.tcompany.puzzle.api.Command;

public class GetTransmissionHealthCommand implements Command{

	private CarReceiver receiver;

	public GetTransmissionHealthCommand(CarReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public int execute() {
		return receiver.getTransmissionHealth();
	}

}
