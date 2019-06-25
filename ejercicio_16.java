import java.util.*;

/*Realizar un programa que valide un login de usuario. Tener en cuenta:
Usuarios permitidos: pepe – 1234 y pepito – 5678
Caracteres mínimos para la clave = 3
Si el usuario es pepe mostrar “Hola Administrador”
Si el usuario es pepito mostrar “Hola Gestor”
*/

public class ejercicio_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String userAdmin = "pepe";
		String userGestor = "pepito";

		String passAdmin = "pepe-1234";
		String passGestor = "pepito-5678";

		String user = "";
		String pass = "";

		System.out.println("::::::::::-LOGIN-::::::::::::::");
		System.out.println("User : ");
		user = sc.next();
		System.out.println("Pass : ");
		pass = sc.next();

		if (user.equals(userAdmin) && (pass.contentEquals(passAdmin))) {
			System.out.println("Hola Administrador");
		} else if (user.contentEquals(userGestor) && pass.equals(passGestor)) {
			System.out.println("Hola Gestor");
		} else {
			System.out.println("User y pass incorrecto, ingrese nuevamente");
		}

	}

}
