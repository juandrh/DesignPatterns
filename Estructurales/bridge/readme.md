<h1>BRIDGE  o Handle/Body (Manejador/Cuerpo)</h1>

PROPÓSITO

Desacopla una abstracción de su implementación, de modo que ambas puedan variar de forma inde- pendiente.

APLICABILIDAD

• quiera evitar un enlace permanente entre una abstracción y su implementación. Por ejemplo, cuando debe seleccionarse o cambiarse la implementación en tiempo de ejecución.

• tanto las abstracciones como sus implementaciones deberían ser extensibles mediante subclases. En este caso, el patrón Bridge permite combinar las diferentes abstracciones y sus implementaciones, y extenderlas independientemente.

• los cambios en la implementación de una abstracción no deberían tener impacto en los clientes; es decir, su código no tendría que ser recompilado.

• (C++) quiera ocultar completamente a los clientes la implementación de una abstracción. En C++ la representación de una clase es visible en la interfaz de la misma.

• tenga una proliferación de clases como la mostrada en el primer diagrama de la sección Motivación. Una jerarquía de clases tal pone de manifiesto la necesidad de dividir un objeto en dos partes. “generalizaciones anidadas” 

• quiera compartir una implementación entre varios objetos (tal vez usando un contador de referencias) y este hecho deba permanecer oculto al cliente. 


ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/198878643-9f1eb0bb-7be2-4a60-92fd-2ae34ad9ee50.png)


CONSECUENCIAS

1. Desacopla la interfaz y la implementación. No une permanentemente una implementación a una interfaz, sino que la implementación puede configurarse en tiempo de ejecución. Incluso es posible que un objeto cambie su implementación en tiempo de ejecución.
Desacoplar Abstracción e Implementador también elimina de la implementación dependencias de tiempo de compilación. Ahora, cambiar una clase ya no requiere recompilar la clase Abstracción y sus clientes. Esta propiedad es esencial cuando debemos asegurar la compatibilidad binaria entre distintas versiones de una biblioteca de clases.
Además, este desacoplamiento potencia una división en capas que puede dar lugar a sistemas mejor estructurados. La parle de alto nivel de un sistema sólo tiene que conocer a Abstracción y a Implementador.

2. Mejora la extensibilidad. Podemos extender las jerarquías de Abstracción y de Implementador de forma independiente.

3. Oculta detalles de implementación a los clientes. Podemos aislar a los clientes de los detalles de implementación, como el compartimiento de objetos implementadores y el correspondiente mecanismo de corneo de referencias (si es que hay alguno).


Fuentes:
-   Asignatura Patrones de Diseño de UDIMA impartida por Javier Rodríguez Pérez
-   Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.
-   https://refactoring.guru/es/design-patterns


