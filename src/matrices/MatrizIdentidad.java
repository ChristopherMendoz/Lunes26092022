package matrices;

import java.util.Scanner;

public class MatrizIdentidad {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("------Bienvenido------");
		System.out.println("Ingrese el tamano de la Matriz: ");
		int tamano = lector.nextInt();
		
		if(tamano < 1) {
			System.out.println("Dato Incorrecto. No se forma una Matriz.");
		}else {
			int[][] identidad = new int[tamano][tamano];
			for (int i = 0; i < identidad.length; i++) {
				for (int j = 0; j < identidad.length; j++) {
					if (i == j) {
						identidad[i][j] = 1;
					}else {
						identidad[i][j] = 0;
					}
					
				}
			}	
			System.out.println("La matriz identidad de tamaño " + tamano + " es: ");
			for (int i = 0; i < identidad.length; i++) {
				for (int j = 0; j < identidad.length; j++) {
					System.out.print(identidad[i][j] + " ");
				}
				System.out.println();

	}
			System.out.println("FIN DEL PROGRAMA.");
	}
	}
}
