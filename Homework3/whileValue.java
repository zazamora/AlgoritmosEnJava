/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class whileValue{   
	public static void main(String[] args) {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int valorActual = 0;
		String var = "";
		try{
			System.out.println("Ingrese un numero");
			valorActual = Integer.parseInt(lector.readLine().trim());
			if(valorActual > 0){
				for(int i = 0; i < valorActual; i++){
					var = var + "El valor actual es: " + i + "\n";
				}
				System.out.println("\n" + var);
			}
		}catch(IOException e){
			System.out.println("\nError: " + e.getMessage());
		}catch(NumberFormatException e){
			System.out.println("\nError: El dato ingresado no es un dato valido.");
		}
	}
}