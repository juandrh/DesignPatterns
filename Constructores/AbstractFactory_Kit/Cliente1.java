package pattern.cliente;

import pattern.Boton;
import pattern.CajaTexto;
import pattern.FactoriaComponentes;
import pattern.FactoriaWindows;

public class Cliente1 {

	public static void main(String[] args) {

		FactoriaComponentes factoria;

		CajaTexto cajaTextoNombre;
		Boton botonAceptar;
		Boton botonCancelar;

		factoria = new FactoriaWindows();

		cajaTextoNombre = factoria.crearCajaTexto();
		botonAceptar = factoria.crearBoton();
		botonCancelar = factoria.crearBoton();

		System.out.println(cajaTextoNombre.getClass().getSimpleName());
		System.out.println(botonAceptar.getClass().getSimpleName());
		System.out.println(botonCancelar.getClass().getSimpleName());

	}

}
