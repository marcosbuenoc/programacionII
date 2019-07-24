package practico3;

import java.util.Scanner;

public class Rectangulo {
	
	


	static Scanner sc = new Scanner(System.in);
	
	
	static float largo, ancho	, area, perimetro;
	


	
	


  public   class PruebaRectangulo {
	  
	  float largo, ancho, area, perimietro;
	  
	  
	  public PruebaRectangulo( float largo, float ancho) {
		  
	  }
	 
	  
	  
	
  }	
  
public static  void main(String [] args) {
	

	
		
	ingresarDatos();
	areaC();
	perimetro();
	imprimr();
	
	
	
	
	
}


  


public static void imprimr() {
	  System.out.println(Rectangulo.area);
	 
	  
	  
	
}


 static void ingresarDatos() {
	System.out.println("Ingrese  el largo del Rectangulo  en metros: ");
	largo = sc.nextFloat();
	System.out.println("Ingrese el ancho del Rectangulo :");
	ancho = sc.nextFloat();
	
}


  static void areaC() {
	area = largo * ancho;
	
	
}


 static void perimetro() {
	perimetro = (2*largo) + (2 * ancho);
	
	
}
}
