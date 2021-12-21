package com.company;

import com.company.serie2.Algorithms_1_BinarySearch;
import com.company.serie1.Algorithms_2_SelectionSort;
import com.company.serie1.Algorithms_3_RecursiveFactorial;
import com.company.serie1.Algorithms_4_SumRecursive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Algorithms_1_BinarySearch algo1 = new Algorithms_1_BinarySearch();

        System.out.println(algo1.binarySearch(2));


        /**
         *
         * 1. Wyznacz początkowy index w środku zbioru.
         * 2. Ustaw minimalny index na pierwszy element, maksymalny na ostatni.
         * 3. Sprawdź czy value indexu jest mniejsze czy większe od poszukiwanego numberu.
         * 4. Jeśli value jest większe niż poszukiwany, to ustaw maksymalny index na value.
         * 5. Jeśli value jest mniejsze, niż poszukiwany, to ustaw minimalny index na value.
         * 6. Stwórz nowy index: minimalny index + (maksymalny index - minimalny index) / 2
         * 7. Jeśli searchedNumber jest równy value indexu, zwróć true
         * 8. Jeśli min i max index są takie same, to zwróć false.
         *
         *
         *
         *
         */
    }


}
