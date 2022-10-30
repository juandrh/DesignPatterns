<h1>Composite</h1>

PROPÓSITO

Compone objetos en estructuras de árbol para representar jerarquías de parte-todo. Permite que los clientes traten de manera uniforme a los objetos individuales y a los compuestos.

APLICABILIDAD

Cuando:

• quiera representar jerarquías de objetos parte-todo.

• quiera que los clientes sean capaces de obviar las diferencias entre composiciones de objetos y los objetos individuales. Los clientes tratarán a todos los objetos de la estructura compuesta de manera uniforme.

ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/198878820-d256e1dc-5875-4800-b4c8-3ac9e1e40ebe.png)


PARTICIPANTES

• Componente (Gráfico)
- declara la Interfaz de los objetos de la composición.
- implementa el comportamiento predeterminado de la interfaz que es común a todas las clases.
- declara una Interfaz para acceder a sus componentes hijos y gestionarlos.
- (opcional) define una Interfaz para acceder al padre de un componente en la estructura recursiva y. si es necesario, la implementa.
• Hoja (Rectángulo, Linea, Texto, etc.)
- representa objetos hoja en la composición. Una hoja no tiene hijos.
- define el comportamiento de los objetos primitivos de la composición.
• Compuesto (Dibujo)
- define el comportamiento de los componentes que tienen hijos.
- almacena componentes hijos.
- implementa las operaciones de la interfaz Componente relacionadas con los hijos.
• Cliente
- manipula objetos en la composición a través de la interfaz Componente.

CONSECUENCIAS

• define jerarquías de clases formadas por objetos primitivos y compuestos. Los objetos primitivos pueden componerse en otros objetos más complejos, que a su vez pueden ser compuestos, y así de manera recurrente. Allí donde el código espere un objeto primitivo, también podrá recibir un objeto compuesto.

• simplifica el cliente. Los clientes pueden tratar uniformemente a las estructuras compuestas y a los objetos individuales. Los clientes normalmente no conocen (y no les debería importar) si están tratando con una hoja o con un componente compuesto. Esto simplifica el código del cliente, puesto que evita tener que escribir funciones con instrucciones lf anidadas en las clases que definen la composición.

• facilita añadir nuevos tipos de componentes. Si se definen nuevas subclases Compuesto u Hoja, éstas funcionarán automáticamente con las estructuras y el código cliente existentes. No hay que cambiar los clientes para las nuevas clases Componente.

• puede hacer que un diseño sea demasiado general. La desventaja de facilitar añadir nuevos componentes es que hace más difícil restringir los componentes de un compuesto. A veces queremos que un compuesto sólo tenga ciertos componentes. Con el patrón Composite, no podemos con fiar en el sistema de tipos para que haga cumplir estas restricciones por nosotros. En vez de eso, tendremos que usar comprobaciones en tiempo de ejecución.



Fuentes:
-   Asignatura Patrones de Diseño de UDIMA impartida por Javier Rodríguez Pérez
-   Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.
-   https://refactoring.guru/es/design-patterns
