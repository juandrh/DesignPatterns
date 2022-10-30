
public class FactoriaProductos {

	public Producto crearProducto(String nombre) {
		Producto producto = null;
		if (nombre == "LECHE"){
		producto = new Leche();
		}
		else if (nombre.equals("PAN")){
		producto = new Pan();
		}
		return producto;
		}

}
