import java.util.Scanner;

/*Crear un programa que permita el ingreso de 10 números enteros. Devolver el valor y la
posición del número más grande y del número más chico*/


public class ejercicio_2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrays[] = new int[10];
		int num, menor = 0, mayor = 0, posMenor = 0, posMayor = 0;
		int i = 0;

		while (i < 10) {
			System.out.print((i + 1) + " .Ingrese 10 numeros :");
			num = sc.nextInt();
			arrays[i] = num;
			if (menor != 0 && mayor != 0) {

				if (arrays[i] < menor) {
					menor = arrays[i];
					posMenor = i;
				}

				if (arrays[i] > mayor) {
					mayor = arrays[i];
					posMayor = i;
				}

			} else {
				mayor = arrays[i];
				menor = arrays[i];

			}
			i++;
		}
		System.out.println("El numero menor es :" + menor + " la posicion es " + posMenor);
		System.out.println("El numero mayor es :" + mayor + " La posicion es : " + posMayor);

	}

}
