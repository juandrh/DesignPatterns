ADAPTER (Wrapper, Envoltorio)

PROPÓSITO

Convierte la interfaz de una clase en otra interfaz que es la que esperan los clientes. Permite que cooperen clases que de otra forma no podrían por tener interfaces incompatibles.


APLICABILIDAD

• se quiere usar una clase existente y su interfaz no concuerda con la que necesita.

• se quiere crear una clase reutilizable que coopere con clases no relacionadas o que no han sido previstas, es decir, clases que no tienen por qué tener interfaces compatibles.

• (solamente en el caso de un adaptador de objetos) es necesario usar varias subclases existentes, pero no resulta práctico adaptar su interfaz heredando de cada una de ellas. Un adaptador de objetos puede adaptar la interfaz de su clase padre.



ESTRUCTURA

Adapter de clases

Usa la herencia para adaptar una interfaz a otra.

Herencia múltiple en Java → No soportada

![image](https://user-images.githubusercontent.com/52029674/198878191-28801754-47f4-4924-ac7d-3a43d708600f.png)

Adapter de objetos

Usa la composición de objetos.

• El Cliente solamente ve la interfaz Objetivo (Target)

• El Adaptador (Adapter)

◦ implementa la interfaz Objetivo.

◦ mantiene una referencia al objeto a Adaptable (Adaptee)

◦ redirige las peticiones al objeto Adaptable

![image](https://user-images.githubusercontent.com/52029674/198878204-bd5835b5-7c12-42da-a975-4de612380b80.png)


PARTICIPANTES

• Objetivo (Forma) - define la interfaz específica del dominio que usa el Cliente.

• Cliente (EditorDeDibujo) - colabora con objetos que se ajustan a la interfaz Objetivo.

• Adaptable (VistaTexto) - define una interfaz existente que necesita ser adaptada.

• Adaptador (FormaTexto) - adapta la interfaz de Adaptable a la interfaz Objetivo.



CONSECUENCIAS

