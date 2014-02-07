/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/
public class rangeSum{   
	public static void main(String[] args){
		int num1 = Integer.parseInt(args[0].toString());
		int num2 = Integer.parseInt(args[1].toString());
		String var = "";
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
	}
}