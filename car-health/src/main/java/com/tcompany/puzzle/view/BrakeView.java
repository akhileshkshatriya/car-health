package com.tcompany.puzzle.view;

import com.tcompany.puzzle.api.BaseView;
import com.tcompany.puzzle.api.Command;
import com.tcompany.puzzle.factory.CommandFactory;
import com.tcompany.puzzle.view.util.ViewUtils;

public class BrakeView implements BaseView {

	@Override
	public void display() {
		Command command = CommandFactory.getInstance().getCommand(CommandFactory.BRAKE);
		int health = command.execute();
		System.out.println(ViewUtils.displayHealth("Brake Details", "Brake", health));
	}

}
