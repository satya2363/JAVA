package q6;

 
class A {
	public void foo(){ 
		System.out.println("A.foo");
		this.bar(); 
	}
	public void bar(){ 
		System.out.println("A.bar"); 
	}
}
class B extends A {
	public void foo(){ 
		System.out.println("B.foo");
		this.bar(); //this refers to B
		super.bar();// super refers to A
	}
	public void bar(){ 
		System.out.println("B.bar"); 
	}
}

class Example {
	public static void main(String[] args){
		A a = new B();
		a.foo(); //object of B
	}
}