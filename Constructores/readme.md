PATRONES DE CREACIÓN

Abstraen el proceso de creación de instancias. Hacen un sistema independiente de cómo se crean, se componen y se representan sus objetos. 
Tipos de patrón de creación:
de clases:  usa la herencia para cambiar la clase de la instancia a crear
de objetos: delega la creación de la instancia en otro objeto
Los sistemas al evolucionar para depender más de la composición de objetos que de la herencia de clases. Definir un conjunto más pequeño de comportamientos fundamentales que pueden componerse con otros más complejos.

Temas recurrentes:
todos ellos encapsulan el conocimiento sobre las clases concretas que usa el sistema.
todos ocultan cómo se crean y se asocian las instancias de estas clases
El sistema lo único que conoce acerca de los objetos son sus interfaces. Dan mucha flexibilidad a qué es lo que se crea, quién lo crea y cuándo. Los objetos “producto” pueden variar mucho en estructura y funcionalidad.

Configuración:
estática:  especificada en tiempo de compilación
Dinámica:  en tiempo de ejecución.

Patrones: 
Factory Method
Abstract Factory
Builder
Prototype
Singleton

