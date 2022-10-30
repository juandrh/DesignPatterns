package pattern.cliente;

import pattern.Boton;
import pattern.CajaTexto;
import pattern.FactoriaComponentes;
import pattern.FactoriaLinux;
import pattern.FactoriaWindows;

public class Cliente2 {

	public static void main(String[] args) {

		FactoriaComponentes factoria;
		CajaTexto cajaTextoNombre;
		Boton botonAceptar;
		Boton botonCancelar;

		// Generacion aleatoria de la factoria concreta
		factoria = (Math.random() < 0.5 ? new FactoriaWindows() : new FactoriaLinux());

		cajaTextoNombre = factoria.crearCajaTexto();
		botonAceptar = factoria.crearBoton();
		botonCancelar = factoria.crearBoton();

		System.out.println(cajaTextoNombre.getClass().getSimpleName());
		System.out.println(botonAceptar.getClass().getSimpleName());
		System.out.println(botonCancelar.getClass().getSimpleName());

	}

}
