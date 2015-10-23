package com.tcompany.puzzle.factory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.tcompany.puzzle.api.Command;
import com.tcompany.puzzle.command.GetBrakeHealthCommand;
import com.tcompany.puzzle.command.GetEngineHealthCommand;
import com.tcompany.puzzle.command.GetTransmissionHealthCommand;

@RunWith(MockitoJUnitRunner.class)
public class CommandFactoryTest {

	@InjectMocks
	private CommandFactory factory;

	
	@Test
	public void givenEngineFactoryShouldReturnGetEngineHealthCommand() {
		Command command = factory.getCommand(CommandFactory.ENGINE);
		assertNotNull(command);
		assertTrue(command instanceof GetEngineHealthCommand);
	}

	@Test
	public void givenTransmissionFactoryShouldReturnGetTransmissionHealthCommand() {
		Command command = factory.getCommand(CommandFactory.TRANSMISSION);
		assertNotNull(command);
		assertTrue(command instanceof GetTransmissionHealthCommand);
	}

	@Test
	public void givenTransmissionFactoryShouldReturnGetBrakeHealthCommand() {
		Command command = factory.getCommand(CommandFactory.BRAKE);
		assertNotNull(command);
		assertTrue(command instanceof GetBrakeHealthCommand);
	}
	
	@Test
	public void givenNotDefined_FactoryShouldReturn_null() {
		Command command = factory.getCommand("test-cmd");
		assertNull(command);
	}

	@Test
	public void testGetInstance() {
		CommandFactory factory = CommandFactory.getInstance();
		assertNotNull(factory);
	}

}
