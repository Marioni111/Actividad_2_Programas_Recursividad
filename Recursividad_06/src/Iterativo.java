import java.util.Scanner;

public class Iterativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		int cont = 0;
		String cad = "";
		String sub = "";
		
		System.out.println("Preciona enter para comenzar");
		
		do{
			int cont2 = 0;
			
			entrada.nextLine();
			System.out.println("Ingresa una frase o palabra");
			cad = entrada.nextLine().toUpperCase();
			
			for(int i = 0; i<=cad.length(); i++){
				if(i==cad.length()){
					break;
				}
				sub = cad.substring(i, 1+i);
				if(sub.equalsIgnoreCase("A") || sub.equalsIgnoreCase("E") || sub.equalsIgnoreCase("I") || sub.equalsIgnoreCase("O") || sub.equalsIgnoreCase("U")){
					cont2++;
				}
			}
			System.out.println("Tiene " + cont2 + " vocales");
			System.out.println();
			System.out.println("Quieres obtener el numero de vocales de otra frase o palabra?");
			System.out.println("1)si 2)no");
			opcion = entrada.nextInt();
			
			if(opcion == 2){
				cont = 1;
			}
			
		}while(cont<1);
		
		System.out.println("Nos vemos!");
		
		entrada.close();
	}
}