import java.util.Scanner;

/*
Crear un programa en Java que mediante el uso de métodos permita:
a. Pedir al usuario el ingreso de un número entero.
b. Crear un array unidimensional de tipo numérico entero y que su tamaño sea el ingresado por el
usuario en el punto 1.
c. Pedir al usuario el ingreso de 10 números enteros y guardarlos en el array creado en el punto
2.
d. Evaluar cuantos son múltiplos de 3.
e. Mostrar los números que son múltiplos de 3.
f. Mostrar el total de números que son múltiplos de 3.
*/


public class ejercicio_2_8 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int elementos;

	static int contador =0;
	static int k = 0;

	public static void main(String[] args) {
	
		llenarArrays();

	}


	static void llenarArrays() {

		System.out.println("Ingrese un numero entero para la cantidad de elementos : ");
		elementos = sc.nextInt();
		
		
		int arreglo [] = new int [elementos];
		int arregloM[] = new int [elementos];
		
		
		for ( int i = 0 ; i < elementos; i++) {
			System.out.println((i+1) + " .Ingrese 10 numeros : ");
			arreglo[i] = sc.nextInt();
			
			if ( arreglo[i]%3 == 0) {
				
				arregloM[k] = arreglo[i];
				contador++;
				k++;
			}
			
		}

		System.out.println();
		System.out.println("Tenemos " + contador + " numeros multiplos de 3");
		System.out.println();
		
		System.out.println("Multiplos de 3 son ---");
		for ( int i = 0; i < elementos; i++) {
			
			System.out.print("--" + arregloM[i] +"--");
		}
		
		
	}		
}
