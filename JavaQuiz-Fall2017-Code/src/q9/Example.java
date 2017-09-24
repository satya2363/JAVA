package q9;

class A {
	public void foo(){ 
		System.out.println("A.foo");
	}
	public void bar(){ 
		System.out.println("A.bar"); 
	}
}
class B extends A {
	public void foo(){ 
		System.out.println("B.foo");
	}
	public void bar(){ 
		System.out.println("B.bar"); 
	}
}

class Example {
	public static void main(String[] args){
		A[] as = new A[2];  //array of type A
		as[0] = new A(); 	// storing object of A
		as[1] = new B();	// storing object of B but type A <==> A as[1] = new B()
		for (A a : as){
			a.foo();
		}
	}
}