package CollectionsLibrary.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,5,1,8,3,2);
        Collections.sort(list);
        System.out.println("Sorted List:"+list);

        int max=Collections.max(list);
        int min=Collections.min(list);
        System.out.println("Max:"+max+", Min:"+min);

        Collections.reverse(list);
        System.out.println("Reverse List:"+list);

        Collections.sort(list);
        int index=Collections.binarySearch(list,3);
        System.out.println("Index of 3 :"+index);

        List<Integer> unmodifiableList=Collections.unmodifiableList(list);
        System.out.println("unmodifiableList:"+unmodifiableList);
       // unmodifiableList.add(6);
       // System.out.println(unmodifiableList);




    }
}
