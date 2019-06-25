import java.util.Scanner;

/* Realizar un programa que calcule el IMC (IMC = peso/altura2) para
determinar si un cierto peso corporal se encuentra dentro de los límites normales. El índice de
masa corporal (IMC) mide la relación entre el peso y la estatura de una persona y puede ser un
indicativo del estado de salud de una persona. Tomar como referencia los siguientes valores:
<18.49 Infrapeso
18.50 - 24.99 Peso Normal
25.00 - 29.99 Sobrepeso
>30.00 Obeso
*/
public class ejercicio_1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double peso, altura, IMC = 0;
		System.out.println("Calculo indice masa corporal IMC");
		System.out.println("Ingrese su peso en kgs : ");
		peso = sc.nextDouble();
		System.out.println("Ingrese su peso altura en cm : ");
		altura = sc.nextDouble();
		IMC = peso / (altura * altura);
		if (IMC <= 18.49) {
			System.out.println("Segun el IMC usted esta en infrapeso");
		}

		if (IMC >= 18.50 && IMC <= 24.99) {
			System.out.println("Segun el IMC usted esta en PESO NORMAL");

		}

		if (IMC >= 25 && IMC <= 29.99) {

			System.out.println("Segun el IMC usted esta en SOBRE PESO");
		} else {
			System.out.println("Segun el IMC usted esta en OBESO");
		}
	}

}
