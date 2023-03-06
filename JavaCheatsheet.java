import java.util.*;
import java.util.stream.Collectors;

public class JavaCheatsheet {
    public static void main(String[] args) {

        // Typy danych
        byte bajt = 0x69;
        char znak = 'a';
        short malaLiczbaCalkowita = 420;
        int liczbaCalkowita = 69420;
        long wiekszaLiczbaCalkowita = 692137420;
        float zmiennoprzecinkowa = 123.456f;  // trzeba dodać na końcu f aby zaznaczyć, że to float a nie double
        double podwojnaPrecyzja = 123.456;
        boolean prawda = true;
        boolean falsz = false;

        // Tablice
        int[] numbers = {1, 2, 3, 4};
        int[] numbers2 = new int[]{1, 2 ,3, 4};
        int[] numbers3 = new int[4];

        ArrayList<String> lista = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for(int liczba : numbers) {
            System.out.println(liczba);
        }

        System.out.println(Arrays.toString(numbers));

        // Kolekcje

        // List
        System.out.println("List");

        List<String> names = new ArrayList<>();

        // dodanie elementów do listy
        names.add("Mateusz");
        names.add("Paulina");
        names.add("Jakub");
        names.add("Gosia");
        names.add("Jakub");

        System.out.println(names);

        names = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(names);

        // pobieranie elementów z listy
        String firstName = names.get(0);  // tak jak w przypadaku tablic liczymy od 0
        String secondName = names.get(1);

        System.out.println("Pierwsze imie to " + firstName);
        System.out.println("Drugie imie to " + secondName);

        // sprawdzenie czy element znajduje się w liście
        boolean isZbyszek = names.contains("Zbyszek");
        boolean isGosia = names.contains("Gosia");

        System.out.println("Czy Zbyszek jest: " + isZbyszek);
        System.out.println("Czy Gosia jest: " + isGosia);

        String name = "Paulina";
        if (names.contains(name)) {
            System.out.println(name + " znajduje sie na liscie");
        } else {
            System.out.println(name + " nie znajduje sie na liscie");
        }

        // sortowanie listy
        Collections.sort(names);

        System.out.println(names);

        // usuwanie elementów z listy
        names.remove("Jakub");

        System.out.println(names);

        // sprawdzenie czy lista jest pusta
        boolean czyPusta = names.isEmpty();
        System.out.println("Czy lista jest pusta? " + czyPusta);

        // wyczyszczenie listy
        names.clear();

        System.out.println(names);
        System.out.println(names.isEmpty());

        // Set
        System.out.println("Set");

        Set<String> namesSet = new HashSet<>();

        // dodawanie elementów do zbioru
        namesSet.add("Paulina");
        namesSet.add("Mateusz");
        namesSet.add("Jakub");
        namesSet.add("Gosia");
        namesSet.add("Jakub");
        namesSet.add("Domminik");



        System.out.println(namesSet);  // brak powtórzeń

        // usuwanie elementów ze zbioru
        namesSet.remove("Mateusz");
        System.out.println(namesSet);

        // sprawdzenie czy zbiór zawiera taki obiekt
        if (namesSet.contains("Jakub")) {
            System.out.println("Jakub znajduje sie w zbiorze");
        } else {
            System.out.println("Jakub nie znajduje sie w zbiorze");
        }

        // wyczyszczenie zbioru
        namesSet.clear();
        System.out.println(namesSet);

        // HashMap
        System.out.println("Map");

        Map<String, String> whoWhatColor = new HashMap<>();

        // dodawanie elementów do mapy
        whoWhatColor.put("Gosia", "różowy");
        whoWhatColor.put("Jakub", "niebieski");
        whoWhatColor.put("Mateusz", "fioletowy");
        whoWhatColor.put("Paulina", "czerwony");

        System.out.println(whoWhatColor);

        whoWhatColor.put("Paulina", "czarny");

        System.out.println(whoWhatColor);

        String mateuszHasColor = whoWhatColor.get("Mateusz");

        var keys = whoWhatColor.keySet();

        System.out.println("Keys: " + keys);

        var values = whoWhatColor.values();

        System.out.println("Values: " + values);

        // czy mapa zawiera klucz?
        if (whoWhatColor.containsKey("Maciej")) {
            System.out.println(whoWhatColor.get("Maciej"));
        } else {
            whoWhatColor.put("Maciej", "zielony");
        }

        var unknownPersonColor = whoWhatColor.getOrDefault("Andrzej", "szary");

        System.out.println(unknownPersonColor);

        // iterowanie po mapie

        for (var person : whoWhatColor.keySet()) {
            System.out.println(person + " lubi kolor " + whoWhatColor.get(person));
        }

        for (Map.Entry<String, String> personWithColor : whoWhatColor.entrySet()) {
            System.out.println(personWithColor.getKey() + " lubi kolor " + personWithColor.getValue());
        }
    }
}