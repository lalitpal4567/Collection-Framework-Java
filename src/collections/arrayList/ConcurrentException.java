package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcurrentException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 7, 3, 1));

        for(Integer num : list){
            list.remove(num);       // ConcurrentModificationException
        }
    }
}
