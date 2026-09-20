import java.util.Scanner;

	public class NumeroPrimo{

public static void main(String[] args){

Scanner teclado = new Scanner(System.in);

System.out.println("Escriba un número y veremos si es primo");
int numero = teclado.nextInt();
int verificando = numPrimo(numero);
System.out.println("la cantidad de divisores son " + verificando);
String confirmando = esPrimo(verificando);
System.out.println("entonces podemos decir que " + confirmando);

}

public static int numPrimo(int calcularPrimo){
	int divisor = 0;	
	for(int i =1; i <= calcularPrimo; i++){
if(calcularPrimo % i ==0){
	divisor++;
}
}
return divisor;
}
public static String esPrimo(int seraPrimo){

int chequeando = numPrimo(seraPrimo);
if(chequeando == 2) {
	return "es primo";
} else {
return "no es primo";
}

} 
}