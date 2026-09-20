import java.util.Scanner;

public class NroPrimo_conRaiz{

public static void main(String[] args){

Scanner teclado = new Scanner(System.in);

System.out.println("Busquemos un nro primo\nEscriba un nro");
int valor = teclado.nextInt();

String numero = esPrimo(valor);
System.out.println(numero);
}

public static String esPrimo(int primo){

	if(primo < 1){
	return primo + " no es un nro primo, debe ser mayor a 1";
}

for(int i = 2; i * i <= primo; i++){
	if(primo % i == 0){
System.out.println("se encontró un divisor: " + i);	
return primo + " no es primo";
}} 
	return primo + " es primo";

} 
}