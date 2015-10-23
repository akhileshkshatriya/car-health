package com.tcompany.puzzle.view;

import java.util.Scanner;

import com.tcompany.puzzle.api.BaseView;
import com.tcompany.puzzle.factory.ViewFactory;
import com.tcompany.puzzle.view.lambda.HomeViewLambda;

public class HomeView implements BaseView {

	@Override
	public void display() {
		displayDialog();
		displayOptions();
	}

	public void displayOptions() {
		HomeViewLambda.display(HomeViewLambda.options);
		Scanner scanner = new Scanner(System.in);
		try {
			char userInput = scanner.next().charAt(0);
			userInput = Character.toUpperCase(userInput);
			switch (userInput) {
			case 'E':
				ViewFactory.getInstance().getView(ViewFactory.ENGINE).display();
				displayOptions();
				break;
			case 'T':
				ViewFactory.getInstance().getView(ViewFactory.TRANSMISSION).display();
				displayOptions();
				break;
			case 'B':
				ViewFactory.getInstance().getView(ViewFactory.BRAKE).display();
				displayOptions();
				break;
			case 'O':
				ViewFactory.getInstance().getView(ViewFactory.OVERALL).display();
				displayOptions();
				break;
			case 'X':
				System.exit(0);
				break;
			default:
				displayErrorWithOptions();
			}
		} catch (Exception e) {
			displayErrorWithOptions();
		}
	}

	public void displayDialog() {
		HomeViewLambda.display(HomeViewLambda.dialog);
	}

	protected void displayErrorWithOptions() {
		HomeViewLambda.display(HomeViewLambda.error);
		displayOptions();
	}
}
