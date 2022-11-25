# MEMENTO (RECUERDO), TOKEN


PROPÓSITO
Representa y externaliza el estado interno de un objeto sin violar la encapsulación, de forma que éste puede volver a dicho estado más tarde.

MOTIVACIÓN
A veces es necesario guardar el estado interno de un objeto. Esto es necesario cuando se implementan casillas de verificación o mecanismos de deshacer que permiten a los usuarios anular operaciones provisionales y recuperarse de los errores. Debe guardarse información del estado en algún sitio para que los objetos puedan volver a su estado anterior. Pero los objetos normalmente encapsulan parte de su estado, o todo, haciéndolo inaccesible a otros objetos e imposible de guardar externamente. Exponer este estado violaría la encapsulación, lo que puede comprometer la fiabilidad y extensibilidad de la aplicación.
Pensemos, por ejemplo, en un editor gráfico que permite conectar objetos. Un usuario puede conectar dos rectángulos con una línea, y los rectángulos permanecen conectados cuando el usuario mueve cualquiera de ellos. El editor garantiza que la línea se estira para mantener la conexión.

![image](https://user-images.githubusercontent.com/52029674/203980326-d385cbee-9a37-4311-a94b-67075188616d.png)
Una forma habitual de mantener relaciones de concctividad entre objetos es mediante un sistema de resolución de problemas. Podemos encapsular esta funcionalidad en un objeto ResolventeDe- Restricciones. ResolventeDeRestricciones almacena las conexiones a medida que se van creando éstas y genera ecuaciones matemáticas que las describen. Cada vez que el usuario hace una conexión o modifica el diagrama resuelve dichas ecuaciones. ResolicionDeRestricciones usa los resultados de sus cálculos para volver a colocar los gráficos de forma que mantengan las conexiones adecuadas.
Permitir que se puedan deshacer ciertas operaciones en esta aplicación no es tan sencillo como en un principio podría parecer. Una manera obvia de deshacer una operación de movimiento es guardar la distancia que se ha movido el objeto desde su posición original y mover éste hacia atrás una distancia equivalente. Sin embargo, esto no garantiza que todos los objetos aparezcan como estaban antes. Supongamos que hay algo de holgura en la conexión. En ese caso, mover el rectángulo hacia atrás a su posición original, no producirá necesariamente el efecto deseado.
![image](https://user-images.githubusercontent.com/52029674/203980368-e192e484-3228-4b99-ab00-482c7d8ba202.png)

En general, la interfaz pública de ResolventeDeRestriccioncs podría no ser suficiente para
 permitir revertir con precisión sus efectos sobre otros objetos. El mecanismo de deshacer debe trabajar más estrechamente con ResolventeDeRestricciones para reestablecer el estado previo, pero, por otro lado, también deberíamos evitar exponer al mecanismo de deshacer las interioridades de ResolventeDeRestricciones.
Este problema se puede solucionar con el patrón Memento. Un memento es un objeto que almacena una instantánea del estado interno de otro objeto —el creador del memento—. El mecanismo de deshacer solicitará un memento al creador cuando necesite comprobar el estado de éste. El creador inicializa el memento con información que representa su estado actual. Sólo el creador puede almacenar y recuperar información del memento —el memento es “opaco" a otros objetos—.

La siguiente secuencia de eventos representa el proceso de deshacer:
1. El editor solicita un memento al ResolventeDeRestricciones como un efecto lateral de la operación de mover.
2. El ResolventeDeRestricciones crea y devuelve un memento, en este caso una instancia de una clase EstadoDeIResolvente. Un memento del EstadoDeIResolución contiene estructuras de datos que describen el estado actual de las ecuaciones y variables internas del ResolventeDeRestricciones.
3. Más tarde, cuando el usuario deshace la operación de mover, el editor le devuelve al ResolventeDeRestricciones el EstadoDeIResolvente.
4. Dependiendo de la información del EstadoDeIResolvente, el ResolventeDeRestricciones cambia sus estructuras de datos internas para devolver sus ecuaciones y variables exactamente a su estado anterior.

Este acuerdo permite al ResolventeDeRestricciones confiar a otros objetos la información que necesita para volver a un estado previo sin exponer sus estructuras y representaciones internas.

APLICABILIDAD

Úsese el patrón Memento cuando

• hay que guardar una instantánea del estado de un objeto (o de parte de éste) para que pueda volver posteriormente a ese estado, y

• una interfaz directa para obtener el estado exponga detalles de implementación y rompa la encapsulación del objeto

ESTRUCTURA


![image](https://user-images.githubusercontent.com/52029674/203980830-7aafda50-518c-4793-b1a9-c91bd3b11c54.png)

PARTICIPANTES

• Memento (EstadoDeIResolvente)

guarda el estado interno del objeto Creador. El memento puede guardar tanta información del estado interno del creador como sea necesario a discreción del creador
protege frente a accesos de otros objetos que no sean el creador. Los mementos tienen realmente dos interfaces:
 El Conserje ve una interfaz reducida del Memento —sólo puede pasar el memento a otros objetos—. 
 El Creador, por el contrario, ve una interfaz amplia, que le permite acceder a todos los datos necesarios para volver a su estado anterior. 
Idealmente, sólo el creador que produjo el memento estaría autorizado a acceder al estado interno de éste.

• Creador (ResolventeDeRestricciones)

- crea un memento que contiene una instantánea de su estado interno actual.
- usa el memento para volver a su estado anterior.

• Conserje (mecanismo de deshacer)

- es responsable de guardar en lugar seguro el memento.
- nunca examina los contenidos del memento, ni opera sobre ellos.

CONSECUENCIAS

El patrón Memento tiene varias consecuencias:

1. Preservación de los límites de la encapsulación. El memento evita exponer información que sólo debería ser gestionada por un creador, pero que sin embargo debe ser guardada fuera del creador. El patrón oculta a otros objetos las interioridades, potencialmente complejas, del Creador, preservando así los límites de la encapsulación.
2. Simplifica al Creador. En otros diseños que persiguen conservar la encapsulación, el Creador mantiene las versiones de su estado interno que han sido solicitadas por los clientes. Eso asigna toda la responsabilidad de gestión del almacenamiento al Creador. Que sean los clientes quienes gestionen el estado que solicitan simplifica al Creador y evita que los clientes tengan que notificar a los creadores cuando han acabado.
3. El uso de mementos puede ser costoso. Los mementos podrían producir un coste considerable si el Creador debe copiar grandes cantidades de información para guardarlas en el memento o si los clientes crean y devuelven mementos a su creador con mucha frecuencia. A menos que encapsular y restablecer el estado del Creador sea poco costoso, el patrón podría no ser apropiado. Véase la discusión acerca de los cambios increméntales en la sección de Implementación.
4. Definición de interfaces reducidas y amplias. En algunos lenguajes puede ser difícil garantizar que sólo el creador acceda al estado del memento.
5. Costes ocultos en el cuidado de los mementos. Un conserje es responsable de borrar los mementos que custodia. Sin embargo, el conserje no sabe cuánto estado hay en un memento. De ahí que un conserje que debería ser ligero pueda provocar grandes costes de almacenamiento cuando debe guardar mementos.


Fuentes:

- Asignatura Patrones de Diseño de UDIMA

- Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.


