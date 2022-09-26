package matrices;

import java.util.*;

public class Matrices {

	public static void main(String[] args) {
		//Declaracion de Matrices
		Scanner lector = new Scanner(System.in);
		System.out.println("----------Bienvenidos----------");
		System.out.println("Ingrese el tamaño de la matrizA: filas ");
		int cantFilasA = lector.nextInt();
		System.out.println("Ingrese el tamaño de la matrizA: columnas ");
		int cantColumnasA = lector.nextInt();
		
		System.out.println("Ingrese el tamaño de la matrizB: filas ");
		int cantFilasB = lector.nextInt();
		System.out.println("Ingrese el tamaño de la matrizB: columnas ");
		int cantColumnasB = lector.nextInt();
		
		if((cantFilasA == cantFilasB) && (cantColumnasA == cantColumnasB)) {
			
			int[][] matrizA = new int[cantFilasA][cantColumnasA];//2 filas 2 columnas
			int[][] matrizB = new int[cantFilasB][cantColumnasB];//2 filas 2 columnas
			int cantFilassuma = cantFilasA;
			int cantColumnassuma = cantColumnasA;
			int[][] suma = new int[cantFilasB][cantColumnasB];//2 filas 2 columnas
			//Ingresar datos de la matriz
			System.out.println("Ingrese los datos de la matriz A");
			for(int i = 0 ; i < cantFilasA ; i++) {//para recorrer las filas
				for(int j = 0 ; j < cantColumnasA ; j++) {//para recorrer las columnas
				System.out.print("Dato (" + i + "," + j + ") = "); 
					matrizA[i][j] = lector.nextInt();
				}
			}
			System.out.println("Ingrese los datos de la matriz B");
			for(int i = 0 ; i < cantFilasB ; i++) {//para recorrer las filas
				for(int j = 0 ; j < cantColumnasB ; j++) {//para recorrer las columnas
				System.out.print("Dato (" + i + "," + j + ") = "); 
					matrizB[i][j] = lector.nextInt();
				}
			}
			//Sumar los elementos de las matrices
			for(int i = 0 ; i < cantFilassuma ; i++) {
				for(int j = 0 ; j < cantColumnassuma ; j++) {
				suma[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}
			
				//Mostrar datos de la matriz A
				System.out.println("Los datos de la matriz A son: ");
				for(int i = 0 ; i < cantFilasA ; i++) { 
					for(int j = 0 ; j < cantColumnasA ; j++) {
					System.out.print(matrizA[i][j] + " "); 
					}
					System.out.println();
		
		}
					//Mostrar datos de la matriz B
					System.out.println("Los datos de la matriz B son: ");
					for(int i = 0 ; i < cantFilasB ; i++) { 
						for(int j = 0 ; j < cantColumnasB ; j++) {
						System.out.print(matrizB[i][j] + " "); 
						}
						System.out.println();
			
			}
	
	
		//Mostrar datos de la matriz suma
		System.out.println("Los datos de la matriz suma son: ");
		for(int i = 0 ; i < cantFilassuma ; i++) { 
			for(int j = 0 ; j < cantColumnassuma ; j++) {
			System.out.print(suma[i][j] + " "); 
			}
			System.out.println();

}
	}else {
		System.out.println("LAS MATRICES NO SON COMPATIBLES!.");
	}
			System.out.println("--------Fin del programa--------");
			lector.close();

        }

}


