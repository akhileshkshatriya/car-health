package com.tcompany.puzzle.factory;

import com.tcompany.puzzle.api.Command;
import com.tcompany.puzzle.command.CarReceiver;
import com.tcompany.puzzle.command.GetBrakeHealthCommand;
import com.tcompany.puzzle.command.GetEngineHealthCommand;
import com.tcompany.puzzle.command.GetTransmissionHealthCommand;

public class CommandFactory {

	public static final String ENGINE = "engine";
	public static final String TRANSMISSION = "transmission";
	public static final String BRAKE = "brake";

	private static CommandFactory factory = new CommandFactory();

	private CarReceiver receiver = new CarReceiver();
	private Command engineHealthCommand = new GetEngineHealthCommand(receiver);
	private Command breakHealthCommand = new GetBrakeHealthCommand(receiver);
	private Command transmissionHealthCommand = new GetTransmissionHealthCommand(receiver);

	private CommandFactory() {}

	public static CommandFactory getInstance() {
		return factory;
	}

	public Command getCommand(String commandName) {
		if (ENGINE.equals(commandName)) {
			return engineHealthCommand;
		}

		if (TRANSMISSION.equals(commandName)) {
			return transmissionHealthCommand;
		}
		if (BRAKE.equals(commandName)) {
			return breakHealthCommand;
		}

		return null;
	}
}
