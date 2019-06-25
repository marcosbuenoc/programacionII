import java.util.Scanner;

/*Crear un programa que permita solicitar al usuario el ingreso de un número entero mayor que 0.
Crear un Array de tipo cadena donde su tamaño sea el número ingresado por el usuario. Luego
pedir el ingreso de frutas para ir llenando el Array. Finalmente mostrar los elementos.

*/
public class ejercicio_3_3 {
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		int num = 0;
		//String frutas ="";
		
		System.out.println("Ingrese numero de elementos : ");
		num = sc.nextInt();
		
		String arrays [] = new String [num];
		
		llenarfrutas(arrays, num);
		
		imprimirArray(arrays);
		
		
		
		
	}
		public static  String[] llenarfrutas( String arrays[], int num) {
			
			
			for ( int i =0; i < num; i++) {
				System.out.println("Ingrese frutas : ");
				arrays [i] = sc.next();
							
			}
			
			return arrays;
		}
			
			public static void imprimirArray (String arrays[]){
				for(int i=0;i<arrays.length;i++){
		            System.out.println(arrays[i]);
			
			
		}
	
	}

}
