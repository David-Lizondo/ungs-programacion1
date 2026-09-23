import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int nuevoCalculo = calcular();
        System.out.println("Resultado devuelto: " + nuevoCalculo);
    }

    public static int calcular() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elija un tipo de operación:\n1-Sumar \n2-Restar \n3-Multiplicar \n4-Dividir");
        int valores = teclado.nextInt();

        // Si la opción no es válida (menor a 1 o mayor a 4), pide el dato hasta que sea correcto
        while (valores < 1 || valores > 4) {
            System.out.println("La opción no es correcta. Intente de nuevo:");
            valores = teclado.nextInt();
        }

        System.out.println("Ingrese el primer número:");
        int num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = teclado.nextInt();

        int resultado = 0;

        if (valores == 1) {
            System.out.print("El resultado de la suma es: ");
            resultado = num1 + num2;
        } else if (valores == 2) {
            System.out.print("El resultado de la resta es: ");
            resultado = num1 - num2;
        } else if (valores == 3) {
            System.out.print("El resultado de la multiplicación es: ");
            resultado = num1 * num2;
        } else if (valores == 4) {
            if (num2 != 0) {
                System.out.print("El resultado de la división es: ");
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir por cero.");
            }
        }

        teclado.close();
        return resultado;
    }
}