package individual;

import java.util.ArrayList;
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
            for(Integer element: listToSort){
                //System.out.println("Element: " + element)
                stringNumber = element.toString();
                stringNumber = addZeros(stringNumber);
                listToSortString.add(stringNumber);
            }



        // create list to keep 0 to 9 strings

        // go through each element in the arrayToSort and copy in the list accordingly to "n" digit

        // clean arrayToSorted

        // get and put each element from the digit lists into arrayToSorter




    }

    private static String addZeros(String stringNumber, int desiredSize) {
        String theStringNumber_ = new String(stringNumber);
        Integer zerosToAdd = desiredSize - theStringNumber_.length();
        for(int i = 0; i<zerosToAdd; i++){
            theStringNumber_
        }

    }
}
