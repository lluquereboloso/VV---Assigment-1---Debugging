package vyv2017.grupo0.DebuggingTechniques;
import tadPila.Pila;
import tadPila.PilaVacia;
import tadPila.TadPila;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main (String [ ] args) throws PilaVacia {
		Pila pila1 = new TadPila(); 
		int i, num,x=1;	
		System.out.println();	
		pila1.apilar(4);
		pila1.apilar(2);
		pila1.apilar(2);
		pila1.apilar(5);
		pila1.apilar(6);
		escribirPila(pila1);
		num = sumaElementPares(pila1,x);	
		System.out.println("Suma de elementos pares: " + num);	
	}
	public static void escribirPila(Pila pila) throws PilaVacia{
		int elem;
		if(!pila.pilaVacia()){
			elem=pila.desapilar();
			System.out.println(elem);
			escribirPila(pila);
			pila.apilar(elem);
		}
	}
	


}
