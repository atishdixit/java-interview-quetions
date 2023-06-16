package core.ds;

import java.util.LinkedList;
import java.util.List;

public class CollectionRelated {

    public static void main(String sa[]){
        List<String> list = new LinkedList<>();
        list.add("AAA");
        list.add("BBA");
        list.add("CCA");
        list.add("EEA");
        list.add("EEA");
        middleElement(list);

    }

    private static void middleElement(List<String> list){
        int end = list.size()-1;
        int start = 0;
        while(start<=end){
            start++;
            end--;
        }
        System.out.println(end);
        System.out.println(start);
        System.out.println(list.get(start));
    }
}
