import java.util.Scanner;

class Recursividad{
	
	public static void divisores(int num, int num2, int cont){
		if(num>0 && num2%num==0){
			cont++;
		}
		if(num>0){
			divisores(num-1, num2, cont);
		}
		if(num==0){
			System.out.println("Tiene: " + cont + " divisores");
		}
	}
}
public class Recursivo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int opcion = 0;
		int cont = 0;
		int num2 = 0; 
		int cont2 = 0;
		
		do{
			do{
				System.out.println("Ingresa un numero > 0 para obtener sus divisores");
				num = entrada.nextInt();
			}while(num<=0);
			
			num2=num;
			Recursividad.divisores(num, num2, cont);
			System.out.println("Quieres probar con otro numero?");
			System.out.println("1)si 2)no");
			opcion = entrada.nextInt();
			
			if(opcion == 2){
				cont2 = 1;
			}
		
	}while(cont2<1);
		
		System.out.println("Nos vemos!");
		
	}
}