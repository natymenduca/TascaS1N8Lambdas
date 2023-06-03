package s108_n2Ex4_LambdasCadenasTextoYNumeros;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class S108_n2Ex4_LambdasCadenasTextoYNumeros {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Oso", "1", "Gato", "36", "4973","Elefante");

        // Ordenar alfabéticamente por el primer carácter
        lista.sort(Comparator.comparing(s -> s.charAt(0)));
        System.out.println("Lista ordenada alfabéticamente por el primer carácter: " + lista);

        // Ordenar por cadenas que contienen una "e" primero
        lista.sort((s1, s2) -> {
            if (s1.contains("e") && !s2.contains("e")) {
                return -1;
            } else if (s2.contains("e") && !s1.contains("e")) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println("Lista ordenada con cadenas que contienen una \"e\" primero: " + lista);

        // Reemplazar todas las "a" por "4"
        lista.replaceAll(s -> s.contains("a") ? s.replace("a", "4") : s);
        System.out.println("Lista con todas las \"a\" reemplazadas por \"4\": " + lista);

        // Mostrar solo los elementos numéricos
        lista.stream()
             .filter(s -> s.matches("\\d+"))
             .forEach(System.out::println);
    }
}

