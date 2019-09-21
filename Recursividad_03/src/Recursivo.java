import java.util.Scanner;

class Recursividad{
	
	public static void cocientes(int num, int num2){
		if(num>0 && num%num2==0){
			num=num/num2;
			System.out.println(num + " Es un cosiente");
		}
		if(num>0){
			cocientes(num/num2, num2);
		}
	}
}
public class Recursivo {

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
				
			Recursividad.cocientes(num, num2);
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