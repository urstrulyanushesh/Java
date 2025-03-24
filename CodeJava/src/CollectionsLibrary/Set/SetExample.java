package CollectionsLibrary.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> name=new HashSet<>();
        name.add("Abhiyan");
        name.add("Limbu");
        name.add("BIT");
        System.out.println(name);

        System.out.println("BIT Again Added: "+name.add("BIT"));
        System.out.println(name);

        name.remove("BIT");
        System.out.println(name);
    }
}
