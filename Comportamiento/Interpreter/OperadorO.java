package interpreter;

public class OperadorO extends OperadorBinario {

	public OperadorO(Expresion operandoIzquierdo,
			Expresion operandoDerecho)
			{
			super(operandoIzquierdo, operandoDerecho);
			}
			public boolean evalua(String descripcion)
			{
			return operandoIzquierdo.evalua(descripcion) ||
			operandoDerecho.evalua(descripcion);
			}
			
			// parte análisis sintáctico
			public static Expresion parsea() throws Exception
			{
			Expresion resultadoIzquierdo, resultadoDerecho;
			resultadoIzquierdo = OperadorY.parsea();
			while ((pieza != null) && (pieza.equals("o")))
			{
			siguientePieza();
			resultadoDerecho = OperadorY.parsea();
			resultadoIzquierdo = new OperadorO(resultadoIzquierdo,
			resultadoDerecho);
			}
			return resultadoIzquierdo;
			}
}
