
public class ejercicio_23 {

	public static void main(String[] args) {
		int arrays[][] = new int[2][3];

		arrays[0][0] = 5;
		arrays[0][1] = 6;
		arrays[0][2] = 7;
		arrays[1][0] = 8;
		arrays[1][1] = 9;
		arrays[1][2] = 10;

		System.out.println("Numero de filas " + arrays.length);
		System.out.println("Numero de Columnas " + arrays[0].length);
		System.out.println();

		System.out.println();

		System.out.println("Lista de Elementos :");

		for (int i = 0; i < arrays.length; i++) {

			for (int j = 0; j < arrays[i].length; j++) {

				System.out.print(" [" + i + "]" + "[" + j + "] =" + arrays[i][j] + "\n ");

			}

		}

	}

}
