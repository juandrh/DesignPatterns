# COMMAND (ORDEN), Action (Acción), Transaction (Transacción)

PROPÓSITO

Encapsula una petición en un objeto, permitiendo así parametrizar a los clientes con diferentes peticiones, hacer cola o llevar un registro de las peticiones, y poder deshacer las operaciones.

MOTIVACIÓN

A veces es necesario enviar peticiones a objetos sin saber nada acerca de la operación solicitada o de quién es el receptor de la petición. Por ejemplo, los toolkits de interfaces de usuario incluyen objetos como botones y menús que realizan una petición en respuesta a una entrada de usuario. Pero el toolkit no puede implementar la petición explícitamente en el botón o el menú, ya que sólo las aplicaciones que usan el toolkit saben qué debería hacerse y sobre qué objeto. Como diseñadores de toolkits no tenemos modo de conocer al receptor de la petición ni de saber qué operaciones se efectuarán.
El patrón Command permite que los objetos del toolkit hagan peticiones a objetos de la aplicación no especificados, convirtiendo a la propia petición en un objeto, el cual se puede guardary enviar exactamente igual que cualquier otro objeto. La clave de este patrón es una clase abstracta Orden, que de clara una interfaz para ejecutar operaciones. En su forma más simple, esta interfaz incluye una operación abstracta Ejecutar. Las subclases concretas de Orden especifican un par receptor-acción, guardando el receptor como una variable de instancia e implementando Ejecutar para que invoque a la petición. El receptor posee el conocimiento necesario para llevar a cabo la petición.

![image](https://user-images.githubusercontent.com/52029674/203962172-384e2ab7-a6f9-419a-be8d-3f026c95b80b.png)
![image](https://user-images.githubusercontent.com/52029674/203962180-bd6f06d4-183e-4089-82eb-91739f3b321e.png)
![image](https://user-images.githubusercontent.com/52029674/203962191-60945eac-42ad-4321-822d-d51e59e2e02a.png)
El patrón Orden desacopla el objeto que invoca la operación de aquél que posee el conocimiento para realizarla. Esto nos da mucha flexibilidad para diseñar nuestra interfaz de usuario. También podemos permitir la creación de órdenes mediante la composición de unas órdenes en otras más grandes. Todo esto es posible debido a que el ob- jeto que emite la petición sólo necesita saber cómo enviarla; no necesita saber cómo se ejecutará la petición.

APLICABILIDAD

• parametrizar objetos con una acción a realizar, como ocurría con los objetos ElementoDeMenu anteriores. En un lenguaje de procedimiento se puede expresar dicha parametrización con una función callback, es decir, con una función que está registrada en algún sitio para que sea llama- da más tarde. Los objetos Orden son un sustituto orientado a objetos para las funciones callback.

• especificar, poner en cola y ejecutar peticiones en diferentes instantes de tiempo. Un objeto Orden puede tener un tiempo de vida independiente de la petición original. Si se puede representar el receptor de una petición en una forma independiente del espacio de direcciones, entonces se puede transferir un objeto orden con la petición a un proceso diferente y llevar a cabo la pe- tición allí.

• permitir deshacer. La operación Ejecutar de Orden puede guardar en la propia orden el estado que anule sus efectos. Debe añadirse a la interfaz Orden una operación Deshacer que anule los efectos de una llamada anterior a Ejecutar. Las órdenes ejecutadas se guardan en una lista que hace las veces de historial. Se pueden lograr niveles ilimitados de deshacer y repetir recorrien- do dicha lista hacia atrás y hacia delante llamando respectivamente a Deshacer y Ejecutar.

• permitir registrar los cambios de manera que se puedan volver a aplicar en caso de una caída del sistema. Aumentando la interfaz de Orden con operaciones para cargar y guardar se puede mantener un registro persistente de los cambios. Recuperarse de una caída implica volver a cargar desde el disco las órdenes guardadas y volver a ejecutarlas con la operación Ejecutar.

• estructurar un sistema alrededor de operaciones de alto nivel construidas sobre operaciones básicas. Dicha estructura es común en los sistemas de información que permiten transacciones.
Una transacción encapsula un conjunto de cambios sobre unos datos. El patrón Command ofrece un modo de modelar transacciones. Las órdenes tienen una interfaz común, permitiendo así invocar a todas las transacciones del mismo modo. El patrón también facilita extender el sistema con nuevas transacciones.

ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/203962818-7f415210-3548-430a-aff1-3a401873490a.png)

Participantes

Los participantes del patrón son los siguientes:

- Solicitud es la interfaz que presenta la firma del método ejecuta que ejecuta la
solicitud.

- SolicitudConcreta (SolicitudRebaja) implementa el método ejecuta, gestiona la
asociación con el o los receptores e implementa el método almacenaAnulación
que almacena el estado (o los valores necesarios) para poder anularla a
continuación.

- Cliente (Usuario) crea e inicializa la solicitud y la transmite al solicitante.

- Solicitante (Catálogo) almacena y ejecuta la solicitud (método
almacenaEjecuciónSolicitud) así como eventualmente las solicitudes de
anulación.

- Receptor (Vehículo) ejecuta las acciones necesarias para realizar la solicitud o
para anularla.

CONSECUENCIAS

1. Orden desacopla el objeto que invoca la operación de aquél que sabe cómo realizarla.
2. Las órdenes son objetos de primera clase. Pueden ser manipulados y extendidos como cualquier otro objeto.
3. Se pueden ensamblar órdenes en una orden compuesta. Un ejemplo lo constituye la clase OrdenMacro que se describió antes. En general, las órdenes compuestas son una instancia del patrón Composite (151).
4. Es fácil añadir nuevas órdenes, ya que no hay cambiar las clases existentes.


Fuentes:

- Asignatura Patrones de Diseño de UDIMA

- Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.


