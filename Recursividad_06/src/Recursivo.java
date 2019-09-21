import java.util.Scanner;

class Recursividad{
	
	public static void buscadorDeVocales(int i, String cad, String sub, int cont2){
			if(i==cad.length()){
				System.out.println("Tiene " + cont2 + " vocales");
			}
			if(i<cad.length()){
				sub = cad.substring(i, i+1);
			}
			else if(i==cad.length()){
				sub = cad.substring(-1+i, i);
			}
			if(sub.equalsIgnoreCase("A") || sub.equalsIgnoreCase("E") || sub.equalsIgnoreCase("I") || sub.equalsIgnoreCase("O") || sub.equalsIgnoreCase("U")){
				cont2++;
			}
			if(i<=cad.length()){
				buscadorDeVocales(i+1, cad, sub, cont2);
			}
	}
}
public class Recursivo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		int cont = 0;
		String cad = "";
		String sub = "";
		int i = 0;
		
		do{
			int cont2 = 0;
			
			System.out.println("Ingresa una frase o palabra");
			cad = entrada.nextLine().toUpperCase();
			Recursividad.buscadorDeVocales(i, cad, sub, cont2);
			System.out.println();
			System.out.println("Quieres obtener el numero de vocales de otra frase o palabra?");
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