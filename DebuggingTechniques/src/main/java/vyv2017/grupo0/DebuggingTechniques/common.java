   
 public void mostrar (Pila p) {
	int elem;
	if (!p.pilaVacia()) {
		elem = p.desapilar();
		System.out.println("" + elem + ", ");
		mostrar(p);
		p.apilar(elem);
	 }	
 } 
 public static void main (String[] args) throws PilaVacia {
	  Pila O = new TadPila ();
	  int size =0;
	  O.apilar (1);
	  O.apilar (2);
	  O.apilar (3);
	  O.apilar (11);
	  O.apilar (15);
	  // Invocation to the function
	  mostrar(O);
	  size = O.size();
	  System.out.println ("The size is " + size);	  
  }