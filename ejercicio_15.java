import java.util.*;

public class ejercicio_15 {

	public static void main(String[] args) {
		int num;
		int val;
		Scanner in = new Scanner(System.in);
		int n [];
		
		System.out.println("Ingrese el tamano del array");
		num = in.nextInt();
		n = new int[num];
		
		int i = 0;
		while(i < num) {
			System.out.println("Ingrese numeros");
			val = in.nextInt();
			
			n [i] = val; 
			i++;
		}
		int j = num-1;
		while(j >=0) {
			System.out.println(n[j]);
			j--;
		}
	}
}
