package com.tcompany.puzzle.view.lambda;

import java.util.function.Supplier;

public class HomeViewLambda {
	
	public static Supplier<String> dialog = ()->{
		return "\n"+
				"Welcome to Car Health Check. \n"+
				"Here, you can check the health of over all Car or specific parts. \n"
				;	
		};
	
	public static Supplier<String> options = () -> {
		return "\n"+
				"Please Select...\n"+
				"[E] Engine\n"+
				"[T] Transmission\n"	+
				"[B] Brakes\n"	+
				"[O] Overall Check\n" +
				"[X] Exit" +
				"\n"+
				"\n"
				;
	};
	
	public static Supplier<String> error = ()->{
		return "\n"+
				"Wrong Input, Please Try again \n";	
		};
	
	
	public static void display(Supplier<String> options){
		System.out.println(options.get());
	}
}
