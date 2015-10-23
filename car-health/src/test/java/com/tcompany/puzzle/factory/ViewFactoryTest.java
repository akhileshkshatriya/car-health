package com.tcompany.puzzle.factory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.tcompany.puzzle.api.BaseView;
import com.tcompany.puzzle.view.BrakeView;
import com.tcompany.puzzle.view.EngineView;
import com.tcompany.puzzle.view.HomeView;
import com.tcompany.puzzle.view.OverAllView;
import com.tcompany.puzzle.view.TransmissionView;

@RunWith(MockitoJUnitRunner.class)
public class ViewFactoryTest {

	@InjectMocks
	private ViewFactory factory;

	@Test
	public void givenEngine_FactoryShouldReturn_EngineView() {
		BaseView view = factory.getView(ViewFactory.ENGINE);
		assertNotNull(view);
		assertTrue(view instanceof EngineView);
	}
	
	@Test
	public void givenTransmission_FactoryShouldReturn_TransmissionView() {
		BaseView view = factory.getView(ViewFactory.TRANSMISSION);
		assertNotNull(view);
		assertTrue(view instanceof TransmissionView);
	}
	
	@Test
	public void givenBrake_FactoryShouldReturn_BrakeView() {
		BaseView view = factory.getView(ViewFactory.BRAKE);
		assertNotNull(view);
		assertTrue(view instanceof BrakeView);
	}
	
	@Test
	public void givenHome_FactoryShouldReturn_HomeView() {
		BaseView view = factory.getView(ViewFactory.HOME);
		assertNotNull(view);
		assertTrue(view instanceof HomeView);
	}
	
	@Test
	public void givenOverAll_FactoryShouldReturn_OverAllView() {
		BaseView view = factory.getView(ViewFactory.OVERALL);
		assertNotNull(view);
		assertTrue(view instanceof OverAllView);
	}
	
	@Test
	public void givenNotDefined_FactoryShouldReturn_null() {
		BaseView view = factory.getView("test-view");
		assertNull(view);
	}
	
	@Test
	public void testGetInstance() {
		ViewFactory factory = ViewFactory.getInstance();
		assertNotNull(factory);
	}
}
