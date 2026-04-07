// ARCHIVO: DatosVehiculo.java
// DESCRIPCION: Programa Java que solicita datos de un vehiculo al usuario
//              y los muestra formateados en pantalla.
// AUTOR CRISTIAN SANTOS ORTEGA

// Importacion de la clase Scanner, necesaria para leer datos desde el teclado.
// java.util es el paquete de utilidades estandar de Java.
import java.util.Scanner;

// Declaracion de la clase publica principal.
// En Java el nombre del archivo .java debe coincidir con el nombre de la clase publica.
public class DatosVehiculo {

    // Metodo principal (main): punto de entrada del programa.
    // La JVM busca este metodo exacto para iniciar la ejecucion.
    // "String[] args" permite recibir argumentos desde la linea de comandos.
    public static void main(String[] args) {

        // Creacion del objeto Scanner llamado "sc".
        // System.in representa la entrada estandar del sistema (el teclado).
        Scanner sc = new Scanner(System.in);

        // --- DECLARACION DE VARIABLES ---
        // String: cadena de texto para marca, modelo y tipo de combustible.
        // int:    numero entero para cilindrada y capacidad de pasajeros.

        String marca;           // Almacena la marca del vehiculo (ej: Toyota)
        String modelo;          // Almacena el modelo del vehiculo (ej: Corolla)
        int cilindrada;         // Almacena la cilindrada en cc (ej: 1600)
        String tipoCombustible; // Almacena el tipo de combustible (ej: Gasolina)
        int capacidadPasajeros; // Almacena la cantidad maxima de pasajeros

        // --- INGRESO DE DATOS ---
        // System.out.println imprime texto en consola y agrega salto de linea.

        System.out.println("Ingrese la marca del vehiculo:");
        // sc.nextLine() lee toda la linea ingresada hasta presionar ENTER.
        marca = sc.nextLine();

        System.out.println("Ingrese el modelo del vehiculo:");
        // Lee la linea completa y la guarda en la variable modelo.
        modelo = sc.nextLine();

        System.out.println("Ingrese la cilindrada del motor (en cc, ejemplo: 1600):");
        // sc.nextInt() lee un numero entero desde el teclado.
        cilindrada = sc.nextInt();
        // sc.nextLine() extra: consume el salto de linea pendiente tras nextInt().
        // Sin esta linea, el siguiente nextLine() leeria una cadena vacia.
        sc.nextLine();

        System.out.println("Ingrese el tipo de combustible (Gasolina, Diesel, Electrico, Hibrido):");
        // Lee la linea completa del tipo de combustible.
        tipoCombustible = sc.nextLine();

        System.out.println("Ingrese la capacidad en pasajeros:");
        // sc.nextInt() lee el numero entero de la capacidad de pasajeros.
        capacidadPasajeros = sc.nextInt();

        // --- SALIDA DE DATOS ---
        // El operador + concatena (une) texto fijo con el valor de las variables.

        System.out.println(); // Linea en blanco para separar entrada de salida.
        System.out.println("--- DATOS DEL VEHICULO INGRESADO ---");

        // Imprime la marca. Ejemplo: "La marca que ha ingresado es: Toyota"
        System.out.println("La marca que ha ingresado es: " + marca);

        // Imprime el modelo. Ejemplo: "El modelo que ha ingresado es: Corolla"
        System.out.println("El modelo que ha ingresado es: " + modelo);

        // Imprime la cilindrada. El int se convierte a String automaticamente con +.
        // Ejemplo: "La cilindrada que ha ingresado es: 1600"
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);

        // Imprime el tipo de combustible. Ejemplo: "El tipo de combustible es: Gasolina"
        System.out.println("El tipo de combustible es: " + tipoCombustible);

        // Imprime la capacidad. Ejemplo: "Tiene una capacidad de 5 pasajeros."
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // Cierra el Scanner para liberar recursos del sistema (buena practica).
        sc.close();

    } // Fin del metodo main

} // Fin de la clase DatosVehiculo
