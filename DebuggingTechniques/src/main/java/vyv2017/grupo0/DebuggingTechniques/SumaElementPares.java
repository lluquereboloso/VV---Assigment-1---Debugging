package vyv2017.grupo0.DebuggingTechniques;

import tadPila.Pila;
import tadPila.PilaVacia;

public class SumaElementPares {
		public int sumaElementPares (Pila D) throws PilaVacia {
			int elem, suma=0, i=0;
			if(!D.pilaVacia()){
				while (i>10){
					elem = D.desapilar();
					suma = elem + sumaElementPares(D);
					D.apilar(elem);
					i=i+2;
				}
			}
			return suma;
			
		}
}



