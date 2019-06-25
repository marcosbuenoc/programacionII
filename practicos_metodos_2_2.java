import java.util.Scanner;

/*Crear una función que permita el ingreso de un parámetro (valor ingresado por el usuario) y
muestre la palabra hola ese número de veces.

*/


public class practicos_metodos_2_2 {
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		int num;
		String saludo = "Hola";
		
		System.out.println("Ingrese la cantidad de veces que quiere saludar : ");
		num = sc.nextInt();
		
		
		//saludar(num,saludo);
		System.out.println(saludar(num,saludo));
		
	}
	
	static String  saludar(int num, String saludo) {
		int i =1;
		
		while ( i < num ) {
			
			System.out.println(saludo);
			i++;
		}
		return saludo;
		
	}

	
	

}
