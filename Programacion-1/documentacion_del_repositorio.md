Ejercicios Básicos de Java - Tecnicatura en Informática

Este repositorio contiene una colección de programas en Java desarrollados como parte de las prácticas iniciales de la carrera. Los ejercicios abordan conceptos fundamentales como estructuras de control, interacción por consola mediante Scanner, modularización con métodos estáticos y la evolución en la optimización de algoritmos.

🛠️ Requisitos Previos

Java Development Kit (JDK): Versión 8 o superior.

Un entorno de desarrollo (IDE) como VS Code, IntelliJ IDEA, Eclipse o una terminal para compilar mediante CLI (javac).

📋 Proyectos Incluidos

1. Iniciando_en_java.java

Descripción:
Programa introductorio que imprime un mensaje por consola y calcula la cantidad total de divisores de un número entero proporcionado por el usuario.

Conceptos clave: Impresión por consola, uso del operador módulo (%), incremento de contadores dentro de un bucle.

Compilación y ejecución:

javac Iniciando_en_java.java
java Iniciando_en_java



2. Nombre.java

Descripción:
Aplicación interactiva que saluda al usuario por su nombre y determina su etapa de vida según la edad ingresada.

Conceptos clave: Lectura de datos tipo String e int mediante Scanner, métodos con parámetros de retorno, estructuras condicionales anidadas (if-else if-else).

Compilación y ejecución:

javac Nombre.java
java Nombre



3. NumeroPrimo.java

Descripción:
Primera aproximación para determinar si un número es primo mediante el conteo exhaustivo de todos sus divisores recorriendo desde $1$ hasta $N$.

Conceptos clave: Modularización mediante múltiples métodos estáticos (numPrimo y esPrimo), conteo directo de divisores, lógica condicional sobre la cantidad de divisores hallados.

Compilación y ejecución:

javac NumeroPrimo.java
java NumeroPrimo



4. Optimizando_nroPrimo.java

Descripción:
Segunda iteración del algoritmo de números primos. Implementa una optimización mediante una salida anticipada (break) cuando el contador de divisores supera los 2, evitando iteraciones innecesarias, e incluye validación para valores menores o iguales a 1.

Conceptos clave: Control de flujo con break, interrupción temprana de bucles, validaciones condicionales iniciales.

Compilación y ejecución:

javac Optimizando_nroPrimo.java
java Optimizando_nroPrimo



5. nroPrimo_conRaiz.java

Descripción:
Versión final y altamente eficiente del algoritmo de verificación de números primos. Limita la búsqueda de divisores hasta la raíz cuadrada del número ($\sqrt{N}$), logrando un tiempo de respuesta significativamente menor.

Conceptos clave: Optimización algorítmica ($O(\sqrt{N})$), reducción de rango en bucles (i * i <= primo), retorno inmediato (return).

Compilación y ejecución:

javac nroPrimo_conRaiz.java
java nroPrimo_conRaiz



🚀 Cómo Ejecutar Cualquier Programa

Clona este repositorio en tu equipo local:

git clone https://github.com/tu-usuario/tu-repositorio.git



Navega al directorio donde se encuentran los archivos:

cd tu-repositorio



Compila y ejecuta el programa deseado utilizando las instrucciones provistas en cada sección.