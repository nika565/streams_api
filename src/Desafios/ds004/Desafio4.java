package Desafios.ds004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * - Utilize a Stream API para remover os valores ímpares da lista.
 * - Imprima a lista resultante no console.
 */

public class Desafio4 {

    public static void main(String[] args){

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> listaDePares = lista
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Lista após remoção dos números ímpares: " + listaDePares);

    }

}
