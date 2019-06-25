
/*Realizar un programa que muestre los números pares que se encuentran en el rango 15 y 30.
(Utilizar operador modulo para evaluar si el número es par o impar).
*/
public class ejercicio_1_3 {

	public static void main(String[] args) {
        int i = 16; 
        while ( i <= 30 && i >= 15) { 

            if ( i%2==0)  { 

            System.out.println(i); 

            } 
            i++; 

        } 

	}

}
