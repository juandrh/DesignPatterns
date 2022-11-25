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

![image](https://user-images.githubusercontent.com/52029674/203949424-19e36ffb-9f38-4fe6-89dc-7c243fc5b700.png)


PARTICIPANTES

• ExpresionAbstracta (ExpresionRegular)
- declara una operación abstracta Interpretar que es común a todos los nodos del árbol de sintaxis abstracto.
• ExpresionTerminal (ExpresionLiteral)
- implementa una operación Interpretar asociada con los símbolos terminales de la gramática.
- se necesita una instancia de esta clase para cada símbolo terminal de una sentencia.
• ExpresionNoTerminal (ExpresionAltemativa, ExpresionRepeticion, ExpresionSecuencia)
- por cada regla de la gramática R ::= R1, R2... Rn debe haber una de estas clases.
- mantiene variables de instancia de tipo ExpresionAbstracta para cada uno de los símbolos de Rl a Rn.
- implementa una operación Interpretar para lo símbolos no terminales de la gramática. Interpretar normalmente se llama a sí misma recursivamente sobre las variables que representan de Rl a Rn.
• Contexto
- contiene información que es global al intérprete.
• Cliente
- construye (o recibe) un árbol sintáctico abstracto que representa una determinada sentencia del lenguaje definido por la gramática. Este árbol sintáctico abstracto está formado por instancias de las clases ExpresionNoTerminal y ExpresionTerminal.
- invoca a la operación Interpretar.

CONSECUENCIAS

El patrón Interpreter tiene las siguientes ventajas e inconvenientes:

1. Es fácil cambiar y ampliar la gramática. Puesto que el patrón usa clases para representar las reglas de la gramática, se puede usar la herencia para cambiar o extender ésta. Se puede modificar incrementalmente las expresiones existentes, y se pueden definir otras nuevas como variaciones de las antiguas.
2. También resulta fácil implementar la gramática. Las clases que definen los nodos del árbol sintáctico abstracto tienen implementaciones similares. Estas clases son fáciles de escribir, y muchas veces se pueden generar automáticamente con un compilador o un generador de analizadores sintácticos.
3. Las gramáticas complejas son difíciles de mantener. El patrón Interpreter define al menos una clase para cada regla de la gramática (las reglas que se hayan definido usando BNF pueden necesitar varias clases). De ahí que las gramáticas que contienen muchas reglas pueden ser difíciles de controlar y mantener. Se pueden aplicar otros patrones de diseño para mitigar el pro- blema (véase la sección de Implementación). Pero cuando la gramática es muy compleja son más adecuadas otras técnicas como los generadores de analizadores sintácticos o de compiladores.
4. Añadir nuevos modos de interpretar expresiones. El patrón Interpreter facilita evaluar una expresión de una manera distinta. Por ejemplo, podríamos permitir imprimir con formato una expresión o realizar una comprobación de tipos en ella definiendo una nueva operación en las clases de las expresiones. Si vamos a seguir añadiendo nuevos modos de interpretar una expresión, deberíamos considerar la utilización del patrón Visitor (305) para evitar cambiar las clases de la gramática.

Fuentes:

- Asignatura Patrones de Diseño de UDIMA

- Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.


