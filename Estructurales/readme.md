<h1>PATRONES ESTRUCTURALES</h1>

Se ocupan de cómo se combinan las clases y los objetos para formar estructuras más grandes.

Tipos:

De clases: hacen uso de la herencia para componer interfaces o implementaciones. Útil para lograr que funcionen juntas bibliotecas de clases desarrolladas de forma independiente  (Adapter)

De objetos: describen formas de componer objetos para obtener nueva funcionalidad. Flexibilidad -> capacidad de cambiar la composición en tiempo de ejecución, lo que es imposible con la composición de clases estática. Adapter y resto.

Patrones:
- El patrón Adapter (de clases y objetos).
- El patrón Bridge.
- El patrón Composite: Describe cómo construir una jerarquía de clases formada por dos tipos de objetos: primitivos y compuestos. Los objetos compues- tos permiten combinar objetos primitivos, así como otros objetos compuestos, para formar estructuras todo lo complejas que se quiera.
- El patrón Decorator: describe cómo añadir responsabilidades a objetos dinámicamente. Compone objetos recursivamente para permitir un número ilimitado de responsabilidades adicionales.
- El patrón Facade: representante de un conjunto de objetos, muestra cómo hacer que un único objeto represente un subsistema completo. Lleva a cabo sus responsabilidades reenviando mensajes a los objetos que representa
- El patrón Flyweight: define una estructura para compartir objetos para lograr un uso más eficiente del espacio. Pueden compartirse sólo si no tienen un estado que dependa del contexto. Cualquier información adicional que necesiten para llevar a cabo su tarea se les pasa en el momento que sea ne cesaria.
- El patrón Proxy: un objeto proxy actúa como un sustituto o un representante de otro objeto. Pue den restringir, aumentar o alterar las propiedades de un objeto.

Fuentes:
-   Asignatura Patrones de Diseño de UDIMA 
-   Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.
-   https://refactoring.guru/es/design-patterns
