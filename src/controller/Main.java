package controller;

import model.*;
/**
 * Main class
 * @public
 */
public class Main {
	
	/**
	 * Main method that starts the programm.
	 * @param {String[]} args	the start parameters
	 * @public
	 */
	public static void main(String[] args) {
		Map x = new Map(5, 15, MapType.STANDARD);
		
		x.initialize();
		
		x.output();
	}

}
