import java.util.Scanner;

public class Iterativo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		
		do{	
			
			int opcion = 0;
			String cad = "";
			int x = 0;
			String palabra = "";
			
			System.out.println("Ingresa una frase o palabra");
			cad = entrada.nextLine();
			x = cad.length();
		
			while (x>0) {
						
				palabra = palabra + cad.substring(x-1, x);
				x--;
					
			}
			System.out.println(palabra);
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