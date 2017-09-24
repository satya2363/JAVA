package r02;
 
class A {
	A(int x){
		this.x = x;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (x != other.x)
			return false;
		return true;
	}

	int x;
}
 
class Example {
	public static void main(String[] args){
		A a1 = new A(17);
		A a2 = new A(17);
		if (a1 == a2){
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		if (a1.equals(a2)){
			System.out.println("3");
		} else {
			System.out.println("4");
		}
	}
}
