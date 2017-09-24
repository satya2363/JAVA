package q11;
//pick errors
interface I { }
interface J { }
class A implements I { }
class B implements J { }
class C extends B implements I, J { }
 
class Example {
	public static void main(String[] args){
		I i = null;
		J j = null;
		Object o = new Object();
		A a = new A();
		B b = new B();
		C c = new C();
		i = j; //* both interfaces
		i = a; 	
		i = b; //* b dosen't implement I
		i = c; 
		i = o; //* o is root object
		j = i; //* both interface
		j = a; //* a doesn't implement J
		j = b; 
		j = c; 
		j = o; //* o is root object
		a = i; //* cannot assign object to interface type
		a = j; //* cannot assign object to interface type
		a = b; //* both classes impelement different interfaces
		a = c;  
		a = o; //* don't know
		b = i; //* cannot assign object to interface type
		b = j; //* cannot assign object to interface type
		b = a; //* both classes impelement different interfaces
		b = c;
		b = o; //*
		c = i; //* cannot assign object to interface type
		c = j; //* cannot assign object to interface type
		c = a; //*
		c = b; //*
		c = o; //* 
		o = i; 
		o = j; //not a clue
		o = a;  
		o = b;
		o = c;
	}
}