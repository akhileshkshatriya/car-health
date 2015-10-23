package com.tcompany.puzzle.command;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.tcompany.puzzle.TestCommon;

@RunWith(MockitoJUnitRunner.class)
public class GetTransmissionHealthCommandTest extends TestCommon {
	
	@Mock
	private CarReceiver receiver;
	
	@InjectMocks
	private GetTransmissionHealthCommand command;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test(){
		when(receiver.getTransmissionHealth()).thenReturn(HEALTH_OK);
		
		int health = command.execute();
		
		assertEquals(health, HEALTH_OK);
		verify(receiver).getTransmissionHealth();
		
	}

}
