package com.tcompany.puzzle.factory;

import com.tcompany.puzzle.api.BaseView;
import com.tcompany.puzzle.factory.enm.Views;
import com.tcompany.puzzle.view.BrakeView;
import com.tcompany.puzzle.view.EngineView;
import com.tcompany.puzzle.view.HomeView;
import com.tcompany.puzzle.view.OverAllView;
import com.tcompany.puzzle.view.TransmissionView;

public class ViewFactory {

	private static ViewFactory factory = new ViewFactory();

	private ViewFactory() {
	}

	public static ViewFactory getInstance() {
		return factory;
	}

	public BaseView getView(Views views) {
		switch (views) {
		case ENGINE:
			return new EngineView();
		case TRANSMISSION:
			return new TransmissionView();
		case BRAKE:
			return new BrakeView();
		case OVERALL:
			return new OverAllView();
		case HOME:
			return new HomeView();
		default:
			return null;
		}
	}
}
