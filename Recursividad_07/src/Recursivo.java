import java.util.Scanner;

import javax.swing.SingleSelectionModel;

class Recursividad{
	
	public static void invertirPalabras(String cad, int x, String palabra){
			
		if(x>0) {
			palabra = palabra + cad.substring(x-1, x);
			invertirPalabras(cad, x-1, palabra);
		}else {
			System.out.println(palabra);
		}
	}
}
public class Recursivo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		int cont = 0;
		String cad = "";
		int x = 0;
		String palabra = "";
	
		do{
			System.out.println("Ingresa una frase o palabra");
			cad = entrada.nextLine();
			x = cad.length();
			Recursividad.invertirPalabras(cad, x, palabra);
			System.out.println();
			System.out.println("Quieres invertir otra cadena?");
			System.out.println("1)si 2)no");
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			if(opcion == 2){
				cont = 1;
			}
			
		}while(cont<1);
		
		System.out.println("Nos vemos!");

	}
}