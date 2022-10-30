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

CONSECUENCIAS

-  Aísla clases concretas. Controla las clases de objetos que crea una aplicación. La
fábrica concreta encapsula la responsabilidad de creación de productos.
Los clientes manipulan objetos a través de las interfaces abstractas de los productos
(solamente Boton, CajaTexto)
-  Los nombres de las clases concretas (BotonWindows, CajaTextoLinx) no aparecen
en el código del cliente.
-  Favorece el intercambio de familias de productos: cambio de fábrica concreta.
-  Favorece la consistencia de productos. Objetos producto diseñados para trabajar
de forma conjunta y es necesario hacer cumplir esta restricción: no se permite tener
un BotonWindows y una CajaTextoLinux responsabilidad → de la factoría
concreta.

-  Dificultad para dar cabida a nuevos tipos de productos. Nuevos productos → Modificación
de la fábrica abstracta → modificación de todas las factorías concretas.


Fuentes:
-   Asignatura Patrones de Diseño de UDIMA
-   Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.
-   https://refactoring.guru/es/design-patterns

