# Ejercicios Básicos de Java - Tecnicatura en Informática

Este repositorio contiene una colección de programas en Java desarrollados como parte de las prácticas iniciales de la carrera. Los ejercicios abordan conceptos fundamentales como estructuras de control, interacción por consola mediante `Scanner`, modularización con métodos estáticos y optimización de algoritmos.

---

## 🛠️ Requisitos Previos

* **Java Development Kit (JDK):** Versión 8 o superior.
* Un entorno de desarrollo (IDE) como VS Code, IntelliJ IDEA, Eclipse o una terminal para compilar mediante CLI (`javac`).

---

## 📋 Proyectos Incluidos

### 1. `nroPrimo_conRaiz.java`
**Descripción:**  
Verifica si un número entero ingresado por el usuario es primo utilizando un algoritmo optimizado de búsqueda de divisores hasta la raíz cuadrada del número ($\sqrt{N}$).

* **Conceptos clave:** Optimización algorítmica ($O(\sqrt{N})$), bucle `for`, condiciones de salida anticipada (`return`).
* **Compilación y ejecución:**
  ```bash
  javac nroPrimo_conRaiz.java
  java nroPrimo_conRaiz
  ```

---

### 2. `Iniciando_en_java.java`
**Descripción:**  
Programa introductorio que imprime un mensaje por consola y calcula la cantidad total de divisores de un número entero proporcionado por el usuario.

* **Conceptos clave:** Impresión por consola, uso del operador módulo (`%`), incremento de contadores dentro de un bucle.
* **Compilación y ejecución:**
  ```bash
  javac Iniciando-en-java.java
  java Iniciando_en_java
  ```

---

### 3. `Nombre.java`
**Descripción:**  
Aplicación interactiva que saluda al usuario por su nombre y determina su etapa de vida según la edad ingresada.

* **Conceptos clave:** Lectura de datos tipo `String` e `int` mediante `Scanner`, métodos con parámetros de retorno, estructuras condicionales anidadas (`if-else if-else`).
* **Compilación y ejecución:**
  ```bash
  javac Nombre.java
  java Nombre
