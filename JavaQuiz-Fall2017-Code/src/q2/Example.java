package q2;
class A {
	void foo(){ 
		System.out.println("A.foo");
	}
	void bar(){
		this.foo();
	}
}
class B extends A {
	void foo(){ 
		System.out.println("B.foo");
	}
}
class Example {
	public static void main(String[] args){
		A a = new B();
		a.foo();
	}
}