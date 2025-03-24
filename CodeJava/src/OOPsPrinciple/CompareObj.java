package OOPsPrinciple;

import java.util.Objects;

public class CompareObj {
    String Name;
    int roll;

    public CompareObj(String name, int roll) {
        this.Name = name;
        this.roll = roll;
    }



    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof CompareObj realValue)){
            return false;
        }
        return realValue.Name.equals(Name) && realValue.roll == roll;

    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, roll);
    }

    public static void main(String[] args) {
        CompareObj obj1=new CompareObj("Abhi",12);
        CompareObj obj2=new CompareObj("Abhi",12);

        if(obj1.equals(obj2)){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}