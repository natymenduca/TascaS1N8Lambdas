

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class s108_n1Ex6_LambdasCadenasCortaALarga2 {

	public static void main(String[] args) {
		//Se crea una lista de objetos que contienen diferentes tipos de datos y luego ordena dicha lista alfabéticamente y de menor a mayor
		/*Crea una nueva lista llamada list utilizando el método asList() de la clase Arrays*/
		List<Object> lista = Arrays.asList("Enero", 1, "Febrero", 2, "Marzo", 3);//La lista contiene 6 elem, diferentes tipos de datos, incluyendo cadenas y enteros
		List<Object> sortedList = lista.stream()//Crea una nueva lista llamada sortedList.Se usa la función stream() de la lista lista para crear un flujo de los elem de la lista
		                              .sorted(Comparator.comparing(String::valueOf))/*se utiliza la función sorted() para ordenar los elementos del flujo alfabéticamente
		                              Se utiliza el método Comparator.comparing() para comparar los elementos de la lista. En este caso, se utiliza String::valueOf para
		                               convertir los elementos a cadenas antes de compararlos*/
		                              .collect(Collectors.toList());// se utiliza la función collect() para almacenar los elementos ordenados en una lista
		System.out.println(sortedList);	//Imprime la lista ordenada en la consola
		
	}

}


