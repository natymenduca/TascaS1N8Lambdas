package s108_N1Ex5_LambdasNumeroPi;

@FunctionalInterface
public interface PiValue {
	/* una interfaz funcional llamada "PiValue" que tiene un método abstracto "getPiValue()" que devuelve un valor double.
	La anotación @FunctionalInterface se utiliza para indicar que esta interfaz es una interfaz funcional y que se puede usar
	una expresión lambda para implementarla*/
	double getPiValue();

}
