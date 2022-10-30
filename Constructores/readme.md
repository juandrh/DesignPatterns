<h1>PATRONES DE CREACIÓN</h1>

Abstraen el proceso de creación de instancias. Hacen un sistema independiente de cómo se crean, se componen y se representan sus objetos. 
Tipos de patrón de creación:<br>
- de clases:  usa la herencia para cambiar la clase de la instancia a crear<br>
- de objetos: delega la creación de la instancia en otro objeto<br>
Los sistemas al evolucionar para depender más de la composición de objetos que de la herencia de clases. Definir un conjunto más pequeño de comportamientos fundamentales que pueden componerse con otros más complejos.<br><br>

Temas recurrentes:<br>
- todos ellos encapsulan el conocimiento sobre las clases concretas que usa el sistema.<br>
- todos ocultan cómo se crean y se asocian las instancias de estas clases<br>
El sistema lo único que conoce acerca de los objetos son sus interfaces. Dan mucha flexibilidad a qué es lo que se crea, quién lo crea y cuándo. Los objetos “producto” pueden variar mucho en estructura y funcionalidad.<br>

Configuración:<br>
- Estática:  especificada en tiempo de compilación<br>
- Dinámica:  en tiempo de ejecución.<br><br>

Patrones: <br>
Factory Method<br>
Abstract Factory<br>
Builder<br>
Prototype<br>
Singleton<br>

Fuentes:
-   Asignatura Patrones de Diseño de UDIMA 
-   Gamma, E., Helm, R., Johnson, R., Vilssides, J. "Patrones de Diseño", Ed: Addison Wesley.

