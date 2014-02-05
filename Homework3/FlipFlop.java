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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FlipFlop {   
	public static void main(String[] args) {
   		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int numeroActual = 0;
		double residuo, residuo2;
   		try{
			System.out.println("Ingrese un numero");
			numeroActual = Integer.parseInt(lector.readLine().trim());
			residuo = numeroActual%3;
			residuo2 = numeroActual%4;
			if(residuo == 0){
				residuo2 = numeroActual%5;
				if(residuo2 == 0){
					System.out.println("FlipFlop");
				}else{
					System.out.println("Flip");
				}
			}else if(residuo2 == 0){
				System.out.println("Flop");
			}else{
				System.out.println("El numero que ingreso es: " + numeroActual);
			}
		}catch(IOException e){
			System.out.println("\nError: " + e.getMessage());
		}catch(NumberFormatException e){
			System.out.println("\nError: El dato ingresado no es un numero.");
		}
	}
}