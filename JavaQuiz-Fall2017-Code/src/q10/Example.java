package q10;

class A {
	public void foo(){ 
		System.out.println("A.foo");
	}
}
class B extends A {
	public void foo(){ 
		System.out.println("B.foo");
	}
}

class Example {
	public static void main(String[] args){
		Object[] os = new Object[3]; //Array of type Object
		os = new Object[]{ new A(), new Object(), new B() }; 
		for (Object o : os){
			if (o instanceof A){ // B extends A so os[3] can be an instance of A.
				((A)o).foo();
			}  
		}
	}
}
