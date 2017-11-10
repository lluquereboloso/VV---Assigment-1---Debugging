package pilas;

import tadPila.Pila;
import tadPila.PilaVacia;

public class sumaElemPares {
	public  int sumaElemPares (Pila D) throws PilaVacia {
		int elem,sumapares=0,i=0;
		if(!D.pilaVacia()){
			while(i<10){
			elem=D.desapilar();
			sumapares = elem + sumaElemPares(D);
			D.apilar(elem);
			i=i+2;
		}
	 }
		return sumapares;

}

}
