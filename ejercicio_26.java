import java.util.Scanner;

/*Crear un programa que simule la facturación de ciertos productos. Pedir el ingreso de:
nombre del producto, precio unitario y cantidad. Mostrar el total de la factura, considerando
el IVA del 22%. Permitir que ingresen 5 o menos productos. Considerar las validaciones de
tipos de datos que correspondan.*/

public class ejercicio_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tabla[][] = new double[4][5];
		double precio, cantidad, subtotal, iva, total;
		double iva2 = 0, total2 = 0;

		String producto[] = new String[5];
		int i = 0;

		System.out.println("\t::::Factura Electronica::::\n");
		System.out.println("\tIngrese 5 productos o menos\n");

		while (i < 5) {
			System.out.print((i + 1) + " .Ingrese nombre del producto : ");
			producto[i] = sc.next();

			System.out.print("");

			System.out.print((i + 1) + " .Ingrese cantidad del producto : ");
			cantidad = sc.nextDouble();
			tabla[0][i] = cantidad;

			System.out.print("");
			System.out.print((i + 1) + " .Ingrese precio del producto : ");
			precio = sc.nextDouble();
			tabla[1][i] = precio;

			subtotal = ((tabla[0][i] * tabla[1][i]));
			iva = (double) Math.round(subtotal * 0.22);
			iva2 += iva;
			total = subtotal + iva;
			total2 += (double) Math.round(total);
			tabla[2][i] = iva;
			tabla[3][i] = total;

			i++;
			System.out.print("");
		}

		int k = 0;

		System.out.println("\t::::Factura::::\n");
		while (k < 5) {

			System.out.println("-" + producto[k] + "\t- Qty---" + tabla[0][k] +
								 "\t\t\t" + (tabla[1][k] * tabla[0][k]));

			k++;

		}
		System.out.println("");
		System.out.println("\t\t\tIVA 22%\t\t\t" + iva2);
		System.out.println("\t\t\tTOTAL\t\t\t" + total2);

	}

}
