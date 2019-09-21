import java.util.Scanner;

public class Iterativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		int cont = 0;
		int num = 0;
		int num2 = 0;
		
		System.out.println("Vamos a obtener los cocientes de la divicion de dos numeros!");
		
		do{
			do{
				System.out.println("Ingresa un numero > 0");
				num = entrada.nextInt();
			}while(num<=0);
			
			do{
				System.out.println("Ingresa otro numero > 1");
				num2 = entrada.nextInt();
			}while(num2<=1);
			
				do{
						System.out.println(num/num2 + " ES un cosiente");
						num = num/num2;
				}while(num==0);
				
				System.out.println();
				System.out.println("No tienen mas cosientes");

			System.out.println();
			System.out.println("Quieres obtener los cosientes de otros numero?");
			System.out.println("1)si 2)no");
			opcion = entrada.nextInt();
			
			if(opcion == 2){
				cont = 1;
			}
			
		}while(cont<1);
		
		System.out.println("Nos vemos!");
	}
}
