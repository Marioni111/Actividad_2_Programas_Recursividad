import java.util.Scanner;

public class Iterativo{

    public static void main(String[] args) {

    	int numero, exp, digito, cont=0 , opcion;
        double binario;
        
        Scanner entrada = new Scanner(System.in);
    	
        System.out.println("Convertidos de decimales a vinarios");
        
    	do{
	        
	        do{ 
	            System.out.print("Introduce un numero entero >= 0: ");
	            numero = entrada.nextInt();
	        }while(numero<0);
	
	        exp=0;
	        binario=0;
	        while(numero!=0){
	                digito = numero % 2;           
	                binario = binario + digito * Math.pow(10, exp);  
	                exp++;
	                numero = numero/2;
	        }
	        System.out.printf("Binario: %.0f %n", binario);
	        System.out.println();
			System.out.println("Quieres obtener la convercion de otro decimal a binario?");
			System.out.println("1)si 2)no");
			opcion = entrada.nextInt();
			
			if(opcion == 2){
				cont = 1;
			}
		
	}while(cont<1);
	
	System.out.println("Nos vemos!");
    }
}