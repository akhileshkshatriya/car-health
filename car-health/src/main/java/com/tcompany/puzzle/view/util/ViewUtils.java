package com.tcompany.puzzle.view.util;

import java.util.Arrays;

public class ViewUtils {

	private static int BROKEN_RANGE = 65;

	public static String displayHealth(String articleName, String name, int health) {
		char[] hyphens = new char[30];
		Arrays.fill(hyphens, 0, 30, '-');
		StringBuilder statisticsBuilder = new StringBuilder();
		statisticsBuilder.append("\n");
		statisticsBuilder.append(String.format("%-30s", articleName));
		statisticsBuilder.append("\n");
		statisticsBuilder.append(hyphens);
		statisticsBuilder.append("\n");
		statisticsBuilder.append("| Name: " + String.format("%20s", name) + " |");
		statisticsBuilder.append("\n");
		statisticsBuilder.append("| Health: " + String.format("%18s", health + "%") + " |");
		statisticsBuilder.append("\n");
		statisticsBuilder.append(hyphens);
		return statisticsBuilder.toString();
	}

	public static String displayOverAllHealth(int engineHealth, int transMissionHealth, int brakeHealth) {
		char[] hyphens = new char[30];
		Arrays.fill(hyphens, 0, 30, '-');
		StringBuilder statisticsBuilder = new StringBuilder();
		statisticsBuilder.append("\n");
		if (isBroken(engineHealth, transMissionHealth, brakeHealth)) {
			statisticsBuilder.append("Car Health: " + String.format("%18s", "BROKEN"));
		} else {
			statisticsBuilder.append("Car Health: " + String.format("%18s", "OK"));
		}

		statisticsBuilder.append("\n");
		statisticsBuilder.append(hyphens);
		statisticsBuilder.append("\n");
		statisticsBuilder.append("| Engine: " + String.format("%18s", engineHealth + "%") + " |");
		statisticsBuilder.append("\n");
		statisticsBuilder.append("| Transmission: " + String.format("%12s", transMissionHealth + "%") + " |");
		statisticsBuilder.append("\n");
		statisticsBuilder.append("| Brake: " + String.format("%19s", brakeHealth + "%") + " |");
		statisticsBuilder.append("\n");
		statisticsBuilder.append(hyphens);
		return statisticsBuilder.toString();
	}

	protected static boolean isBroken(int engineHealth, int transMissionHealth, int brakeHealth) {

		if (engineHealth < BROKEN_RANGE) {
			return true;
		}
		if (transMissionHealth < BROKEN_RANGE) {
			return true;
		}
		if (brakeHealth < BROKEN_RANGE) {
			return true;
		}
		return false;
	}
}
