import java.util.Scanner;

/*Crea un array de caracteres que contenga los valores del abecedario de la ‘A’ a la ‘Z’ (solo las
mayúsculas). Luego mediante un método, ir pidiendo al usuario posiciones del array por teclado y
si la posición es correcta, se añadirá a una cadena.
Se dejará de insertar cuando se introduzca un -1.
a. Mostrar la cadena final.
b. Mostrar la cantidad de caracteres ingresados.
c. Mostrar la cantidad de errores cometidos (si ingreso un índice que no corresponde).
Por ejemplo, si escribo los siguientes números
0 //Añadira la ‘A’
5 //Añadira la ‘F’
25 //Añadira la ‘Z’
50 //Error, inserte otro numero
-1 //fin
Cadena resultante: AFZ
*/

public class ejercicio_2_9 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
				
		rellenar();
			
	}	
	static  void  rellenar() {
		
		int contador = 0;
		String cad = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		char abc [];
		
		abc = cad.toCharArray();
		
		int pocision;
		
		String nuevaCad = "";
				
		System.out.println("Ingrese un numero : ");
		pocision = sc.nextInt();
		
		while ( pocision > 26 || pocision < - 1 ) {
			
			contador++;
			System.out.println(" Error ingrese  otro numero : ");
			pocision = sc.nextInt();			
		}
				
		while ( pocision >= 0 && pocision <= 26 ) {
			
			if ( pocision != -1) {
			nuevaCad += abc[pocision];
			System.out.println("Ingrese otro numero : ");
			pocision = sc.nextInt();
			}			
		}
				
		System.out.println("Cadena resultante :"+nuevaCad);
		System.out.println("Usted tuvo "+contador+" errores");

	}

}
