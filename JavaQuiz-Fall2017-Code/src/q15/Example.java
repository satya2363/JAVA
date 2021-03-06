package q15;

/**
 * Example "Puzzle 36" from "Java Puzzlers" by Joshua Bloch and Neal Gafter   
 */
class Example {

	public static void main(String[] args){
		System.out.println(decision());
	}
	
	static boolean decision() {
	  try {
	    return true;
	  } finally { 	// finally block is always executed no matter what
	  				// only after finally is executed the control goes back to decision()
	    return false;
	  }
	}
}