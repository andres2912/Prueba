# PRUEBA PRÁCTICA DESARROLLADOR JAVA

## Clonar el Repositorio

Para clonar el repositorio:

1. Acceder a la ubicación donde desea almacenar el repositorio.
2. Ejecute el siguiente comando en su terminal o consola de comandos:

```bash
git clone https://git.quipux.com/beta/identificacionrutasinformales.git
cd prueba

```
## Ejecución del Proyecto
### Requisitos Previos
Asegúrese de contar con las siguientes herramientas instaladas:
 - JDK 8
 - Maven

## Pasos para la Ejecución
```bash
mvn clean install
```
```bash
mvn spring-boot:run
```
Por defecto, la aplicación se ejecutará en el puerto 8080. 

## Ejercicio 1: Validación de Números

### Descripción del Problema

Dado un número entero positivo, el sistema realiza las siguientes validaciones y retorna un mensaje según las condiciones:

Si el número es impar, retorna: Quipux.
Si el número es par y está en el rango inclusivo de 2 a 5, retorna: No Quipux.
Si el número es par y está en el rango inclusivo de 6 a 20, retorna: Quipux.
Si el número es par y mayor que 20, retorna: No Quipux.

### Endpoint
``` GET /numeros/{numero} ```

### Formato de Entrada
/numeros/{numero} donde numero es un valor entero positivo.
**Restricciones:** 1 <= número <= 100.

## Ejemplo de Uso

### Solicitud:
``` GET http://127.0.0.1:8080/numeros/7 ```

### Respuesta:
"Quipux"

### Mensajes de Error:
"El número debe estar entre 1 y 100."


## Ejercicio 2: Hora en Palabras

### Descripción del Problema
Dado una hora en formato de números, el sistema convierte la hora en palabras. Las conversiones se realizan de acuerdo con las siguientes reglas:

6:00 → seis en punto
6:02 → seis y dos minutos
6:10 → seis y diez minutos
6:30 → seis y media
6:45 → seis y cuarenta y cinco minutos
6:55 → seis y cincuenta y cinco minutos

### Endpoint
``` GET /reloj/{hora}/{minutos} ```
**Restricciones:** 1 <= hora <= 12 y 0 <= minutos < 60

## Ejemplo de Uso

### Solicitud:
``` GET http://127.0.0.1:8080/reloj/2/40 ```

### Respuesta:
"dos y cuarenta minutos"

### Mensajes de Error:
"Las horas deben estrár entre un rango de 1 a 12 y los minutos deben estár entre un rango del 1 al 59"


## jercicio 3: Información de Equipo de Fútbol
### Descripción del Problema
El sistema debe permitir ingresar la siguiente información de un equipo de fútbol:

 - Nombre del equipo
 - Estadio del equipo
 - Cantidad de títulos
 - Lista de jugadores titulares (Cada uno con nombre y posición)
 - Lista de jugadores suplentes (Cada uno con nombre y posición)
Después de ingresar la información, el programa debe ofrecer las siguientes opciones para generar reportes:

 - Reporte básico (Nombre del equipo, títulos ganados y cantidad total de jugadores).
 - Reporte detallado (Nombre del equipo, listado con el detalle de todos los titulares y todos los suplentes)
## Herramienta Recomendada para Pruebas
Para realizar las pruebas de los endpoints de manera sencilla, se recomienda utilizar [Postman](https://www.postman.com/)

### Endpoints
### Crear equipo
 - Método: POST
 - Ruta: ``` /equipo/crearEquipo ```
 - Cuerpo de la solicitud
```
{
  "nombreEquipo": "Real Madrid",
  "estadio": "Santiago Bernabéu",
  "cantidadTitulos": 34,
  "jugadoresTitulares": [
    {"nombreJugador": "Thibaut Courtois", "posicion": "Portero"},
    {"nombreJugador": "Dani Carvajal", "posicion": "Defensa"},
    {"nombreJugador": "Antonio Rudiger", "posicion": "Defensa"},
    {"nombreJugador": "David Alaba", "posicion": "Defensa"},
    {"nombreJugador": "Marcelo", "posicion": "Defensa"},
    {"nombreJugador": "Toni Kroos", "posicion": "Centrocampista"},
    {"nombreJugador": "Casemiro", "posicion": "Centrocampista"},
    {"nombreJugador": "Karim Benzema", "posicion": "Delantero"}
  ],
  "jugadoresSuplentes": [
    {"nombreJugador": "Andriy Lunin", "posicion": "Portero"},
    {"nombreJugador": "Nacho Fernández", "posicion": "Defensa"},
    {"nombreJugador": "Isco", "posicion": "Centrocampista"},
    {"nombreJugador": "Vinícius Júnior", "posicion": "Delantero"}
  ]
}


```
### Respuesta:
"Equipo creado con éxito"


### Obtener reporte básico
Método: GET
Ruta: ``` /equipo/reporteBasico ```
### Respuesta:
```
{
    "nombreEquipo": "Real Madrid",
    "cantidadTitulos": 34,
    "cantidadJugadores": 12
}
```
### Obtener reporte detallado

Método: GET
Ruta: ``` /equipo/reporteDetallado ```
Respuesta:
```
{
    "nombreEquipo": "Real Madrid",
    "jugadoresTitulares": [
        "Thibaut Courtois - Portero",
        "Dani Carvajal - Defensa",
        "Antonio Rudiger - Defensa",
        "David Alaba - Defensa",
        "Marcelo - Defensa",
        "Toni Kroos - Centrocampista",
        "Casemiro - Centrocampista",
        "Karim Benzema - Delantero"
    ],
    "jugadoresSuplentes": [
        "Andriy Lunin-Portero",
        "Nacho Fernández-Defensa",
        "Isco-Centrocampista",
        "Vinícius Júnior-Delantero"
    ]
}
```

### Mensajes de Error:
 - "El número de títulos debe ser un valor entero positivo."
 - "Las listas de jugadores no pueden estar vacías."
 - "El equipo no ha sido creado aún. No se puede generar el reporte."