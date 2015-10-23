package com.tcompany.puzzle.command;

import com.tcompany.puzzle.api.Command;

public class GetEngineHealthCommand implements Command {

	private CarReceiver receiver;

	public GetEngineHealthCommand(CarReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public int execute() {
		return receiver.getEngineHealth();
	}

}
