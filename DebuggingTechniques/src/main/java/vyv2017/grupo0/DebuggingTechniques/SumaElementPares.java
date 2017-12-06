package vyv2017.grupo0.DebuggingTechniques;

import tadPila.Pila;
import tadPila.PilaVacia;

public class SumaElementPares {
		public int sumaElementPares (Pila D) throws PilaVacia {
			int elem, suma=0, i=0;
			if(!D.pilaVacia()){
					elem = D.desapilar();
					if(i%2 == 0)
						suma = elem + sumaElementPares(D);
					else
						suma = sumaElementPares(D);
					D.apilar(elem);
					i=i+2;
			}
			return suma;
			
		}
}



