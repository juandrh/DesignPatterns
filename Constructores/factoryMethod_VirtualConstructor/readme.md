<h1>FACTORY METHOD (Virtual Constructor)</h1>

PROPÓSITO

Define una interfaz para crear un objeto, pero deja que sean las subclases quienes decidan qué clase instanciar. Permite que una clase delegue en sus subclases la creación de objetos.


APLICABILIDAD

Cuando

• una clase no puede prever la clase de objetos que debe crear.
• una clase quiere que sean sus subclases quienes especifiquen los objetos que ésta crea.
• las clases delegan la responsabilidad en una de entre varías clases auxiliares, y queremos localizar qué subclase de auxiliar concreta es en la que se delega.

ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/198872945-67d20c45-3fa2-4c27-a2e9-33af9ef8e8c8.png)

PARTICIPANTES

• Producto (Documento): define la interfaz de los objetos que crea el método de fabricación.
• ProductoConcreto (Word, Latex): implementa la interfaz producto
• Creador (CreadorDeDocumentos)
- declara el método de fabricación, el cual devuelve un objeto de tipo Producto. También puede definir una implementación predeterminada del método de fabricación que devuelva un objeto ProductoConcreto.
- puede llamar al método de fabricación para crear un objeto Producto.
• CrcadorConcreto (CreadorDocumentosWord)
- redefine el método de fabricación para devolver una instancia de un ProductoConcreto.

Fuentes:
-   Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.
-   https://refactoring.guru/es/design-patterns
