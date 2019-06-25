import java.util.Scanner;

/*Dada una empresa de alquiler de vehículos se solicita la creación de un programa que mediante
métodos permita calcular el importe total del alquiler de un vehículo. Los datos que se conocen
son:
- El alquiler por día de los autos es de USD100.
- El alquiler por día de las camionetas es de USD130.
- Si el alquiler es por 7 o más días se hace un descuento del 25% para todos los vehículos sobre el
total del monto.
Se pide calcular el monto total del alquiler teniendo en cuenta los días de alquiler y el tipo de
vehículo.
*/


public class ejercicio_3_5 {

	static Scanner sc = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		
		float alqDiaAuto = 100;
		float alqDiaCamion=130;
		float total= 0;
		
		int diasAlq = 0;
		int opcion;
		
		
		
		System.out.println("Ingrese un opcion\n1.Auto\n2.Camion");
		opcion = sc.nextInt();
		//menu(opcion,diasAlq, total, alqDiaAuto, alqDiaCamion);
		
		menu(opcion, total, diasAlq);
		
		dia(diasAlq,total);
		
		
	}
	


	private static float  menu(int opcion, float total, int diasAlq ) {
		
		switch(opcion) {
			case 1:
				System.out.println("Cuantos dias desea alquilar: ");
				diasAlq= sc.nextInt();
				total = diasAlq * 100;
				break;

			case 2:
				System.out.println("Cuantos dias desea alquilar: ");
				diasAlq= sc.nextInt();
				
				total = diasAlq * 130;
				break;
			}
	 
		
		return total;
		

	 }	
	 
	 
	 static  void dia( int diasAlq, float total) {
		 
		 
		 System.out.println("El costo total para " + diasAlq + " dias es de " + total + "Dolares");
		 
		 
		 
		 
	 }

}
