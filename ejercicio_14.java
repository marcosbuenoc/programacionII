
import java.util.*;


public class ejercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double regresacelsius;
		
		
		double celsius;
		
		System.out.println("Ingrese temperatura grados celsius : ");
		celsius = sc.nextDouble();
		
		regresacelsius = celsiustofarenheit( celsius);
		
		System.out.println("La temperatura que ingreso : " + celsius +" ° C en farenheit son :" + regresacelsius + " F");

	}
	
	public static double celsiustofarenheit( double celsius) {
		
		double farenheit;
		
		
		farenheit =( (celsius *  9/5) + 32 );
		
		return farenheit;

	}

}
