import java.util.Scanner;

public class ejercicio_1_5f {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		String cad = "";
		String invertidaCad="";
		
		System.out.println("Ingrese una palabra o un cadena de numeros para invertir: ");
		cad = sc.next();
		
		
		for ( int i = cad.length()-1; i >= 0; i--) {
			invertidaCad +=cad.charAt(i);
			f
		}
		System.out.println("La cadena " + cad + " invertida es :" + invertidaCad);

	}

}
