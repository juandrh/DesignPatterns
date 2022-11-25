# ITERATOR , Cursor

PROPÓSITO

Proporciona un modo de acceder secuencialmente a los elementos de un objeto agregado sin exponer su representación interna.

MOTIVACIÓN

Un objeto agregado, como por ejemplo una lista, debería darnos una forma de acceder a sus elemen- tos sin exponer su estructura interna. Más aún, tal vez queramos recorrer la lista de diferentes formas, dependiendo de lo que queramos realizar. Pero probablemente no querremos plagar la interfaz de Lista con operaciones para diferentes recorridos, incluso en el caso de que pudiéramos prever cuáles se van a necesitar. Por otro lado, también puede necesitarse hacer más de un recorrido simultáneamente sobre la misma lista.
El patrón Iterator nos permite hacer todo esto. La idea clave de este patrón es tomar la responsabilidad de acceder y recorrer el objeto lista y poner dicha responsabilidad en un objeto iterador. La clase Iterador define una interfaz para acceder a los elementos de la lista. Un objeto iterador es el responsable de saber cuál es el elemento actual; es decir, sabe qué elementos ya han sido recorridos.
Separar el mecanismo de recorrido del objeto Lista nos permite definir iteradores con diferentes políticas de recorrido sin necesidad de enumerarlos en la interfaz de Lista.

Nos queda el problema de cómo crear el iterador. Puesto que queremos escribir código que sea independiente de las subclases concretas de Lista, no podemos crear simplemente una instancia de una clase determinada. En vez de eso, haremos que los objetos lista sean responsables de crear sus correspondientes iteradores. Esto requiere una operación como Crearlterador, mediante la cual los clientes soliciten un objeto iterador.

Crearlterador es un ejemplo de método de fabricación

APLICABILIDAD

Úsese el patrón Iterador

• par a acceder al contenido de un objeto agregado sin exponer su representación intema.

• para permitir varios recorridos sobre objetos agregados.

• para proporcionar una interfaz uniforme para recorrer diferentes estructuras agregadas (es decir, para permitir la iteración polimórfica).


ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/203964272-8f8819f7-1338-4c50-9114-0bb9c6f14a93.png)


PARTICIPANTES

• Iterador:  define una interfaz para recorrer los elementos y acceder a ellos.

• IteradorConcreto

- implemento la interfaz Iterador.
- mantiene la posición actual en el recorrido del agregado.
- 
• Agregado:  define una interfaz para crear un objeto Iterador.

• AgregadoConcreto

- implemento la interfaz de creación de Iterator para devolver una instancia del IteradorConcreto apropiado.

CONSECUENCIAS
1. Permite variaciones en el recorrido de un agregado. Los agregados complejos pueden recorrerse de muchas formas. Por ejemplo, la generación de código y la comprobación de tipos implican recorrer árboles de análisis sintáctico. La generación de código puede recorrer dicho árbol de análisis sintáctico en en-orden o en preorden. Los iteradores facilitan cambiar el algoritmo de recorrido: basta con sustituir la instancia de iterador por otra diferente. También se pueden definir subclases de Iterador para permitir nuevos recorridos.
2. Los iteradores simplifican la interfaz Agregado. La interfaz de recorrido de Iterador elimina la necesidad de una interfaz parecida en Agregado, simplificando así la interfaz del agregado.
3. Se puede hacer más de un recorrido a la vez sobre un agregado. Un iterador mantiene su propio estado del recorrido. Por tanto, es posible estar realizando más de un recorrido al mismo tiempo.

Fuentes:

- Asignatura Patrones de Diseño de UDIMA

- Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.





