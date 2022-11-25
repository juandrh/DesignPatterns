# CHAIN OF RESPONSIBILITY


PROPÓSITO

Evita acoplar el emisor de una petición a su receptor, dando a más de un objeto la posibilidad de responder a la petición. Encadena los objetos receptores y pasa la petición a través de la cadena hasta que es procesada por algún objeto.

MOTIVACIÓN

Supongamos un servicio de ayuda sensible al contexto para una interfaz gráfica de usuario. El usuario puede obtener información de ayuda en cualquier parte de la interfaz simplemente pulsando con el ra- tón sobre ella.
Es natural organizar la información de ayuda de acuerdo con su generalidad -de lo más específico a lo más general-.
El problema es que el objeto que en última instancia proporciona la ayuda no conoce explícita- mente al objeto (por ejemplo, el botón) que inicializa la petición de ayuda. Necesitamos un modo de desacoplar el botón que da lugar a la petición de ayuda de los objetos que podrían proporcionar dicha información. 
La idea de este patrón es desacoplar a los emisores y a los receptores dándole a varios objetos la posibilidad de tratar una petición. La petición se pasa a través de una cadena de objetos hasta que es procesada por uno de ellos.

El primer objeto de la cadena recibe la petición y, o bien  la procesa o bien la redirige al siguiente candidato en la 
cadena, el cual hace lo mismo. El objeto que hizo la petición  no tiene un conocimiento explícito de quién la tratará 
-decimos que la petición tiene un receptor implícito-.
Para reenviar la petición a lo largo de la cadena, y para garantizar
 que los receptores permanecen implícitos, cada objeto de la
 cadena comparte una interfaz común para procesar peticiones 
y para acceder a su sucesor en la cadena.
![image](https://user-images.githubusercontent.com/52029674/203957100-3e74b86c-63fe-4e71-ad76-c281d6b7a0fe.png)
![image](https://user-images.githubusercontent.com/52029674/203957112-a1e30952-be8e-4194-ac04-c4a158865e41.png)
![image](https://user-images.githubusercontent.com/52029674/203957126-81091fdb-f9e7-4400-8e21-d19dfad1d98b.png)

APLICABILIDAD

Cuando

• hay más de un objeto que pueden manejar una petición, y el manejador no se conoce a priori, sino que debería determinarse automáticamente

• se quiere enviar una petición a un objeto entre varios sin especificar explícitamente el receptor.

• el conjunto de objetos que pueden tratar una petición debería ser especificado dinámicamente.

ESTRUCTURA    

![image](https://user-images.githubusercontent.com/52029674/203957286-04a59183-c50f-4381-a1cf-0bf3cc883b52.png)


Manejador (Trabajador):

- Define una interfaz para tratar las peticiones.
- Opcionalmente implementa el enlace al sucesor.
- 
ManejadorConcreto (Cajero, Gerente, Director):

- Trata la peticiones de las que es
responsable.
- Puede acceder a su sucesor.
- Si no puede manejar la petición
la reenvía a su sucesor

Cliente

Inicializa la petición a un objeto
ManejadorConcreto de la cadena


CONSECUENCIAS

Este patrón tiene las siguientes ventajas e inconvenientes:

1. Reduce el acoplamiento. El patrón libera a un objeto de tener que saber qué otro objeto maneja una petición. Un objeto sólo tiene que saber que una petición será manejada “de forma apropiada”.Ni el receptor ni el emisor se conocen explícitamente entre ellos, y un objeto de la cadena tampoco tiene que conocer la estructura de ésta. 
Como resultado, la Cadena de Responsabilidad puede simplificar las interconexiones entre objetos. En vez de que los objetos mantengan referencias a todos los posibles receptores, sólo tienen una única referencia a su sucesor.

2. Añade flexibilidad para asignar responsabilidades a objetos. ofrece una flexibilidad añadida para repartir responsabilidades entre objetos. Se pueden añadir o cambiar responsabilidades para tratar una petición modificando la cadena en tiempo de ejecución. Esto se puede combinar con la herencia para especializar los manejadores estáticamente.

3. No se garantiza la recepción. Dado que las peticiones no tienen un receptor explícito, no hay garantía de que sean manejadas -la petición puede alcanzar el final de la cadena sin haber si- do procesada-. Una petición también puede quedar sin tratar cuando la cadena no está configurada correctamente.



Fuentes:

- Asignatura Patrones de Diseño de UDIMA

- Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.
