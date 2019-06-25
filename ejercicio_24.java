import java.util.Scanner;

public class ejercicio_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int encuestados = 10;
		int num;
		int i = 0;
		int opcion = 0;
		int sueldo = 0;
		int contadorF = 0, contadorM = 0;
		int trabajanF = 0, trabajanM = 0;
		int sueldoF = 0, sueldoM = 0;17
		int tabla[][] = new int[6][encuestados];
		double pht = 0, pmt = 0, ph = 0, pm = 0;
		double promedioSH = 0, promedioSM = 0;
		
		// Comenzamos la encuesta
		
		System.out.println("Usted realizara una encuesta a"
							 " + encuestados +" personas");
		while (i < encuestados) {
			/*
			 * Ingrese una opcion:
			 *  Sexo: 
			 *  	1.Masculino 
			 *  	2.Femenino
			 */
			System.out.println((i + 1) + " .Ingrese una opcion
								\n Sexo:\n\t1.Masculino\n\t2.Femenino\n");
			opcion = sc.nextInt();
			switch (opcion) {
			//                                                                 
			case 1:
				tabla[0][i] = opcion;
				contadorM++;                                                  
				break;
			case 2:
				tabla[1][i] = opcion;
				contadorF++;                                                 
				break;
			}

			/*
			 * Ingrese una opcion: 
			 * Trabaja: 
			 *  	1.Si 
			 *  	2.No
			 */

			// Masculino
			if (opcion == 1) {
				System.out.println("Ingrese una opcion\n
							 Trabaja:\n\t1.Si\n\t2.No\n");
				opcion = sc.nextInt();
				trabajanM++;                                                
				switch (opcion) {
				case 1:
					tabla[2][i] = opcion;                                   
					System.out.println("Ingrese sueldo entre 600 y 2000");
					sueldo = sc.nextInt();
						while( sueldo < 600 || sueldo > 2000) {
							System.out.println("Digite un sueldo entre 
												600 y 2000");
							sueldo = sc.nextInt();
						}										
					if (sueldo >= 600 && sueldo <= 2000) {
						sueldoM += sueldo; 										
						tabla[4][i] = sueldo; 														
					}
					break;						
				case 2:
					tabla[2][i] = 2; // 										
					break;
				}

			// Femenino
			
			} else if (opcion == 2) {
				System.out.println("Ingrese una opcion\n 
							Trabaja:\n\t1.Si\n\t2.No\n");
				opcion = sc.nextInt();
				trabajanF++;                                                 							                                             
				switch (opcion) {
				case 1:
					tabla[3][i] = opcion;                                    
					System.out.println("Ingrese sueldo entre 600 y 2000");
					sueldo = sc.nextInt();					
					while( sueldo < 600 || sueldo > 2000) {
						System.out.println("Digite un sueldo entre 
											600 y 2000");
						sueldo = sc.nextInt();
					}
						if (sueldo >= 600 && sueldo <= 2000) {
							sueldoF += sueldo;                             
							tabla[5][i] = sueldo;                          					
						}	
					break;
						
				case 2:
					tabla[3][i] = 2;                                      
					break;
				}
			}
			i++;
		}

		System.out.println("");

		ph = (contadorM * 100) / encuestados;                              
		pm = (contadorF * 100) / encuestados;                              
		pht = (trabajanM * 100) / encuestados;                             
		pmt = (trabajanF * 100) / encuestados;                             
		promedioSH = sueldoM / encuestados;                                
		promedioSM = sueldoF / encuestados;
		System.out.println("Porcentaje de hombres                              " + ph + " %");
		System.out.println("Porcentaje de mujeres                              " + pm + " %");
		System.out.println("Porcentaje de hombres que trabajan                 " + pht + " %");
		System.out.println("Porcentaje de mujeres  que trabajan                " + pmt + " %");
		System.out.println("Sueldo promedio de hombres  que trabajan           " + promedioSH + " $");
		System.out.println("Sueldo promedio de mujeres  que trabajan          " + promedioSM + " $");
		System.out.println("");
		System.out.println("Consulte un encuestado, digite un numero menor o igual a " + encuestados);
		System.out.println("");
		num = sc.nextInt();
		for (int k = 0; k < tabla.length; k++) {
			System.out.print(" | ");
			System.out.print(tabla[k][num-1]);
			System.out.print(" | ");
		}
		System.out.println("");
	}
}


