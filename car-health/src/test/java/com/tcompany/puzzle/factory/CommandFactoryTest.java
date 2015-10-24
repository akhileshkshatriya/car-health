package com.tcompany.puzzle.factory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.tcompany.puzzle.api.Command;
import com.tcompany.puzzle.command.GetBrakeHealthCommand;
import com.tcompany.puzzle.command.GetEngineHealthCommand;
import com.tcompany.puzzle.command.GetTransmissionHealthCommand;
import com.tcompany.puzzle.factory.enm.Commands;

@RunWith(MockitoJUnitRunner.class)
public class CommandFactoryTest {

	@InjectMocks
	private CommandFactory factory;

	
	@Test
	public void givenEngineFactoryShouldReturnGetEngineHealthCommand() {
		Command command = factory.getCommand(Commands.ENGINE);
		assertNotNull(command);
		assertTrue(command instanceof GetEngineHealthCommand);
	}

	@Test
	public void givenTransmissionFactoryShouldReturnGetTransmissionHealthCommand() {
		Command command = factory.getCommand(Commands.TRANSMISSION);
		assertNotNull(command);
		assertTrue(command instanceof GetTransmissionHealthCommand);
	}

	@Test
	public void givenTransmissionFactoryShouldReturnGetBrakeHealthCommand() {
		Command command = factory.getCommand(Commands.BRAKE);
		assertNotNull(command);
		assertTrue(command instanceof GetBrakeHealthCommand);
	}
	
	@Test
	public void testGetInstance() {
		CommandFactory factory = CommandFactory.getInstance();
		assertNotNull(factory);
	}

}
