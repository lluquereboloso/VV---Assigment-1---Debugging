package pruebaClaseStack;
import java.util.Stack;
import ficheroBinario.RegistroAlumno;

public class PruebaStack {
   static void pruebaPilaString () {
		Stack<String> pila = new Stack<String> ();
		pila.push("hola"); 
		pila.push("Adios");
		System.out.println (pila.size());
		System.out.println (pila.pop());
		System.out.println (pila.peek());
		System.out.println (pila.size());
   }
   static void pruebaPilaInteger () {
		Stack<Integer> pila = new Stack<Integer> ();
		pila.push(22); 
		pila.push(34);
		System.out.println (pila.size());
		System.out.println (pila.pop());
		System.out.println (pila.peek());
		System.out.println (pila.size());
  }
   static void pruebaPilaChar () {
		Stack<Character> pila = new Stack<Character> ();
		pila.push('{'); 
		pila.push('a');
		System.out.println (pila.size());
		System.out.println (pila.pop());
		System.out.println (pila.peek());
		System.out.println (pila.size());
 }
   static void pruebaPilaRegistroAlumno () {
		Stack<RegistroAlumno> pila = new Stack<RegistroAlumno> ();
    	RegistroAlumno alumno = new RegistroAlumno ("b0024","López","Pepe","pepe@mail.es",1993,7);

		pila.push(alumno); 
		alumno = new RegistroAlumno ("b0038","Cuenca","José","jose@mail.es",1993,6);
		pila.push(alumno);
		System.out.println (pila.size());
		System.out.println (pila.pop().aCadena());
		System.out.println (pila.peek().aCadena());
		System.out.println (pila.size());
  }
	
	public static void main(String[] args) {
		pruebaPilaString ();
		pruebaPilaInteger ();
		pruebaPilaRegistroAlumno ();
		pruebaPilaChar ();
	}
}
