import java.util.Scanner;

/*
Crear un programa en Java que permita crear un Array llamado Inscripciones de 10 filas por 2
columnas. El ingreso de elementos será determinado por el usuario donde cada fila corresponderá
a una inscripción y cada columna a 2 datos diferentes: Código de curso, Cantidad de inscriptos. Se
deberá mostrar al final el total de inscriptos. Resolverlo utilizando métodos.
*/

public class ejercicio_2_7 {
	
	static Scanner sc = new Scanner (System.in);
	static int inscripciones [][] = new int [10][2];
	static int total = 0;
	
	public static void main(String[] args) {
		
		rellenar();
		totalInscriptos();
		
	}
	
	static void rellenar() {
	
		int k = 0;
		int i = 0;
		
		while ( k < 10) {
			
			i = 0;
			
			while (i < 2) {
				
				if ( i == 0) {
				
				System.out.println("[Fila " + (k+1) +" ] .Ingrese codigo del grupo : ");
				inscripciones [k][i]= sc.nextInt();
							
				}
				
				if ( i == 1) {
					
					System.out.println("[Fila " + (k+1) +" ] .Ingrese cantidad de integrantes : ");
					inscripciones [k][i]= sc.nextInt();
					total += inscripciones [k][i];
									
					}
				
				i++;
			}
			k++;
		}
	}
	
	static void totalInscriptos() {
		
		System.out.println("El total de inscriptos es : "+ total);
		
	}
	
	
	
	
	
	
	

}
