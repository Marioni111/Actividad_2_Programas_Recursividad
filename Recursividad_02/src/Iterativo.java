import java.util.Scanner;

public class Iterativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		int cont = 0;
		int num = 0;
		
		do{
			do{
				System.out.println("Ingresa un numero para obtener su factorial");
				num = entrada.nextInt();
				if(num>=20){
					System.out.println("Solo numeros menores a 20");
				}
			}while(num>=20);
			
			for(int i = (num-1); i>0; i--){
				num = (num*i);			
			}
			
			System.out.println("Factorial: " + num);
			System.out.println("Quieres obtener otro factorial?");
			System.out.println("1)si 2)no");
			opcion = entrada.nextInt();
			
			if(opcion == 2){
				cont = 1;
			}
			
		}while(cont<1);
		
		System.out.println("Nos vemos!");
	}
}