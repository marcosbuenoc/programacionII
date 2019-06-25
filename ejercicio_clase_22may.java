
import java.util.Scanner;

public class ejercicio_clase_22may {
	
	public static void main(String[] args) {
		String producto ="";
		double precio = 0, cantidad, subtotal =0, total = 0, IVA =0;
		Scanner sc = new Scanner(System.in);

	//Pedir nombre producto, precio unitario y cantidad
	//Mostrar datos con  el siguiente formato
	/* Vendido producto...............
	 * P.Unitario.....................
	 * Cant...........................
	 * Sub-Total.....................
	 * IVA...........................
	 * TOTAL.........................
	 */
		System.out.println("Ingrese nombre del producto: ");
		producto = sc.next();
		
		System.out.println("Ingrese precio unitario: ");
		precio = sc.nextDouble();
		
		System.out.println("Ingrese cantidad: ");
		cantidad = sc.nextDouble();
		mostrarFactura(producto, precio, cantidad,subtotal, IVA, total);
		
	
	}	

	public void operacionDatos(double precio, double cantidad, double subtotal, double IVA, double total ) {
		
		
		subtotal = cantidad * precio;
		
		IVA = subtotal *0.22;
	
		total = subtotal +IVA;
	
	}
	static void mostrarFactura( String producto,double precio, double cantidad, double subtotal, double IVA, double total ) {
		
		System.out.println("Vendido Producto ....................." + producto);
		System.out.println("Precio Unitario  ....................." + precio);
		System.out.println("Cantidad         ....................." + cantidad);
		System.out.println("Sub-total        ....................." + subtotal);
		System.out.println("IVA              ....................." + IVA);
		System.out.println("TOTAL            ....................." + total);
	}	
	
}
