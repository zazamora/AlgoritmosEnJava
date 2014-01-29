/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   

   public static void main(String[] args) {
   		int numeroActual = 0;
   		System.out.println(args[0]);

   		// si el numero es divisible dentro de 3 imprima "Flip"
			System.out.println("Flip");

   		// si el numero es divisible dentro de 4 imprima "Flop"
			System.out.println("Flop");

   		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
			System.out.println("FlipFlop");

   		// de lo contrario, imprima el numero
      		System.out.println(numeroActual);
   }

}