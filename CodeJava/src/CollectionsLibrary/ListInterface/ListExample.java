package CollectionsLibrary.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Bhuwan");
        list.add("KC");
        list.add("Subash");
        list.add("Bam");
        list.add(2,"Goal");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.set(3,"Patel");
        System.out.println(list);

        String a=list.get(1);
        System.out.println(a);

        int size=list.size();
        System.out.println(size);

        if(list.contains("Goal")){
            System.out.println("Position="+list.indexOf("Goal"));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }
}
