package Desafios.ds006;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * - Utilize a Stream API para verificar se a lista contém algum número maior que 10.
 * - Exiba o resultado da verificação no console.
 */

public class Desafio6 {

    public static void main(String[] args){

        Random random = new Random();
        List<Integer> lista = new ArrayList<>();

        // Gerando números aleatórios até vinte
        for(var i = 0; i < 10; i++){
            lista.add(random.nextInt(20));
        }

        // Filtrando para saber quais números são maiores que 10

        List<Integer> listaMaioresQue10 = lista
                .stream()
                .filter(n -> n > 10)
                .distinct()
                .toList();

        System.out.println("Lista: " + listaMaioresQue10);

        if(listaMaioresQue10.size() == 0){
            System.out.println("Não existe número maior que dez...");
            return;
        }

        System.out.println("Existe número maior que dez!");

    }

}
