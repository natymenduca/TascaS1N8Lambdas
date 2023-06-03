package s108_n1Ex2_LambdasLetraOy5Letras;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s108_n1Ex2_LambdasLetraOy5Letras {

	public static void main(String[] args) {
		//se utiliza Java Stream y Collectors para filtrar una lista de strings 
		List<String> cadena = Arrays.asList("Sapo", "Murcielago", "Rana-Rene");//se crea una lista de strings 
		List<String> cadenaFiltrada = cadena.stream()
		                                      .filter(s -> s.contains("o")) //(s -> s.contains("o")) expesionLambda
		                                      .filter(s -> s.length() > 5) //(s -> s.length() > 5) expresionLambda
		                                       .collect(Collectors.toList());
		System.out.println(cadenaFiltrada);
	}

}
