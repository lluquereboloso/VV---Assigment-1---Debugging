package vyv2017.grupo0.DebuggingTechniques;

import tadPila.Pila;
import tadPila.PilaVacia;

public class SumaElementPares {
		public int sumaElementPares (Pila D, int i) throws PilaVacia {
			int elem, suma=0;
			if(!D.pilaVacia()){
					elem = D.desapilar();
					if(i%2 == 0)
						suma = elem + sumaElementPares(D,i+1);
					else
						suma = sumaElementPares(D,i+1);
					D.apilar(elem);
			}
			return suma;
			
		}
}



