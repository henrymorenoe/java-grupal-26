package individual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadixSort {

    public static void main(String[] args) {
	// write your code here
        // define array to sort

        List<Integer> listToSort = new ArrayList<>();
        listToSort.add(32);
        listToSort.add(132);
        listToSort.add(102);
        listToSort.add(4);

        List<String> listToSortString = new ArrayList<>();

        // convert arraylist`s numbers to strings
            // go through each element.
            String stringNumber  = "";
            int mostLength = 0;
            int elementLength = 0;
            for(Integer element: listToSort){
                //System.out.println("Element: " + element)
                stringNumber = element.toString();
                listToSortString.add(stringNumber);
                // find out the largest digit amount
                elementLength = stringNumber.length();
                if(elementLength > mostLength){
                    mostLength = elementLength;
                }
            }
            List<String> listToSort_zeros = new ArrayList<>();
            // adding zeros:
            String theStringZeros = new String();
            for(String element: listToSortString){
                //System.out.println("Element: " + element);
                theStringZeros = addZeros(element, mostLength);
                listToSort_zeros.add( theStringZeros);
                System.out.println("Element: " + theStringZeros);
            }


        // create HashMap to keep 0 to 9 strings arrayLists
            List<String> L0 = new ArrayList<>();
            List<String> L1 = new ArrayList<>();
            List<String> L2 = new ArrayList<>();
            List<String> L3 = new ArrayList<>();
            List<String> L4 = new ArrayList<>();
            List<String> L5 = new ArrayList<>();
            List<String> L6 = new ArrayList<>();
            List<String> L7 = new ArrayList<>();
            List<String> L8 = new ArrayList<>();
            List<String> L9 = new ArrayList<>();

            Map<Integer, List> containerDigitList = new HashMap<Integer, List>();
            containerDigitList.put(0, L0);
            containerDigitList.put(0, L1);
            containerDigitList.put(0, L2);
            containerDigitList.put(0, L3);
            containerDigitList.put(0, L4);
            containerDigitList.put(0, L5);
            containerDigitList.put(0, L6);
            containerDigitList.put(0, L7);
            containerDigitList.put(0, L8);
            containerDigitList.put(0, L9);



        // go through each element in the arrayToSort and copy in the list accordingly to "n" digit

        // clean arrayToSorted

        // get and put each element from the digit lists into arrayToSorter


    }

    private static String addZeros(String stringNumber, int desiredSize) {
        StringBuilder theStringNumber_ = new StringBuilder(stringNumber);
        //System.out.println("antes: "+ theStringNumber_);
        Integer zerosToAdd = desiredSize - theStringNumber_.length();
        //System.out.println("cantidad de zeros"+ zerosToAdd);
        for(int i = 0; i<zerosToAdd; i++){
            theStringNumber_.insert(0,"0");
        }
        //System.out.println("despues: "+ theStringNumber_);
        return theStringNumber_.toString() ;

    }
}
