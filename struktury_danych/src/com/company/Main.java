package com.company;

import java.util.*;


public class Main {

    static private void printHeader(int index){
        System.out.println();
        String outputString = "______________ " + index + " ______________ ";
        System.out.println(outputString);
    }


    private static void arrayListExamples() {
        List<String> toolAlbums = new ArrayList<>();

        printHeader(1);
        toolAlbums.add("Undertow");
        toolAlbums.add("Aenima");
        toolAlbums.add("Lateralus");
        toolAlbums.add("10,000 Days");
        toolAlbums.forEach(System.out::println);

        printHeader(2);
        System.out.println(toolAlbums.get(0));
        System.out.println(toolAlbums.get(1));

        printHeader(3);
        toolAlbums.remove("Lateralus");
        toolAlbums.remove("10,000 Days");

        toolAlbums.forEach(System.out::println);

        printHeader(4);
        List<String> toolsAlbumsFrom2000s = new ArrayList<>();
        toolsAlbumsFrom2000s.add("Lateralus");
        toolsAlbumsFrom2000s.add("10,000 Days");
        toolAlbums.addAll(toolsAlbumsFrom2000s);

        toolAlbums.forEach(System.out::println);

        printHeader(5);
        toolAlbums.add("Lateralus");
        toolAlbums.forEach(System.out::println);



        printHeader(6);

        toolAlbums.remove("Lateralus");
        toolAlbums.forEach(System.out::println);

        printHeader(7);

        System.out.println(toolAlbums.contains("Lateralus"));
        System.out.println(toolAlbums.contains("Kill'em all"));

        printHeader(8);

        System.out.println(toolAlbums.isEmpty());
        System.out.println(toolAlbums.size());
        toolAlbums.clear();
        System.out.println(toolAlbums.isEmpty());
        System.out.println(toolAlbums.size());

        printHeader(10);
        toolAlbums.add("Undertow");
        toolAlbums.add("Aenima");
        toolAlbums.add("Lateralus");
        toolAlbums.add("10,000 Days");
        toolAlbums.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorting...");
        System.out.println();

        Collections.sort(toolAlbums);
        toolAlbums.forEach(System.out::println);
    }

    private static void hashMapExamples(){
        Map <String, String> countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("Poland", "Warsaw");
        countriesAndCapitals.put("France", "Paris");
        countriesAndCapitals.put("Germany", "Berlin");
        countriesAndCapitals.put("Russia", "Moscow");
        countriesAndCapitals.put("USA", "Washington DC");

        printHeader(1);
        System.out.println(countriesAndCapitals.get("Poland"));

        printHeader(2);
        countriesAndCapitals.put("Poland", "Cracow");
        System.out.println(countriesAndCapitals.get("Poland"));

        printHeader(3);
        countriesAndCapitals.put("Poland", "Warsaw");
        countriesAndCapitals.putIfAbsent("Poland", "Cracow");
        System.out.println(countriesAndCapitals.get("Poland"));

        printHeader(4);
        System.out.println(countriesAndCapitals.get("Italy"));
        System.out.println(countriesAndCapitals.getOrDefault("Italy", "Capitals for this country was not set up."));

        printHeader(5);

        System.out.println(countriesAndCapitals.containsKey("Italy"));
        System.out.println(countriesAndCapitals.containsValue("Rome"));
        System.out.println(countriesAndCapitals.containsKey("Poland"));
        System.out.println(countriesAndCapitals.containsValue("Poland"));
        System.out.println(countriesAndCapitals.containsValue("Warsaw"));

        printHeader(6);
        System.out.println("------------- KEYS -------------");
        countriesAndCapitals.keySet().forEach(System.out::println);
        System.out.println("------------- VALUES -------------");
        countriesAndCapitals.values().forEach(System.out::println);

        printHeader(7);
        countriesAndCapitals.replace("Poland", "Cracow");
        countriesAndCapitals.replace("Denmark", "Copenhagen");
        countriesAndCapitals.values().forEach(System.out::println);

        printHeader(8);
        Map<String, String> asianCountriesAndCapitals = new HashMap<>();
        asianCountriesAndCapitals.put("Thailand", "Bangkok");
        asianCountriesAndCapitals.put("Indonesia", "Jakarta");
        countriesAndCapitals.putAll(asianCountriesAndCapitals);
        countriesAndCapitals.keySet().forEach(System.out::println);


        printHeader(9);
        System.out.println(countriesAndCapitals.isEmpty());
        System.out.println(countriesAndCapitals.size());

        countriesAndCapitals.clear();
        System.out.println(countriesAndCapitals.isEmpty());
        System.out.println(countriesAndCapitals.size());

    }

    private static void hashSetExamples(){

        // hash set is simmilar to array list, but there can't be any duplicates.
        printHeader(1);
        Set<String> ulverAlbums = new HashSet<>();
        ulverAlbums.add("Perdition City");
        ulverAlbums.add("Blood Inside");
        ulverAlbums.add("Shadows of the Sunt");

        ulverAlbums.forEach(System.out::println);

        printHeader(2);
        ulverAlbums.add("Blood Inside");
        ulverAlbums.add("Blood Inside");
        ulverAlbums.add("Blood Inside");

        ulverAlbums.forEach(System.out::println);

    }

    private static void arrayExamples (){
        int [] intArray_1 = {4,8,2,7,3,8,2,120,1212,654654,3,0,-1,-35,-999,-36,120};
        int intArray_2 [] = new int[3];
        intArray_2[0] = 2;

        Integer [] integersObjectsArray = {2,4,221,12,21};

        System.out.println (integersObjectsArray[0]);

        System.out.println (integersObjectsArray[0]);




    }
    // intervieq execricse
    private static void findSecondMinNumberInArray(){

        int [] intArray_1 = {4,8,2,7,3,8,2,120,1212,654654,3,0,-1,-35,-999,-36,120};
        int intArray_2 [] = new int[3];
        Integer theSecondMinimumValue = null;
        Integer theFirstMinimumvalue = null;
        for (int i = 0; i < intArray_1.length ; i ++){

            if(theFirstMinimumvalue == null){
                theFirstMinimumvalue = intArray_1[i];
                theSecondMinimumValue = intArray_1[i];
            }
            else if(intArray_1[i] < theFirstMinimumvalue){
                theFirstMinimumvalue = intArray_1[i];

            } else if(intArray_1[i] < theSecondMinimumValue){
                theSecondMinimumValue = intArray_1[i];
            }
        }
        System.out.println(theFirstMinimumvalue);
        System.out.println(theSecondMinimumValue);

    }

    private static void firstSmallestNonRepeatingIntegerInArray(){

        int [] intArray_3 = {2,4,6,23,67,56,34,34,8,56,20,1,2,3,20,9,24,64,38,25,67,0,1,2,99,2,53,36,57,23,76,23,75,33,65,12,33,1,57,87,70,94,48,85,34,65,12,62,-4,9,8,-65,-65};


        Integer smallestNonDouplicate = null;
        int smallestInteger =intArray_3[0];

        for (Integer integer : intArray_3){

            if(integer <= smallestInteger){
                smallestInteger = integer;

                if (smallestNonDouplicate != null && smallestInteger == smallestNonDouplicate){
                    smallestNonDouplicate = null;
                } else{
                    smallestNonDouplicate = smallestInteger;
                }
            }

            // ale jeśli jest zduplikowany if(smallesnondouplicate == integer) to wtedy ustaw na null`a
        }

        System.out.println("To jest własnie to ");
        System.out.println(smallestNonDouplicate);
    }




    public static void main(String[] args) {

        // PRZYKŁADOWE STRUKTURY DANYCH:
        // array - czyli struktura danych, każda wartość ma przypisany liczboy klucz, Array ma stałą wartość:
        // key - 0, value - żółty
        // key - 1, value - czerwony
        // key - 2, value - biały


        // QUEUE - kolejka
        // dodawanie, usuwanie, pobieranie w takiej kolejności, w jakiej je dodaliśmy
        // jest to FIFO - first in, first out

        // STACK - stos
        //  jest to LIFO - Last In, First Out, operacje pobierania danych to zdejmowanie elementów ze stosu

        // TREE - drzewo
        // każdy element może posiadać rodziców oraz dzieci

        //NAJPOPULARNIEJSZE STRUKTURY DANYCH:
        // ArrayList - posiada więcej możliwości niż Array, rozwiązuje problem statycznych Arrayek, bo tutaj jest to struktura dynamiczna

//        arrayListExamples();
//        hashMapExamples();
//        hashSetExamples();

//        firstNonRepeatingIntegerInArray();

        firstSmallestNonRepeatingIntegerInArray();
    }
}
