import java.util.Scanner;

/*Realizar un programa que permita mostrar la tabla de multiplicar de un número dado,
mostrando su resultado con el siguiente formato:
1 x 5 = 5
2 x 5 = 10
....
10 x 5 = 50
*/

public class ejercicio_1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, resultado, i = 1;
		System.out.println("Ingrese que tabla de multiplicar desea ver :");
		num = sc.nextInt();
		while (i <= 10) {

			resultado = num * i;

			System.out.println(num + "x" + i + "=" + resultado);

			i++;
		}

	}

}
