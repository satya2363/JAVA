package q7;

 
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
		B b = new B();
		Object o = (Object)b; //upcasting b to Object
		A a = (A)o;  		// down casting b/o to A
		a.foo(); 		// still a is instance of B
	}
}