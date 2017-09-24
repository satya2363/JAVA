package q4;


class A {
	void foo(){ 
		System.out.println("A.foo");
	}
	void bar(){ 
		System.out.println("A.bar");
		this.foo();
	}
}

class B extends A {   //has bar()
	void foo(){ 
		System.out.println("B.foo");
	}
	void bar(){  
		System.out.println("B.bar"); 
		this.foo(); //this refers to C
	}
}

class C extends B {  // no bar() but extends B
	void foo(){ 
		System.out.println("C.foo"); // final out put
	}
}

class Example {
	public static void main(String[] args){
		A a = new C();
		a.bar(); // still object of C
	}
}