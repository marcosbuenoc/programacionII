import java.util.*;

public class ejercicio_21 {

	public static void main(String[] args) {
		//Crear un programa que permita el ingreso de 10 números enteros a un Array. El ingreso se
		//realizara por teclado. Mostrar cuantos son positivos, cuantos negativos y cuantos ceros.
		Scanner sc = new Scanner (System.in);
		
		int [] enteros = new int [10];
		int num, i =0;
		int contadorP = 0, contadorN=0, contador0=0;
		
		
		
		while ( i <10 ){
			System.out.println("Ingrese elementos " + (i+1) + ":");
			enteros[i] = sc.nextInt();
			
			if ( enteros[i] > 0) {
				contadorP++;
			
			}else if (enteros[i] < 0) {
					contadorN++;
			
			}else {
				contador0++;
			
			}
				
			
			i++;
		}
		
		System.out.println("Cantidad de positivos : "+contadorP+" Cantidad de negativos : "+contadorN+" Cantidad de ceros : " +contador0);
	}

}
