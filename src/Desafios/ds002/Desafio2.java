package Desafios.ds002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  - Utilize a Stream API para somar os números pares da lista.
 *  - Exiba o resultado da soma no console.
 */

public class Desafio2 {

    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Integer soma = lista
                .stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Resultado da soma: " + soma);
    }

}
