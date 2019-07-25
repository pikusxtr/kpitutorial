package kpitutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kpiekos on 7/14/2017.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int arrSize = 10;
        int[] myIntArr1;
        myIntArr1 = new int[arrSize];
        System.out.println(myIntArr1.hashCode());
        myIntArr1[0] = 100;
        myIntArr1[1] = 97;
        int arrLength = myIntArr1.length;
        System.out.println("arr lentg" + arrLength);
        String[] strArr = {"bmw", "audi", "porsche"};
        List<String> strList = new ArrayList<String>();
        strList = Arrays.asList(strArr);
        displayList(strList);
        System.out.println("???contains=" + strList.contains("bm"));
        System.out.println("???empty=" + strList.isEmpty());
        strList.set(0, "newFirstElem");

        displayList(strList);
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(i + " elem in loop=" + strList.get(i));
        }
    }

    public static void displayList(List<String> inputList) {
        String allList = "";
        for (String inputListElem : inputList
        ) {
            allList = allList + inputListElem + "---";

        }
        System.out.println("List elems=" + allList);
    }
}

