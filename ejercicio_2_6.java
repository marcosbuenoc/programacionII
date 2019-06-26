import java.util.Scanner;

public class ejercicio_2_6 {
	
	static Scanner sc = new Scanner (System.in);
	
	static String estudiantes [][] = new String [5] [3];

	public static void main(String[] args) {
		
		rellenar();
		mostrarTabla();
		
	}
	
	static void rellenar() {
		
		System.out.println("Columna 1 : Nombre, Columna 2: Direccion, Columna 3: e-mail");
			
		int k = 0;
		int i= 0;
		while ( k < 5) {
			
			i=0;
						
			while(i < 3) {
			System.out.println("Estudiante " + (k+1) + " : " );
			estudiantes[k][i]= sc.nextLine();
			i++;
			}
			
		
		k++;
			
		}	
		}
		
		static void mostrarTabla() {
			
			for(int i = 0; i < estudiantes.length; i++) {
				for (int j =0; j < estudiantes[i].length; j++) {
					System.out.print("-" + estudiantes[i][j] + "-\n");
				}
			}
						
		}
		
}
