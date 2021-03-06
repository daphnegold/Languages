package PlanetExpress;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Boolean playAgain = true;
		Integer response;
		Scanner user_input = new Scanner( System.in );
		Crew crew = new Crew();
		
		for (Member member : crew.members) {
			System.out.println(member.name + " reporting for space adventures!");
		}
		

	    while (playAgain) {
	    	System.out.println("Professor Farnsworth: What should we do now?");
		    System.out.println("1. Give Fry a drink");
		    System.out.println("2. Send Leela to deliver stuff");
		    System.out.println("3. Steal with Bender");
		    System.out.println("4. Feed Zoidberg");
		    System.out.println("5. Accounting with Hermes");
		    
	    	if (user_input.hasNextInt()) {
	    		response = user_input.nextInt();
	    		 if (response <= 5 && response > 0) {
	    		   	System.out.println("You chose " + response + ".");
	    		 }
	    	} else {
	    		System.out.println("Bad news, you're not good at this.");	
	            user_input.next();
	            continue;
	        }
	    	
	    	switch (response) {
	    	case 1: 
	    		System.out.println(crew.perform(Crew.Action.DRINK));
	    		break;
	    	case 2:
	    		System.out.println(crew.perform(Crew.Action.DELIVER));
	    		break;
	    	case 3:
	    		System.out.println(crew.perform(Crew.Action.STEAL));
	    		break;
	    	case 4:
	    		System.out.println(crew.perform(Crew.Action.EAT));
	    		break;
	    	case 5:
	    		System.out.println(crew.perform(Crew.Action.ACCOUNT));
	    		break;
	    	default:
	    		System.out.println("Bad news, that's not one of the choices.");
	    		continue;
	    	}
	    	
	    	System.out.println(crew.status());
	    	System.out.println(crew.warn());
	    	System.out.println("Score: " + crew.score());
	    	
	    	if (!crew.check()) {
	    		playAgain = false;
	    		System.out.println("Good news, everyone! Your crew is unstable, and I'm firing you all!");
	    	}
	    	
	    }
	    
	}

}
