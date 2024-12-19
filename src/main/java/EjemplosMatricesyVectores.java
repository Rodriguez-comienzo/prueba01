import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class EjemplosMatricesyVectores {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del teclado
        Scanner scanner = new Scanner(System.in);
        // Crear un objeto Random para generar números aleatorios
        Random rand = new Random();
        
        // Definir la opción para el menú
        int opcion;
        
        // Mostrar el menú de opciones
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Llenar una matriz de 3x4 con números aleatorios");
            System.out.println("2. Llenar un vector con números aleatorios");
            System.out.println("3. Llenar un vector con 5 números por teclado");
            System.out.println("4. Llenar una matriz por teclado (definir filas y columnas)");
            System.out.println("5. Llenar una matriz de 3x4 con cadenas de texto");
            System.out.println("6. Llenar un vector de 5 elementos con cadenas de texto");
            System.out.println("7. Separar una cadena en tokens");
            System.out.println("8. Separar una cadena en tokens y ordenarlos");
            System.out.println("9. Solicitar 10 números, mostrarlos y ordenarlos");
            System.out.println("10. Salir");
            
            // Leer la opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            
            switch (opcion) {
                case 1:
                    // Caso 1: Llenar una matriz de 3x4 con números aleatorios
                    System.out.println("Matriz de 3x4 con números aleatorios:");
                    int[][] matrizAleatoria = new int[3][4];
                    // Llenamos la matriz con números aleatorios entre 1 y 100
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            matrizAleatoria[i][j] = rand.nextInt(100) + 1; // Números entre 1 y 100
                        }
                    }
                    // Imprimir la matriz
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(matrizAleatoria[i][j] + "\t"); // Imprimir cada valor de la matriz
                        }
                        System.out.println(); // Nueva línea después de cada fila
                    }
                    break;

                case 2:
                    // Caso 2: Llenar un vector con números aleatorios
                    System.out.println("Vector con números aleatorios:");
                    int[] vectorAleatorio = new int[5]; // Vector de tamaño 5
                    // Llenar el vector con números aleatorios entre 1 y 100
                    for (int i = 0; i < vectorAleatorio.length; i++) {
                        vectorAleatorio[i] = rand.nextInt(100) + 1; // Números entre 1 y 100
                    }
                    // Imprimir el vector
                    for (int i = 0; i < vectorAleatorio.length; i++) {
                        System.out.print(vectorAleatorio[i] + " "); // Imprimir cada valor del vector
                    }
                    System.out.println(); // Nueva línea después de mostrar el vector
                    break;

                case 3:
                    // Caso 3: Llenar un vector con 5 números por teclado
                    System.out.println("Llenar un vector con 5 números por teclado:");
                    int[] vectorTeclado = new int[5]; // Vector de tamaño 5
                    // Pedir al usuario que ingrese los números
                    for (int i = 0; i < vectorTeclado.length; i++) {
                        System.out.print("Ingrese el número " + (i + 1) + ": ");
                        vectorTeclado[i] = scanner.nextInt(); // Leer el número desde el teclado
                    }
                    // Imprimir el vector ingresado
                    System.out.print("Vector ingresado: ");
                    for (int i = 0; i < vectorTeclado.length; i++) {
                        System.out.print(vectorTeclado[i] + " "); // Imprimir cada valor del vector
                    }
                    System.out.println(); // Nueva línea después de mostrar el vector
                    break;

                case 4:
                    // Caso 4: Llenar una matriz por teclado (definir filas y columnas)
                    System.out.println("Llenar una matriz por teclado (definir filas y columnas):");
                    System.out.print("Ingrese el número de filas: ");
                    int filas = scanner.nextInt(); // Leer el número de filas
                    System.out.print("Ingrese el número de columnas: ");
                    int columnas = scanner.nextInt(); // Leer el número de columnas
                    int[][] matrizTeclado = new int[filas][columnas];
                    // Pedir al usuario que ingrese los números para la matriz
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                            matrizTeclado[i][j] = scanner.nextInt(); // Leer el valor desde el teclado
                        }
                    }
                    // Imprimir la matriz
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            System.out.print(matrizTeclado[i][j] + "\t"); // Imprimir cada valor de la matriz
                        }
                        System.out.println(); // Nueva línea después de cada fila
                    }
                    break;

                case 5:
                    // Caso 5: Llenar una matriz de 3x4 con cadenas de texto
                    System.out.println("Matriz de 3x4 con cadenas de texto:");
                    String[][] matrizStrings = new String[3][4];
                    // Pedir al usuario que ingrese las cadenas de texto para la matriz
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                            matrizStrings[i][j] = scanner.nextLine(); // Leer la cadena desde el teclado
                        }
                    }
                    // Imprimir la matriz
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(matrizStrings[i][j] + "\t"); // Imprimir cada cadena de la matriz
                        }
                        System.out.println(); // Nueva línea después de cada fila
                    }
                    break;

                case 6:
                    // Caso 6: Llenar un vector de 5 elementos con cadenas de texto
                    System.out.println("Vector de 5 elementos con cadenas de texto:");
                    String[] vectorStrings = new String[5]; // Vector de tamaño 5
                    // Pedir al usuario que ingrese las cadenas de texto para el vector
                    for (int i = 0; i < vectorStrings.length; i++) {
                        System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
                        vectorStrings[i] = scanner.nextLine(); // Leer la cadena desde el teclado
                    }
                    // Imprimir el vector de cadenas
                    System.out.print("Vector de cadenas ingresado: ");
                    for (int i = 0; i < vectorStrings.length; i++) {
                        System.out.print(vectorStrings[i] + " "); // Imprimir cada cadena del vector
                    }
                    System.out.println(); // Nueva línea después de mostrar el vector
                    break;

                case 7:
                    // Caso 7: Separar una cadena en tokens
                    System.out.println("Separar una cadena en tokens:");
                    System.out.print("Ingrese una cadena de texto: ");
                    String cadena = scanner.nextLine(); // Leer la cadena completa
                    // Separar la cadena en tokens usando el espacio como delimitador
                    String[] tokens = cadena.split("\\s+"); // El delimitador es uno o más espacios en blanco
                    System.out.println("Tokens obtenidos:");
                    // Imprimir los tokens
                    for (String token : tokens) {
                        System.out.println(token); // Mostrar cada token por línea
                    }
                    break;

                case 8:
                    // Caso 8: Separar una cadena en tokens y ordenarlos
                    System.out.println("Separar una cadena en tokens y ordenarlos:");
                    System.out.print("Ingrese una cadena de texto: ");
                    String cadenaOrdenar = scanner.nextLine(); // Leer la cadena completa
                    // Separar la cadena en tokens usando el espacio como delimitador
                    String[] tokensOrdenados = cadenaOrdenar.split("\\s+"); // El delimitador es uno o más espacios en blanco
                    // Ordenar los tokens alfabéticamente
                    Arrays.sort(tokensOrdenados);
                    System.out.println("Tokens ordenados alfabéticamente:");
                    // Imprimir los tokens ordenados
                    for (String token : tokensOrdenados) {
                        System.out.println(token); // Mostrar cada token por línea
                    }
                    break;

                case 9:
                    // Caso 9: Solicitar 10 números, mostrarlos y ordenarlos
                    System.out.println("Solicitar 10 números, mostrarlos y ordenarlos:");
                    int[] numeros = new int[10]; // Vector para almacenar 10 números
                    // Solicitar los números al usuario
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Ingrese el número " + (i + 1) + ": ");
                        numeros[i] = scanner.nextInt(); // Leer el número desde el teclado
                    }
                    // Mostrar los números ingresados
                    System.out.print("Números ingresados: ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(numeros[i] + " "); // Imprimir cada número
                    }
                    System.out.println(); // Nueva línea después de mostrar los números
                    // Ordenar los números de menor a mayor
                    Arrays.sort(numeros);
                    // Mostrar los números ordenados
                    System.out.print("Números ordenados: ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(numeros[i] + " "); // Imprimir cada número ordenado
                    }
                    System.out.println(); // Nueva línea después de mostrar los números ordenados
                    break;

                case 10:
                    // Caso 10: Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    // Opción no válida
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 10); // El ciclo se repite hasta que el usuario elija salir (opción 10)
        
        // Cerrar el Scanner al final
        scanner.close();
    }
}
