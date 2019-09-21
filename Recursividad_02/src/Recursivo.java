import java.util.Scanner;

class Recursividad{
	
	public static void factorial(int num, int num2){
		num2 = num2*num;
		if(num>1){
			factorial(num-1, num2);
		}
		else{
			System.out.println("Factorial: " + num2);
		}
	}
}
public class Recursivo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;
		int opcion = 0;
		int cont = 0;
		
		do{
			do{
				System.out.println("Ingresa un numero para obtener su factorial");
				num = entrada.nextInt();
				num2 = num;
				if(num>=20){
					System.out.println("Solo numeros menores a 20");
				}
			}while(num>=20);
			
			Recursividad.factorial(num-1, num2);
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