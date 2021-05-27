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
        listToSort.add(456);
        listToSort.add(1674);
        listToSort.add(5302);
        listToSort.add(10000);

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

            Map<String, List> containerDigitList = new HashMap<String, List>();
            containerDigitList.put("0", L0);
            containerDigitList.put("1", L1);
            containerDigitList.put("2", L2);
            containerDigitList.put("3", L3);
            containerDigitList.put("4", L4);
            containerDigitList.put("5", L5);
            containerDigitList.put("6", L6);
            containerDigitList.put("7", L7);
            containerDigitList.put("8", L8);
            containerDigitList.put("9", L9);


        // go through each element in the arrayToSort and copy in the list accordingly to "n" digit
        List<String> pivotListSortedSteps = new ArrayList<>();

        int digitPosition = 0;
        Map<String, List> cleanedMapLists = new HashMap<>(containerDigitList);
        for(int i = mostLength-1; i>=0; i--) {
            // clean Map lists
            cleanedMapLists = cleanMapLists(cleanedMapLists);
            pivotListSortedSteps = arrangeListMaps(listToSort_zeros, containerDigitList, i);
        }

        System.out.println(" ");
        System.out.println("Elementos ordenados: ");
        System.out.println();
        for(String elem: pivotListSortedSteps){
            System.out.println("elem: "+elem);
        }


        // clean arrayToSorted

        // get and put each element from the digit lists into arrayToSorter


    }


    private static Map<String, List> cleanMapLists(Map<String, List> cleanedMapLists) {
        // by reference
        // function to removeAll from each list
        String[] digits_ = {"0","1", "2", "3", "4", "5", "6", "7","8", "9"};
        int arrayLength = 10;
        for(int i = 0 ; i<arrayLength; i++){
            cleanedMapLists.get(digits_[i]).clear();
        }
        return cleanedMapLists;
    }


    private static List<String> arrangeListMaps(List<String> listToSort_zeros, Map<String, List> containerDigitList, int digitPosition) {
        List<String> originalList = new ArrayList<>(listToSort_zeros);
        List<String> listSorted = new ArrayList<>();
        String digit_ = "";

        System.out.println(" ");
        System.out.println("Elementos NO ord en LISTsORTED: ");
        System.out.println();
        for(String elem: listToSort_zeros){
            System.out.println("elem: "+elem);
        }
        System.out.println();

        for (String element : listToSort_zeros) {
                digit_ = element.substring(digitPosition,digitPosition+1) ;
            System.out.println("digit: " + digit_);
                containerDigitList.get(digit_).add(element);
            }

        listToSort_zeros.clear();

        String[] digits_ = {"0","1", "2", "3", "4", "5", "6", "7","8", "9"};
        int arrayLength = 10;
        for(int i = 0 ; i<arrayLength; i++){
            for(int j=0; j< containerDigitList.get(digits_[i]).size() ; j++) {
                //listSorted.add((String) containerDigitList.get(digits_[i]).get(j));
                listToSort_zeros.add((String) containerDigitList.get(digits_[i]).get(j));
            }
        }

        System.out.println(" ");
        System.out.println("Elementos ordenados en LISTsORTED: ");
        System.out.println();
        for(String elem: listToSort_zeros){
            System.out.println("elem: "+elem);
        }
        originalList.clear();
        originalList = listSorted;
        return listToSort_zeros; //return listSorted;
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
