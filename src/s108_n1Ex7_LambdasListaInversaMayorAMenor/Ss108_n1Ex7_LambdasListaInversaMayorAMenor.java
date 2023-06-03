package s108_n1Ex7_LambdasListaInversaMayorAMenor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ss108_n1Ex7_LambdasListaInversaMayorAMenor {

	public static void main(String[] args) {
		/*Se crea una lista de objetos que contienen cadenas de texto y números. Luego, utiliza la API de transmisión de Java 8 para ordenar
		la lista de manera descendente por los valores de los elementos convertidos a cadenas de texto, la lista ordenada se imprime en la consola*/
		List<Object> lista = Arrays.asList("Enero", 1, "Febrero", 2, "Marzo", 3);/*Crea una lista de obj que contiene cadenas de texto y num utilizando
		                                                                         el método estático asList() de la clase Arrays*/
		List<Object> sortedList = lista.stream()//Convierte la lista en un flujo de objetos utilizando el método stream() de la clase List.
		                              .sorted(Comparator.comparing(String::valueOf).reversed())/*Ordena los elementos del flujo utilizando el método
		                               sorted() de la clase Stream. El método comparing() de la clase Comparator se utiliza para especificar la clave
		                                de ordenación, que en este caso es la conversión de cada elemento en una cadena de texto utilizando el método 
		                                valueOf() de la clase String. El método reversed() se utiliza para ordenar los elementos en orden descendente*/
		                              .collect(Collectors.toList());/*Recopila los elementos ordenados en una nueva lista utilizando el método collect() 
		                                                            de la clase Stream. El método toList() de la clase Collectors se utiliza para crear 
		                                                            una lista a partir de los elementos recopilados*/
		System.out.println(sortedList);//Imprime la lista ordenada en la consola utilizando el método println() de la clase System		
	}

}
