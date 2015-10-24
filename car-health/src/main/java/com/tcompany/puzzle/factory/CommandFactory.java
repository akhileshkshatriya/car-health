package com.tcompany.puzzle.factory;

import com.tcompany.puzzle.api.Command;
import com.tcompany.puzzle.command.CarReceiver;
import com.tcompany.puzzle.command.GetBrakeHealthCommand;
import com.tcompany.puzzle.command.GetEngineHealthCommand;
import com.tcompany.puzzle.command.GetTransmissionHealthCommand;
import com.tcompany.puzzle.factory.enm.Commands;

public class CommandFactory {

	private static CommandFactory factory = new CommandFactory();

	private CarReceiver receiver = new CarReceiver();
	private Command engineHealthCommand = new GetEngineHealthCommand(receiver);
	private Command breakHealthCommand = new GetBrakeHealthCommand(receiver);
	private Command transmissionHealthCommand = new GetTransmissionHealthCommand(receiver);

	private CommandFactory() {}

	public static CommandFactory getInstance() {
		return factory;
	}

	public Command getCommand(Commands commands) {
		switch (commands) {
		case ENGINE:
			return engineHealthCommand;
		case TRANSMISSION:
			return transmissionHealthCommand;
		case BRAKE:
			return breakHealthCommand;
		default:
			return null;
		}
	}
}
