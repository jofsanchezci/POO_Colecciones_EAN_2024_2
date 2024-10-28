# Colecciones y Arrays en Java

Este documento ofrece una introducción a las colecciones y los arrays en Java, cubriendo conceptos básicos, sintaxis y ejemplos.

## 1. Introducción a las Colecciones en Java
En Java, las **colecciones** son estructuras de datos que permiten almacenar y gestionar grupos de objetos de manera eficiente. La biblioteca de colecciones, en el paquete `java.util`, incluye interfaces, clases y métodos para manipular estos conjuntos de datos de forma dinámica y flexible.

### Características principales de las colecciones:
- **Crecimiento dinámico**: No se requiere conocer el tamaño de la colección de antemano.
- **Herramientas para manipulación de datos**: Métodos para añadir, eliminar, buscar y ordenar datos.

### Principales interfaces de colecciones:
- **`List`**: colección ordenada que permite duplicados (ej. `ArrayList`, `LinkedList`).
- **`Set`**: colección que no permite duplicados (ej. `HashSet`, `TreeSet`).
- **`Map`**: almacena pares clave-valor y no permite claves duplicadas (ej. `HashMap`, `TreeMap`).

## 2. Concepto de Array
Un **array** es una estructura de datos básica en Java que permite almacenar un conjunto de elementos del mismo tipo en un bloque de memoria contiguo. Los arrays tienen tamaño fijo, por lo que no se puede cambiar una vez definido.

### Características clave de los arrays:
- **Tipo fijo**: Todos los elementos deben ser del mismo tipo (ej. `int`, `String`).
- **Acceso rápido**: Acceso en tiempo constante `O(1)` mediante su índice.
- **Limitaciones**: No pueden redimensionarse ni ofrecen métodos avanzados de manipulación de datos como las colecciones.

## 3. Declaración de Arrays en Java
Para declarar un array en Java, se define el tipo de datos y el tamaño que tendrá. Algunos ejemplos de cómo declarar arrays en Java:

### Ejemplos de declaración
#### a) Declaración y asignación de memoria para un array vacío
```java
int[] numbers = new int[5]; // Declara un array de enteros de tamaño 5
String[] names = {"Alice", "Bob", "Charlie"}; // Array de Strings con tres elementos
```
#### b) Declaración y asignación de valores directamente
```java
String[] names = {"Alice", "Bob", "Charlie"}; // Array de Strings con tres elementos
```

#### c) Declaración de un array multidimensional
```java
int[][] matrix = new int[3][3]; // Matriz de 3x3

```
#### d)Inicialización después de la declaración
```java
int[] scores;
scores = new int[] {85, 90, 95}; // Se asigna un array de enteros después de la declaración

```
## 3. Ejemplo práctico de manipulación de un array

```java
int[] ages = {23, 34, 45};
System.out.println(ages[0]); // Imprime el primer elemento: 23
ages[1] = 40; // Modifica el segundo elemento a 40
```

## 4. Comparación entre Arrays y Colecciones

| Característica   | Arrays                       | Colecciones                         |
|------------------|------------------------------|-------------------------------------|
| Tamaño           | Fijo                         | Dinámico                            |
| Tipo de datos    | Primitivos y Objetos         | Solo Objetos                        |
| Acceso           | Por índice (`O(1)`)          | Depende del tipo de colección       |
| Funcionalidad    | Básica                       | Métodos avanzados (`add`, `remove`, `sort`, etc.) |


Los arrays son ideales cuando se necesita un uso de memoria eficiente y un tamaño fijo de datos, mientras que las colecciones son más versátiles y permiten una gestión dinámica de datos en situaciones en las que el tamaño de la información puede variar.	


