PROPÓSITO

Separa la construcción de un objeto complejo de su representación, de forma que el mismo proceso de construcción pueda crear diferentes representaciones.


APLICABILIDAD

Cuando:

• el algoritmo para crear un objeto complejo debiera ser independiente de las partes de que se compone dicho objeto y de cómo se ensamblan.
• el proceso de construcción debe permitir diferentes representaciones del objeto que está siendo construido.

ESTRUCTURA


![image](https://user-images.githubusercontent.com/52029674/198869788-2267acce-529d-44df-aea1-671acb99859d.png)



PARTICIPANTES

• Constructor (ConstructordeVehiculos): especifica una interfaz abstracta para crear las partes de un objeto Producto.

• ConstructorConcreto (ConstructordeVehiculosCombustion,ConstructordeVehiculosElectricos)

- implementa la interfaz Constructor para construir y ensamblar las partes del producto.
- define la representación a crear.
- proporciona una interfaz para devolver el producto (p. ej„ ObtenerTextoASCII, Obtener- UtilDeTexto).

• Director (DirectorConstruccion): construye un objeto usando la interfaz Constructor. 

• Producto (VehiculoElectrico,VehiculoCombustion)

- representa el objeto complejo en construcción. El ConstructorConcreto construye la representación interna del producto y define el proceso de ensamblaje.
- incluye las clases que definen sus partes constituyentes, incluyendo interfaces para ensamblar las partes en el resultado final.

