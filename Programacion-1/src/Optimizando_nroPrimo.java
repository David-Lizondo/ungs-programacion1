import java.util.Scanner;

public class Optimizando_nroPrimo {

public static void main(String[] args){

Scanner teclado = new Scanner(System.in);
System.out.println("Averigüemos si es un nro primo\nescribe un nro");
int valor = teclado.nextInt();

String resultado = cantDiv(valor);
System.out.println(resultado);
}

public static String cantDiv(int divisores) {

if(divisores <= 1){
return divisores + " no es primo, debe escribir un nro mayor a 1";
}

int cantidad = 0;

for(int i = 1; i <= divisores; i++){
	if(divisores % i ==0){
		cantidad++;
		System.out.println("el divisor es " + i);
} 

if(cantidad > 2){
	break;
}
} 

if(cantidad == 2){
	return divisores + " es un número primo";
} else {
	return divisores + " no es un nro primo porque tiene más de 2 divisores";
}
}
}