/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.util.Random;

public class randomSelectionButton {
	
	public static String getHTML() { // return string with 2 random integers
		
		//Create 2 instances of random
		Random randintM = new Random();
		Random randintN = new Random();
		
		//Assign the 2 instances
		int M = randintM.nextInt(6);
		int N = randintN.nextInt(7);
		
		//Add to URL
		return "\"HTMLJeopardy/answer" + Integer.toString(M) + "x" + Integer.toString(N) + ".html\"";
	
	}
	
}
