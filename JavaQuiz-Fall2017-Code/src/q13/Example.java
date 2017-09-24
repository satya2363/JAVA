package q13;

class Example {

	static class Pair {
		public Pair(int first, int second){
			this.first = first;
			this.second = second;
		}
		
		private int first;
		private int second;
	}
	
	public static void main(String[] args){
		Pair p1 = new Pair(3,4);// static class can have only 1 object
		Pair p2 = new Pair(7,8);
		Pair p3 = new Pair(3,4);
		if (p1.equals(p1)){
		  System.out.println("foo");  
		}
		if (p1.equals(p2)){
      System.out.println("bar");
    }
		if (p1.equals(p3)){ 	//even if equals gives true only 1 object is possible, so p3 doesn't count
      System.out.println("baz");
    }
		
	}

	 
}