# Sistema de Registro de Datos de Vehiculo — DatosVehiculo.java

**Repositorio:** https://github.com/santini84cl/aiep2026  
**Asignatura:** TALLER DE APLICACIONES MOVILES AIEP 2026  
**Lenguaje:** Java (sin IDE)  
**Compilacion:** Linea de comandos con `javac`

---

## Descripcion General

Aplicacion de consola en Java que solicita al usuario cinco datos de un vehiculo (marca, modelo, cilindrada, tipo de combustible y capacidad en pasajeros) y los muestra formateados en pantalla. El programa usa `Scanner(System.in)` para la entrada y `System.out.println` para la salida.

---

## Estructura del Repositorio

```
aiep2026/
├── src/
│   └── DatosVehiculo.java               
└── README.md
```

---

## Instrucciones de Compilacion y Ejecucion (sin IDE)

### Requisitos previos
- Tener instalado el **JDK (Java Development Kit)** version 8 o superior.
- En Windows: descargar desde https://www.oracle.com/java/technologies/downloads/
- Verificar instalacion: abrir CMD y escribir `java -version` y `javac -version`

### Pasos para compilar

```bash
# 1. Abrir la terminal (CMD en Windows / Terminal en Mac o Linux)

# 2. Navegar a la carpeta donde esta el archivo .java
cd C:\aiep2026\src          # Windows
# o
cd ~/aiep2026/src           # Mac/Linux

# 3. Compilar el archivo fuente con javac
javac DatosVehiculo.java

# Si no hay errores, se genera el archivo DatosVehiculo.class en la misma carpeta.
# El archivo .class contiene el bytecode que ejecuta la JVM.
```

### Pasos para ejecutar

```bash
# 4. Ejecutar el programa compilado con el comando java
java DatosVehiculo

# IMPORTANTE: se escribe el nombre de la clase SIN la extension .class
```

### Ejemplo de sesion completa

```
Ingrese la marca del vehiculo:
Toyota
Ingrese el modelo del vehiculo:
Corolla
Ingrese la cilindrada del motor (en cc, ejemplo: 1600):
1600
Ingrese el tipo de combustible (Gasolina, Diesel, Electrico, Hibrido):
Gasolina
Ingrese la capacidad en pasajeros:
5

--- DATOS DEL VEHICULO INGRESADO ---
La marca que ha ingresado es: Toyota
El modelo que ha ingresado es: Corolla
La cilindrada que ha ingresado es: 1600
El tipo de combustible es: Gasolina
Tiene una capacidad de 5 pasajeros.
```

---

## Requerimientos Funcionales

| ID  | Requerimiento |
|-----|---------------|
| RF01 | El sistema debe solicitar al usuario el ingreso de la marca del vehiculo como texto (String). |
| RF02 | El sistema debe solicitar al usuario el ingreso del modelo del vehiculo como texto (String). |
| RF03 | El sistema debe solicitar al usuario el ingreso de la cilindrada del motor como numero entero (int). |
| RF04 | El sistema debe solicitar al usuario el ingreso del tipo de combustible como texto (String). |
| RF05 | El sistema debe solicitar al usuario el ingreso de la capacidad en pasajeros como numero entero (int). |
| RF06 | El sistema debe mostrar en pantalla la marca ingresada con el formato: "La marca que ha ingresado es: XXXX". |
| RF07 | El sistema debe mostrar en pantalla el modelo ingresado con el formato: "El modelo que ha ingresado es: XXXX". |
| RF08 | El sistema debe mostrar en pantalla la cilindrada ingresada con el formato: "La cilindrada que ha ingresado es: XXXX". |
| RF09 | El sistema debe mostrar en pantalla el tipo de combustible con el formato: "El tipo de combustible es: XXXX". |
| RF10 | El sistema debe mostrar en pantalla la capacidad de pasajeros con el formato: "Tiene una capacidad de XXXX pasajeros." |
| RF11 | El sistema debe leer los datos en el orden indicado: marca, modelo, cilindrada, tipo de combustible, capacidad. |
| RF12 | El sistema debe usar variables de tipo String para datos de texto e int para datos numericos. |
| RF13 | El sistema debe compilarse con `javac` desde la linea de comandos sin requerir IDE. |
| RF14 | El sistema debe ejecutarse con `java DatosVehiculo` desde la linea de comandos. |

---

## Requerimientos No Funcionales

| ID   | Requerimiento |
|------|---------------|
| RNF01 | El programa debe estar escrito en lenguaje Java estandar (compatible con JDK 8+). |
| RNF02 | El codigo fuente debe estar contenido en un unico archivo llamado `DatosVehiculo.java`. |
| RNF03 | El nombre del archivo debe coincidir exactamente con el nombre de la clase publica. |
| RNF04 | El codigo debe incluir comentarios en cada linea explicando su proposito. |
| RNF05 | No se permite el uso de herramientas IDE (NetBeans, Eclipse, IntelliJ, VS Code, etc.). |
| RNF06 | El programa debe ser compilable y ejecutable en cualquier sistema operativo con JDK instalado (Windows, Mac, Linux). |
| RNF07 | El tiempo de respuesta del programa debe ser inmediato (menos de 1 segundo por operacion). |
| RNF08 | El codigo debe ser legible, con indentacion correcta y nombres de variables descriptivos en espanol. |
| RNF09 | El repositorio en GitHub debe estar organizado con las carpetas src/, docs/ y cronograma/. |
| RNF10 | El README.md debe estar escrito en formato Markdown y contener requerimientos e historias de usuario. |

---

## Historias de Usuario

### HU-01: Ingreso de datos del vehiculo

**Como** usuario del sistema,  
**quiero** ingresar los datos de un vehiculo (marca, modelo, cilindrada, tipo de combustible y capacidad en pasajeros),  
**para** registrar la informacion del vehiculo de forma rapida desde la consola.

**Criterios de aceptacion:**
- El programa solicita cada dato con un mensaje claro antes de leer la entrada.
- El programa acepta texto libre para marca, modelo y tipo de combustible.
- El programa acepta numeros enteros para cilindrada y capacidad en pasajeros.
- El programa no falla si el usuario ingresa espacios en los campos de texto.

---

### HU-02: Visualizacion de datos ingresados

**Como** usuario del sistema,  
**quiero** ver en pantalla un resumen de los datos que ingrese,  
**para** verificar que la informacion fue registrada correctamente.

**Criterios de aceptacion:**
- El programa muestra los cinco datos con el formato exacto especificado.
- Cada dato aparece en una linea separada.
- Los datos se muestran en el mismo orden en que fueron ingresados.
- El valor mostrado es identico al valor ingresado por el usuario.

---

### HU-03: Uso sin instalacion de IDE

**Como** estudiante o evaluador del proyecto,  
**quiero** poder compilar y ejecutar el programa usando solo la linea de comandos,  
**para** verificar que el programa funciona sin depender de herramientas IDE.

**Criterios de aceptacion:**
- El archivo `DatosVehiculo.java` se compila exitosamente con `javac DatosVehiculo.java`.
- El programa se ejecuta exitosamente con `java DatosVehiculo`.
- Se genera el archivo `DatosVehiculo.class` tras la compilacion.
- El programa funciona en Windows, Mac y Linux con JDK instalado.

*Repositorio: https://github.com/santini84cl/aiep2026 | CRISTIAN SANTOS | 2026*
