/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class oddEven{   
	public static void main(String[] args) {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		double res = 0;
		try{
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(lector.readLine().trim());
			res = num%2;
			if(res == 0){
				System.out.println("Es par");
			}else{
				System.out.println("Es impar");
			}
		}catch(IOException e){
			System.out.println("\nError: " + e.getMessage());
		}catch(NumberFormatException e){
			System.out.println("\nError: El dato ingresado no es un dato valido.");
		}
	}
}