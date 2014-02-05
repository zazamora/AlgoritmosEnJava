/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class rangeSum{   
	public static void main(String[] args){
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0;
		int num2 = 0;
		String var = "";
		try{
			System.out.println("Ingrese el primer numero");
			num1 = Integer.parseInt(lector.readLine().trim());
			System.out.println("Ingrese el segundo numero");
			num2 = Integer.parseInt(lector.readLine().trim());
			if(num1 > num2){
				if(num1 != num2-1){
					for(int i = num2 + 1; i < num1;i++){
						if(i != num1 -1){
							var = var + i + ",";
						}else{
							var = var + i;
						}
					}
					System.out.println("Los numeros dentro del rango ingresado son: " + var);
				}else{
					System.out.println("Los numeros ingresados no tienen valores intermedios.");
				}
			}else if(num2 > num1){
				if(num2 != num1+1){
					for(int i = num1 + 1; i < num2;i++){
						if(i != num2 -1){
							var = var + i + ",";
						}else{
							var = var + i;
						}
					}
					System.out.println("Los numeros dentro del rango ingresado son: " + var);
				}else{
					System.out.println("Los numeros ingresados no tienen valores intermedios.");
				}
			}else{
				System.out.println("Los numeros ingresados no tienen valores intermedios.");
			}
		}catch(IOException e){
			System.out.println("\nError: " + e.getMessage());
		}catch(NumberFormatException e){
			System.out.println("\nError: El dato ingresado dato valido.");
		}
	}
}