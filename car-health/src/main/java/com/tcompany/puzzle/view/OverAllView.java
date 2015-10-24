package com.tcompany.puzzle.view;

import com.tcompany.puzzle.api.BaseView;
import com.tcompany.puzzle.api.Command;
import com.tcompany.puzzle.factory.CommandFactory;
import com.tcompany.puzzle.factory.enm.Commands;
import com.tcompany.puzzle.view.util.ViewUtils;

public class OverAllView implements BaseView {

	@Override
	public void display() {

		CommandFactory factory = CommandFactory.getInstance();
		Command command = factory.getCommand(Commands.ENGINE);
		int engineHealth = command.execute();
		command = factory.getCommand(Commands.TRANSMISSION);
		int transMissionHealth = command.execute();
		command = factory.getCommand(Commands.BRAKE);
		int brakeHealth = command.execute();
		System.out.println(ViewUtils.displayOverAllHealth(engineHealth, transMissionHealth, brakeHealth));

	}

}
