package q3;
class A {
	void foo(Object o){ 
		System.out.println("1");
	}
	void foo(A a){ 
		System.out.println("2");
	}
}
class B extends A {
	void foo(Object o){ 
		System.out.println("3");
	}
	void foo(A a){ 
		System.out.println("4");
	}
}
class Example {
	public static void main(String[] args){
		A a1 = new B();
		A a2 = new A();
		a1.foo(a2); //method overloading (compile time) 4
		Object o = a2;  //Upcasting a2 (happens in runtime)
		a1.foo(o);//method overloading (compile time) 3
	}
}