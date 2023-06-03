package s108_N1Ex5_LambdasNumeroPi;

public class S108_N1Ex5_LambdasNumeroPi {

	public static void main(String[] args) {
		//En el método main, se crea una instancia de la interfaz PiValue utilizando una expresión lambda que devuelve el valor 3.1415. 
	
		PiValue valorPi = () -> 3.1415;
	    System.out.println(valorPi.getPiValue());//	Luego, se llama al método "getPiValue()" de esa instancia y se imprime el valor devuelto
	}

}
