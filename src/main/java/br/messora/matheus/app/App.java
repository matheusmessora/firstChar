package br.messora.matheus.app;

import br.messora.matheus.app.stream.Stream;

import java.util.*;

public class App {

    public static char firstChar(Stream input){
        List<Character> uniques = new ArrayList<>();
        Set<Character> duplicates = new HashSet<>();

        while(input.hasNext()) {
            Character next = input.getNext();

            boolean charAlreadyFound = duplicates.contains(next);
            if(!charAlreadyFound) {
                boolean isUnique = uniques.contains(next);
                if(isUnique){
                    duplicates.add(next);
                    uniques.remove(next);
                }else {
                    uniques.add(next);
                }
            }
        }

        if(uniques.isEmpty()) {
            throw new IllegalArgumentException("O stream informado nao possui caracteres unicos.");
        }
        return uniques.get(0);
    }
}
