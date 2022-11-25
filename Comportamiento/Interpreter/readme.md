# INTERPRETER



PROPÓSITO

Dado un lenguaje, define una representación de su gramática junto con un intérprete que usa dicha representación para interpretar sentencias del lenguaje.

MOTIVACIÓN

buscar cadenas que concuerden con un patrón. En vez de construir algoritmos personalizados que comparen cada patrón con diferentes cadenas, podríamos tener algoritmos de búsqueda que interpretasen una expresión regular que especifica el conjunto de cadenas a buscar.

El patrón Interpreter describe cómo definir una gramática para lenguajes simples, cómo representar instrucciones de ese lenguaje y cómo interpretar esas instrucciones. En nuestro ejemplo, el patrón describe cómo definir una gramática para expresiones regulares, cómo representar una expresión regular concreta y cómo interpretar dicha expresión regular.


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
![image](https://user-images.githubusercontent.com/52029674/203949938-0d0f493e-9559-455e-8cdd-45e09778c1a5.png)

