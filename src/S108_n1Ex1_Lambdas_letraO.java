

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S108_n1Ex1_Lambdas_letraO {

	public static void main(String[] args) {
		
		List<String> cadena = Arrays.asList("Sapo", "Murcielago", "Rana-Rene");
		List<String> cadenaFiltrada = cadena.stream()
		                                      .filter(s -> s.contains("o"))//Se aplica un filtro al Stream con el método filter + 1 expresión lambda que evalúa si el String contiene "o".
		                                      .collect(Collectors.toList());//Se recopilan los elementos filtrados en una nueva lista utilizando el método collect y la interfaz Collectors
		System.out.println(cadenaFiltrada);//Se imprime la nueva lista
    }

}
