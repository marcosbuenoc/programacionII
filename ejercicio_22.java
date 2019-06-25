
import java.util.*;
//Crear un programa que permita leer la altura de N personas ingresadas por teclado. Calcular
//la altura media y mostrar cuantos están por encima y cuantos por debajo de la media.

public class ejercicio_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i =0, N;
        double media= 0, mayorQueLaMedia =0, menorQueLaMedia=0;
        System.out.println("Ingrese la cantiad de personas : ");

        N = sc.nextInt();

        double personasH [] = new double[N];
        
        while ( i < N) {
            System.out.println("Ingrese altura : ");
            personasH [i] = sc.nextDouble();
            media = media + personasH[i];
            i++;
        }
        media=media/N;
        i=0;
        while( i < personasH.length) {
        	if ( personasH[i] > media) {
        		mayorQueLaMedia++;
        		
        	}else if( personasH[i] < media) {
        			menorQueLaMedia++;
        	}
        	i++;
        }
        
        //Impresion de resultado en Pantalla
        System.out.println("La estatura media de "+N+" personas ingresadas es :"+ media);
        System.out.println("Hay "+mayorQueLaMedia+" personas mayor que la media." );
        System.out.println("Hay "+menorQueLaMedia+" personas menor que la media." );
        
        }
}
		

