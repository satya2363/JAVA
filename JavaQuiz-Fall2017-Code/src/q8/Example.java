package q8;

 
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
		A a = new A();
		Object o = (Object)a; //upcasting a to type Object
		B b = (B)o; 		// down casting A to type B (this is not possible)
		b.foo();
	}
}