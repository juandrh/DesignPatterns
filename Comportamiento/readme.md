# PATRONES DE COMPORTAMIENTO!


Tienen que ver con algoritmos y con la asignación de responsabilidades a objetos.

Describen no sólo patrones de clases y objetos, sino también patrones de comunicación entre ellos.

Describen el flujo de control complejo que es difícil de seguir en tiempo de ejecución, lo que nos permite olvidarnos del flujo de control para concentrarnos simplemente en el modo en que se interconectan los objetos.

Tipos:

Basados en clases: usan la herencia para distribuir el comportamiento entre clases:

Template Method: el más simple y común de los dos. Es una definición abstracta de un algoritmo. Define el algoritmo paso a paso, y cada paso invoca o bien a una operación abstracta o a una operación primitiva. Una subclase es la encargada de completar el algoritmo definiendo las operaciones abstractas.
Interpreter: representa una gramática como una jerarquía de clases e implementa un intérprete como una operación sobre las instancias de dichas clases.

Basados en objetos: usan la composición de objetos:

Chain of responsability: bajo acoplamiento. Permite en viar peticiones a un objeto implícitamente, a través de una cadena de objetos candidatos. Cualquier candidato puede satisfacer la petición dependiendo de una serie de condiciones en tiempo de ejecución. El número de candidatos es indeterminado, y se puede seleccionar en tiempo de ejecución qué candidatos participan en la cadena.

Command: encapsula una petición en un objeto de modo que pueda ser pasada como pa- rámetro, guardada en un historial o manipulada de alguna otra forma.

Iterator: abstrae el modo en que se accede y se recorren los objetos de una agregación.

Mediator: introduce un objeto mediador entre todos los objetos parejos

Memento.

Observer: define y mantiene una dependencia entre objetos.(ej. Modelo/Vista/Controlador)

State: encapsula los estados de un objeto para que éste pueda cambiar su comportamiento cuando cambia su estado.

Strategy: encapsula un algoritmo en un objeto, facilitando especificar y cambiar el algoritmo que usa un objeto.

Visitor: encapsula comportamiento que de otro modo estaría distribuido en varias clases.


