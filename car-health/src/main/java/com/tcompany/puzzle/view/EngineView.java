package com.tcompany.puzzle.view;

import com.tcompany.puzzle.api.BaseView;
import com.tcompany.puzzle.api.Command;
import com.tcompany.puzzle.factory.CommandFactory;
import com.tcompany.puzzle.factory.enm.Commands;
import com.tcompany.puzzle.view.util.ViewUtils;

public class EngineView implements BaseView {
	
	@Override
	public void display() {
		Command command = CommandFactory.getInstance().getCommand(Commands.ENGINE);
		int health = command.execute();
		System.out.println(ViewUtils.displayHealth("Engine Details", "Turbo", health));
	}
}
