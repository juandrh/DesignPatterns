# INTERPRETER



PROPÓSITO

Dado un lenguaje, define una representación de su gramática junto con un intérprete que usa dicha representación para interpretar sentencias del lenguaje.

MOTIVACIÓN

buscar cadenas que concuerden con un patrón. En vez de construir algoritmos personalizados que comparen cada patrón con diferentes cadenas, podríamos tener algoritmos de búsqueda que interpretasen una expresión regular que especifica el conjunto de cadenas a buscar.

El patrón Interpreter describe cómo definir una gramática para lenguajes simples, cómo representar instrucciones de ese lenguaje y cómo interpretar esas instrucciones. En nuestro ejemplo, el patrón describe cómo definir una gramática para expresiones regulares, cómo representar una expresión regular concreta y cómo interpretar dicha expresión regular.

![image](https://user-images.githubusercontent.com/52029674/203950691-a23c7d3e-40d0-4873-8480-24ff51a87696.png)

![image](https://user-images.githubusercontent.com/52029674/203950724-ce2cf885-9087-441a-8daa-2aea7fc74eee.png)

![image](https://user-images.githubusercontent.com/52029674/203950762-e59b0b73-2c4f-4f41-8b7e-a67f54c11ea0.png)

Cada expresión regular definida por esta gramática se representa por un árbol sintáctico abstracto formado por instancias de estas clases Por ejemplo el árbol sintáctico abstracto representa la expresión regular  lloviendo & (pernos | gatos)

Podemos crear un intérprete para estas expresiones regulares definiendo la operación Interpretar en ca da subclase de ExpresionRegular. Interpretar toma como argumento el contexto en el cual se interpreta la expresión. El contexto contiene la cadena de entrada e información acerca de qué parte de ella se ha reconocido hasta el momento. Cada subclase de ExpresionRegular implementa Interpretar para re- conocer la siguiente parte de la cadena de entrada en función del contexto actual.

APLICABILIDAD

Úsese el patrón Interpreter cuando hay un lenguaje que interpretar y se pueden representar las sentencias del lenguaje como árboles de sintácticos abstractos. El patrón Interpreter funciona mejor cuando:

• la gramática es simple. Para gramáticas complejas, la jerarquía de clases de la gramática se vuelve grande e inmanejable. Herramientas como los generadores de analizadores sintácticos constituyen una alternativa mejor en estos casos. Éstas pueden interpretar expresiones sin necesidad de construir árboles sintácticos abstractos, lo que puede ahorrar espacio y, posiblemente, tiempo.

• la eficiencia no es una preocupación crítica. Los intérpretes más eficientes normalmente no se implementan interpretando árboles de análisis sintáctico directamente, sino que primero los traducen a algún otro formato. Por ejemplo, las expresiones regulares suelen transformarse en máquinas de estados. Pero incluso en ese caso, el traductor puede implementarse con el patrón Interpreter, de modo que éste sigue siendo aplicable.



ESTRUCTURA

![image](https://user-images.githubusercontent.com/52029674/203954023-160af3ff-95af-4226-9f40-cf435b1c8759.png)



PARTICIPANTES

- Expresión es una clase abstracta que representa cualquier tipo de expresión, es
decir cualquier nodo del árbol sintáctico.
- OperadorAbstracto (OperadorBinario) es también una clase abstracta. Describe
cualquier nodo de tipo operador, es decir que posea operandos que son
subárboles del árbol sintáctico.
- OperadorConcreto1 y OperadorConcreto2 (OperadorY, OperadorO) son
implementaciones del OperadorAbstracto que describen completamente la
semántica del operador y por tanto son capaces de evaluarlo.
- ElementoTerminal es una clase abstracta que describe cualquier nodo
correspondiente a un elemento terminal.
- ElementoTerminalConcreto1 y ElementoTerminalConcreto2 (PalabraClave) son
clases concretas que se corresponden con un elemento terminal, capaces de
evaluar este elemento.

CONSECUENCIAS

El patrón Interpreter tiene las siguientes ventajas e inconvenientes:

1. Es fácil cambiar y ampliar la gramática. Puesto que el patrón usa clases para representar las reglas de la gramática, se puede usar la herencia para cambiar o extender ésta. Se puede modificar incrementalmente las expresiones existentes, y se pueden definir otras nuevas como variaciones de las antiguas.
2. También resulta fácil implementar la gramática. Las clases que definen los nodos del árbol sintáctico abstracto tienen implementaciones similares. Estas clases son fáciles de escribir, y muchas veces se pueden generar automáticamente con un compilador o un generador de analizadores sintácticos.
3. Las gramáticas complejas son difíciles de mantener. El patrón Interpreter define al menos una clase para cada regla de la gramática (las reglas que se hayan definido usando BNF pueden necesitar varias clases). De ahí que las gramáticas que contienen muchas reglas pueden ser difíciles de controlar y mantener. Se pueden aplicar otros patrones de diseño para mitigar el pro- blema (véase la sección de Implementación). Pero cuando la gramática es muy compleja son más adecuadas otras técnicas como los generadores de analizadores sintácticos o de compiladores.
4. Añadir nuevos modos de interpretar expresiones. El patrón Interpreter facilita evaluar una expresión de una manera distinta. Por ejemplo, podríamos permitir imprimir con formato una expresión o realizar una comprobación de tipos en ella definiendo una nueva operación en las clases de las expresiones. Si vamos a seguir añadiendo nuevos modos de interpretar una expresión, deberíamos considerar la utilización del patrón Visitor (305) para evitar cambiar las clases de la gramática.

Fuentes:

- Asignatura Patrones de Diseño de UDIMA

- Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.


