package com.tcompany.puzzle;

import com.tcompany.puzzle.factory.ViewFactory;

public class MainClass {
	public static void main(String[] args) {
		ViewFactory.getInstance().getView(ViewFactory.HOME).display();
	}
}
