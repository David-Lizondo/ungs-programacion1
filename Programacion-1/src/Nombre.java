import java.util.Scanner;

public class Nombre{
public static void main(String[] args){

Scanner teclado = new Scanner(System.in);
System.out.println("¿Cual es tu nombre?");
String nombre = teclado.nextLine();
String buendia = saludar(nombre);
System.out.println(buendia);

System.out.println(nombre + " ¿Cual es tu edad?");
int edad = teclado.nextInt();
String calculoEdad = tuEdad(edad);
System.out.println(nombre + " tu edad es " + edad + " años");
System.out.println(calculoEdad);

}

public static String saludar(String quetal){
return "Hola " + quetal;
}

public static String tuEdad( int anhos){
if( anhos >=0 &&  anhos < 12){
	return "eres un/a niño/a";
} else if( anhos >= 12 && anhos < 20){
	return "eres un/a adolescente";
}else if( anhos >= 20 && anhos < 45){
	return "eres un/a adulto joven";
} else if( anhos >= 45 && anhos < 65){
	return "eres un adulto de mediana edad";
} else {
	return "ya estás jubilado/a";
}
}
}