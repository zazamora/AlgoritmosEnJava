/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/
public class oddEven {   
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0].toString());
		double res = num%2;
		if(res == 0){
			System.out.println("Es par");
		}else{
			System.out.println("Es impar");
		}
	}
}