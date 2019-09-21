import java.util.Scanner;

public class Iterativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		int cont = 0;
		int num = 0;
		int cont2 = 0;
		
		do{
			do{
				System.out.println("Ingresa un numero para obtener sus divisores");
				num = entrada.nextInt();
				if(num<=0){
					System.out.println("Solo numeros mayores a 0");
				}
			}while(num<0);
			
			for(int i = 1; i<=num; i++){
				if(num%i==0){
					cont2++;
				}
			}
			System.out.println("Tiene: " + cont2 + " divisores");
			System.out.println();
			System.out.println("Quieres obtener los divisores de otro numero?");
			System.out.println("1)si 2)no");
			opcion = entrada.nextInt();
			
			if(opcion == 2){
				cont = 1;
			}
			
		}while(cont<1);
		
		System.out.println("Nos vemos!");
	}
}