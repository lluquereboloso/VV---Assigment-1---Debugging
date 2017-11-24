
package vyv2017.grupo0.DebuggingTechniques;

import tadPila.Pila;
import tadPila.PilaVacia;
import tadPila.TadPila;

public class sumaElementosPares {

	static int sumar (Pila pila) throws PilaVacia {
		int elem, resul;
		if (! pila.pilaVacia ()) {
			elem = pila.desapilar ();
			resul = elem + sumar(pila);
			pila.apilar (elem);
		}
		else resul = 0;
		return resul;
	}
	public static void main (String [ ] args) throws PilaVacia {
		Pila pila1 = new TadPila(); 
		int i, num;	
		System.out.println();	
		for (i= 1; i<= 10; i++) 
			if(i%2==0)
			   pila1.apilar(i);
		       num = sumar(pila1);	
		    System.out.println("Numero de elementos: " + num);	
	}
}
