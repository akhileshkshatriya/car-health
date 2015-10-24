package com.tcompany.puzzle;

import com.tcompany.puzzle.factory.ViewFactory;
import com.tcompany.puzzle.factory.enm.Views;

public class MainClass {
	public static void main(String[] args) {
		ViewFactory.getInstance().getView(Views.HOME).display();
	}
}
