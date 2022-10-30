<h1>ABSTRACT FACTORY  (KIT)</h1>



PROPÓSITO

Proporciona una interfaz para crear familias de objetos relacionados o que dependen entre sí, sin especificar sus clases concretas.



APLICABILIDAD

Úsese el patrón Abstract Factory cuando

• un sistema debe ser independiente de cómo se crean, componen y representan sus productos.

• un sistema debe ser configurado con una familia de productos de entre varias.

• una familia de Objetos producto relacionados está diseñada para ser usada conjuntamente, y es necesario hacer cumplir esta restricción.

• quiere proporcionar una biblioteca de clases de productos, y sólo quiere revelar sus interfaces, no sus implementaciones.

ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/198869542-e036341e-94af-4a9b-b112-de64528d10a6.png)

PARTICIPANTES

• FabricaAbstracta (FabricaDeUtiles):  declara una interfaz para operaciones que crean objetos producto abstractos.

• FabricaConcreta (FabricaDeUtilesMotif, FabricaDeUtilesPM): implementa las operaciones para crear objetos producto concretos.

• ProductoAbstracto (Ventana,..): declara una interfaz para un tipo de objeto producto.

• ProduCtoConcreto (VentanaMotif,..)

- define un objeto producto para que sea creado por la fábrica correspondiente.

- implementa la interfaz ProductoAbstracto.

• Cliente

- sólo usa interfaces declaradas por las clases FabricaAbstracta y ProductoAbstracto.



Fuentes:
-   Asignatura Patrones de Diseño de UDIMA impartida por Javier Rodríguez Pérez
-   Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.
-   https://refactoring.guru/es/design-patterns

