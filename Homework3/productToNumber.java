/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class productToNumber{   
	public static void main(String[] args) {
   		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int resultado = 1;
		String var = "";
   		try{
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(lector.readLine().trim());;
			if(num >= 1){
				for(int i = 1; i<=num;i++){
					if(i != num){
						var = var + i + "x";
					}else{
						var = var + i;
					}
					resultado = resultado * i;
				}
				System.out.println("Su resultado es: " + var + " = " + resultado);
			}
		}catch(IOException e){
			System.out.println("\nError: " + e.getMessage());
		}catch(NumberFormatException e){
			System.out.println("\nError: El dato ingresado no es un dato valido.");
		}
	}
}