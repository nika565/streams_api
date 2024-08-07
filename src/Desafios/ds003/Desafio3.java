package Desafios.ds003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * - Com a Stream API, verifique se todos os números da lista são positivos.
 * - Exiba o resultado da verificação no console.
 */

public class Desafio3 {
    public static void main(String[] args){

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, 9));

        List<Integer> listaNegativos = lista.stream().filter(n -> n < 0).toList();

        if(listaNegativos.size() == 0){
            System.out.println("Todos os números são positivos...");
        } else {
            System.out.println("A lista possui números negativos...");
        }

    }
}
