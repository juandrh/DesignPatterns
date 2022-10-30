

public class Cliente {

	public static void main(String[] args) {
		FactoriaProductos factoria = new FactoriaProductos();
		Producto producto1 = factoria.crearProducto("LECHE");
		Producto producto2 = factoria.crearProducto("PAN");
		Producto producto3 = factoria.crearProducto("zumo");
		System.out.println(producto1.getClass().getSimpleName());
		System.out.println(producto2.getClass().getSimpleName());
		System.out.println(producto3.getClass().getSimpleName());
		}

}
