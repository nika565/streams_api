package Desafios.ds001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  - Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente.
 *  - Exiba a lista ordenada no console.
 */

public class Desafio1 {
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>(Arrays.asList(5, 10, 3, 1, 9, 4, 8, 2, 6, 7));

        List<Integer> listaOrdenada = lista.stream().sorted().collect(Collectors.toList());

        System.out.println(listaOrdenada);
    }
}
