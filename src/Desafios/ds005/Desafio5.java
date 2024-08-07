package Desafios.ds005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * - Com a Stream API, calcule a média dos números maiores que 5.
 * - Exiba o resultado da média no console.
 */

public class Desafio5 {

    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Filtrando números maiores que 5
        List<Integer> listaMaioresQueCinco = lista.stream().filter(n -> n > 5).toList();

        // Calculando a média;
        Integer soma = listaMaioresQueCinco
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        Integer media = soma / listaMaioresQueCinco.size();

        System.out.println("Média: " + media);
    }

}
