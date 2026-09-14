import java.util.Scanner;

public class Iniciando_en_java {

public static void main(String[] args){

	System.out.println("Hola Mundo!!!");
	System.out.println("");

	Scanner teclado = new Scanner(System.in);
	System.out.println("Vamos a ver cuántos divisores hay");
	System.out.println("Escriba un número");
	int valor= teclado.nextInt();
	int resultado = cantDiv(valor);
	System.out.println("La cantidad total de divisores que tiene " + valor + " son: " + resultado);
}

	public static int cantDiv(int numero){
	
		int cantidad = 0;
		
		for(int i = 1; i <= numero; i++){
		if(numero % i == 0){
			System.out.println("el divisor es " + i);
			cantidad++;
}	
}
return cantidad;
}}