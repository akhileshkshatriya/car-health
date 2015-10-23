package com.tcompany.puzzle.factory;

import com.tcompany.puzzle.api.BaseView;
import com.tcompany.puzzle.view.BrakeView;
import com.tcompany.puzzle.view.EngineView;
import com.tcompany.puzzle.view.HomeView;
import com.tcompany.puzzle.view.OverAllView;
import com.tcompany.puzzle.view.TransmissionView;

public class ViewFactory {

	public static final String HOME = "home";
	public static final String ENGINE = "engine";
	public static final String TRANSMISSION = "transmission";
	public static final String BRAKE = "brake";
	public static final String OVERALL = "overall";
	
	private static ViewFactory factory = new ViewFactory();

	private ViewFactory() {}
	
	public static ViewFactory getInstance() {
		return factory;
	}

	public BaseView getView(String viewName) {
		if (HOME.equals(viewName)) {
			return new HomeView();
		}

		if (ENGINE.equals(viewName)) {
			return new EngineView();
		}

		if (TRANSMISSION.equals(viewName)) {
			return new TransmissionView();
		}
		if (BRAKE.equals(viewName)) {
			return new BrakeView();
		}
		if (OVERALL.equals(viewName)) {
			return new OverAllView();
		}

		return null;
	}
}
