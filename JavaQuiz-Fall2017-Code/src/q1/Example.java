package q1;

class A {
	void foo(){ 
		System.out.println("A.foo");
	}
}
class B extends A {
	void foo(){ 
		System.out.println("B.foo");
	}
}
class Example {
	public static void main(String[] args){
		B b = new B();
		b.foo();
		A a = b;
		a.foo();
	}
}