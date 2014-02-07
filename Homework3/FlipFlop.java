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
   		int numeroActual;
		int i = 0;
		double residuo, residuo2;
   		numeroActual = Integer.parseInt(args[0].toString());
		while(i<=numeroActual){
			residuo = i%3;
			residuo2 = i%5;
			if(residuo == 0){
				if(residuo2 == 0){
					System.out.println("FlipFlop");
				}else{
					System.out.println("Flip");
				}
			}else if(residuo2 == 0){
				System.out.println("Flop");
			}else{
				System.out.println("El numero es: " + i);
			}
			i++;
		}
	}
}