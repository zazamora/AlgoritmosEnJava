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
public class productToNumber{   
	public static void main(String[] args) {
   		int numero = Integer.parseInt(args[0].toString());
		int resultado = 1;
		String var = "";
   		if(numero >= 1){
			for(int i = 1; i<=numero;i++){
				if(i != numero){
					var = var + i + "x";
				}else{
					var = var + i;
				}
				resultado = resultado * i;
			}
			System.out.println("Su resultado es: " + var + " = " + resultado);
		}
	}
}