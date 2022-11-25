# MEDIATOR

PROPÓSITO

Define un objeto que encapsula cómo interactúan una serie de objetos. Promueve un bajo acoplamiento al evitar que los objetos se refieran unos a otros explícitamente, y permite variar la interacción entre ellos de forma independiente.

MOTIVACIÓN

Los diseñadores orientados a objetos promueven la distribución de comportamiento entre objetos. Dicha distribución puede dar lugar a una estructura de objetos con muchas conexiones entre ellos; en el peor de los casos, cada objeto acaba por conocer a todos los demás.
Aunque dividir un sistema en muchos objetos suele mejorar la reutilización, la proliferación de interconexiones tiende a reducir ésta de nuevo. Tener muchas interconexiones hace que sea menos probable que un objeto pueda funcionar sin la ayuda de otros —el sistema se comporta como si fuera monolítico—. Más aún, puede ser difícil cambiar el comportamiento del sistema de manera significativa, ya que él comportamiento se encuentra distribuido en muchos objetos. Como resultado, podemos vernos forzados a definir muchas subclases para personalizar el comportamiento del sistema.
Sea, por ejemplo, la implementación de cuadros de diálogo en una interfaz gráfica de usuario. Un cuadro de diálogo usa una ventana para presentar una colección de útiles tales como botones, menús y campos de entrada, como se muestra a continuación:

Muchas veces hay dependencias entre los útiles del diálogo. Por ejemplo, un botón está desactivado
 cuando está vacío un campo de entrada determinado. Seleccionar una entrada de una lista de
 opciones, llamada lista desplegable (list box), puede cambiar el contenido de un campo de entrada.
Distintos cuadros de diálogo tendrán distintas dependencias entre útiles. Así, aunque los diálogos
mestran los mismos tipos de útiles, no pueden reutilizar directamente las clases de útiles de las
 que se dispone; se ven obligados a personalizarlas para que reflejen las dependencias específicas 
de cada diálogo. Personalizarlas una a una mediante la herencia sería tedioso, ya que hay muchas
 clases involucradas.
Estos problemas pueden ser evitados encapsulando el comportamiento colectivo en un objeto 
aparte llamado mediador. Un mediador es responsable de controlar y coordinar las interacciones
 entre un grupo de objetos. El mediador hace las veces de un intermediario que evita que los objetos del grupo se refieran unos a otros explícitamente. Los objetos sólo conocen al mediador, reduciendo así el número de interconexiones.
Por ejemplo, DirectorDialogoFuente podría ser el mediador entre los útiles de un cuadro de diálogo. Un objeto DirectorDialogoFuente conoce a los útiles de un diálogo y coordina su interacción. Funciona como un concentrador de
 comunicaciones para útiles:
![image](https://user-images.githubusercontent.com/52029674/203967088-e6f8fcdb-dad1-4e0b-975b-073410a1d9d1.png)
![image](https://user-images.githubusercontent.com/52029674/203967104-5c5ae889-6118-4385-b5d9-c09f664c8891.png)
![image](https://user-images.githubusercontent.com/52029674/203967113-65d8a46b-4b84-4e81-840b-083d4ab5731a.png)

1. La lista desplegable le dice a su director que ha cambiado.
2. El director obtiene la selección de la lista.
3. El director le pasa la selección al campo de entrada.
4. Ahora que el campo de entrada contiene algo de texto, el director activa uno o varios botones que permitan inicializar una acción (por ejemplo, “negrita" o “cursiva”).

El comportamiento se encuentra localizado en una clase, puede cambiarse o reemplazarse extendiendo o sustituyendo esa clase.

![image](https://user-images.githubusercontent.com/52029674/203967253-0d3e0019-208f-458c-9dd7-3f4acdb2002a.png)

APLICABILIDAD

Úsese el patrón Mediator cuando

• un conjunto de objetos se comunican de forma bien definida, pero compleja. Las interdependencias resultantes no están estructuradas y son difíciles de comprender.

• es difícil reutilizar un objeto, ya que éste se refiere a otros muchos objetos, con los que se comunica.

• un comportamiento que está distribuido entre varias clases debería poder ser adaptado sin necesidad de una gran cantidad de subclases.

ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/203967362-235debdc-ddfc-499d-a5ad-d2ba15fbe527.png)

Mediador: Define una interfaz para comunicarse con sus objetos Colega

MediadorConcreto: Implementa el comportamiento cooperativo coordinando objetos
Colega.
Conoce a sus Colegas

Colega: Cada clase Colega conoce al su objetor Mediador.
Cada Colega se comunica con su Mediador cada vez que, de no existir
este, se hubiera comunicado con otro Colega.

CONSECUENCIAS

El patrón Mediator tiene las siguientes ventajas e inconvenientes:

1. Reduce la herencia. Un mediador localiza el comportamiento que de otra manera estaría distribuido en varios objetos. Para cambiar este comportamiento sólo es necesario crear una subclase del Mediador: las clases Colega pueden ser reutilizadas tal cual.
2. Desacopla a los Colegas. Un mediador promueve un bajo acoplamiento entre Colegas. Las clases Colega pueden usarse y modificarse de forma independiente.
3. Simplifica los protocolos de los objetos. Un mediador sustituye interacciones muchos-a-muchos por interacciones uno-a-muchos entre el mediador y sus Colegas. Las relaciones uno-a-muchos son más fáciles de comprender, mantener y extender.
4. Abstrae cómo cooperan los objetos. Hacer de la mediación un concepto independiente y en- capsularla en un objeto permite centrarse en cómo interactúan los objetos en vez de en su comportamiento individual. Eso ayuda a clarificar cómo interactúan los objetos de un sistema.
5. Centraliza el control. El patrón Mediator cambia complejidad de interacción por complejidad en el mediador. Dado que un mediador encapsula protocolos, puede hacerse más complejo que cualquier Colega individual. Esto puede hacer del mediador un monolito difícil de mantener.



Fuentes:

- Asignatura Patrones de Diseño de UDIMA

- Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.


