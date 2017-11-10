package pilas;

import tadPila.Pila;
import tadPila.PilaVacia;

public class sumaElementos {
	 public static int sumaElementos (Pila D) throws PilaVacia {
		int elem,suma=0;
		if(!D.pilaVacia()){
			elem=D.desapilar();
			suma = elem + sumaElementos(D);
			D.apilar(elem);
		}
		return suma;
	 }

}
