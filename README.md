# Proyecto (Maven) - Motores (Adaptador)

Se está construyendo el software controlador para diversas opciones de Motores en Automóviles. Actualmente se posee controladores para dos tipos de motores: ```MotorComun``` y ```MotorEconomico```. En ambos casos la interface de sus controladores ofrecen las mismas operaciones:

- ```Encender()```
- ```Acelerar()```
- ```Apagar()```

La empresa automotriz está considerando un nuevo tipo de ```MotorElectrico```. El proyecto es experimental y se desea continuar con la misma línea de automóviles, pero ahora con la posibilidad de incorporar este tipo de Motor no contaminante. El fabricante (japonés) del ```MotorElectrico``` provee a sus usuarios un controlador software que posee las siguientes operaciones en su interface:

* ```Conectar()```
* ```Activar()```
* ```aumentarVelocidad()```
* ```detener()```
* ```desconectar()```

Algunos automóviles actuales ofrecen un diseño de motor que permite incluir dos tipos de motores (de gasolina y eléctrico) para mayor eficiencia. En este tipo de automóvil, cuando se ha terminado la batería para el motor eléctrico entra en operación el motor a gasolina, digamos es un tipo de ```MotorHíbrido```, con la interface:

* ```Encendiendo()```
* ```Acelerando()```
* ```Apagando()```

Ofrezca un diseño, basado principalmente en el patrón Adaptador para implementar un diseño orientado a objetos que maneje estos requisitos para los nuevos tipos de motor (```Eléctrico``` e ```Híbrido```), junto con los dos originales (```Común``` y ```Económico```).

**CASOS DE PRUEBA:**

Implemente cuatro escenarios de prueba que demuestren el correcto funcionamiento de su aplicación. Los escenarios deberán demostrar para cada motor su funcionamiento con las operaciones siguientes:
* Configurar el automóvil con un cierto tipo de motor.
* Encender el automóvil
* Acelerar el automóvil
* Apagar el automóvil 

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Clase
---
classDiagram
      class Clase
      Clase: -x
      Clase: -y
      Clase: +op1()
      Clase: +op2()
      Clase: +op3()
      Clase: +op4()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con Maven

### Compilar
```
mvn -f app compile
```
### Probar N tests
```
mvn -f app test
```
### Probar 1 test
```
mvn -f app test -Dtest="AppTest#testMotorComun" 
mvn -f app test -Dtest="AppTest#testMotorEconomico"
mvn -f app test -Dtest="AppTest#testMotorElectrico"
mvn -f app test -Dtest="AppTest#testMotorHibrido"
```
### Ejecutar App
```
java -cp app/target/classes miPrincipal.App
```
### Empacar App
```
mvn -f app package
```
### Limpiar binarios
```
mvn -f app clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
