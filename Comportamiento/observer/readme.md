# OBSERVER, Dependents (Dependientes), Publish-Subscribe (Publicar-Suscribir) 


PROPÓSITO

Define una dependencia de uno-a-muchos entre objetos, de forma que cuando un objeto cambie de estado se notifique y se actualicen automáticamente todos los objetos que dependen de el.

MOTIVACIÓN

Un efecto lateral habitual de dividir un sistema en una colección de clases cooperantes es la necesidad de mantener una consistencia entre objetos relacionados. No queremos alcanzar esa consistencia haciendo a las clases fuertemente acopladas, ya que eso reduciría su reutilización.
Por ejemplo, muchos toolkits de interfaces gráficas de usuario separan los aspectos de presentación de la interfaz de usuario de los datos de aplicación subyacentes. Las clases que definen los datos de las aplicaciones y las representaciones pueden reutilizarse de forma independiente. También pueden trabajar juntas. Un objeto hoja de cálculo y un gráfico de barras pueden representar la información contenida en el mismo objeto de dalos de aplicación usando diferentes representaciones. La hoja de cálculo y el gráfico de barras no se conocen entre sí, permitiendo así reutilizar sólo aquél que se necesite. Pero se comportan como si lo hicieran. Cuando el usuario cambia la información de la hoja de cálculo, la barra de herramientas refleja los cambios inmediatamente, y viceversa.

Este comportamiento implica que la hoja de cálculo y el gráfico 
de barras son dependientes del objeto de datos y, por tanto, 
se les debería notificar cualquier cambio en el estado de éste. 
Y no hay razón para limitar a dos el número de objetos 
dependientes; puede haber cualquier número de interfaces de 
usuario diferentes para los mismos datos.
El patrón Observer describe cómo establecer estas relaciones. 
Los principales objetos de este patrón son el sujeto y el observador.
 Un sujeto puede tener cualquier número de observadores dependientes de él. Cada vez que el sujeto cambia su estado se notifica a todos sus observadores. En respuesta, cada observador consultará al sujeto para sincronizar su estado con el estado de éste.
Este tipo de interacción también se conoce como publicar-suscribir. El sujeto es quien publica las notificaciones. Envía estas notificaciones sin tener que conocer quiénes son sus observadores. Pueden suscribirse un número indeterminado de observadores para recibir notificaciones.

APLICABILIDAD

Úsese el patrón Observer en cualquiera de las situaciones siguientes:

• Cuando una abstracción tiene dos aspectos y uno depende del otro. Encapsular estos aspectos en objetos separados permite modificarlos y reutilizarlos de forma independiente.

• Cuando un cambio en un objeto requiere cambiar otros, y no sabemos cuántos objetos necesitan cambiarse.

• Cuando un objeto debería ser capaz de notificar a otros sin hacer suposiciones sobre quiénes son dichos objetos. En otras palabras, cuando no queremos que estos objetos estén fuertemente acoplados.

ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/203983485-5ca04454-686f-4ea2-a3f0-8de357cc4c61.png)

PARTICIPANTES

• Sujeto:  conoce a sus observadores. Un sujeto puede ser observado por cualquier número de objetos Observador proporciona una interfaz para asignar y quitar objetos Observador.

• Observador: define una interfaz para actualizar los objetos que deben ser notificados ante cambios en un sujeto.

• SujetoConcreto: 
- almacena el estado de interés para los objetos ObservadorConcreto.
- envía una notificación a sus observadores cuando cambia su estado.

• ObservadorConcreto:  mantiene una referencia a un objeto SujetoConcreto.
- guarda un estado que debería ser consistente con el del sujeto.
- ímplementa la interfaz de actualización del Observador para mantener su estado consistente con el del sujeto.

CONSECUENCIAS

El patrón Observador permite modificar los sujetos y observadores de forma independiente. Es posible reutilizar objetos sin reutilizar sus observadores, y viceversa. Esto permite añadir observadores sin modificar el sujeto u otros observadores.
Otras ventajas e inconvenientes del patrón Observer son los siguientes:

1. Acoplamiento abstracto entre Sujeto y Observador. Todo lo que un sujeto sabe es que tiene una lista de observadores, cada uno de los cuales se ajusta a la interfaz simple de la clase abstracta Observador. El sujeto no conoce la clase concreta de ningún observador. Por tanto, el acoplamiento entre sujetos y observadores es mínimo.
Gracias a que Sujeto y Observador no están fuertemente acoplados, pueden pertenecer a diferentes capas de abstracción de un sistema. Un sujeto de bajo nivel puede comunicarse e informar a un observador de más alto nivel, manteniendo de este modo intacta la estructura de capas del sistema. Si juntásemos al Sujeto y al Observador en un solo objeto, entonces el objeto resultante debería dividirse en dos capas (violando así la separación en capas) o estaría obligado a residir en una capa u otra (lo que puede comprometer la abstracción en capas).
2. Capacidad de comunicación mediante difusión. A diferencia de una petición ordinaria, la notificación enviada por un sujeto no necesita especificar su receptor. La notificación se envía automáticamente a todos los objetos interesados que se hayan suscrito a ella. Al sujeto no le importa cuántos objetos interesados haya; su única responsabilidad es notificar a sus observadores. Esto nos da la libertad de añadir y quitar observadores en cualquier momento. Se deja al observador manejar u obviar una notificación.
3. Actualizaciones inesperadas. Dado que los observadores no saben de la presencia de los otros, pueden no saber el coste último de cambiar el sujeto. Una operación aparentemente inofensiva sobre el sujeto puede dar lugar a una serie de actualizaciones en cascada de los observadores y sus objetos dependientes. Más aún, los criterios de dependencia que no están bien definidos o mantenidos suelen provocar falsas actualizaciones, que pueden ser muy difíciles de localizar
Este problema se ve agravado por el hecho de que el protocolo de actualización simple no proporciona detalles acerca de qué ha cambiado en el sujeto. Sin protocolos adicionales para ayudar a los observadores a descubrir que ha cambiado, pueden verse obligados a trabajar duro para deducir los cambios.

Fuentes:

- Asignatura Patrones de Diseño de UDIMA

- Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.



