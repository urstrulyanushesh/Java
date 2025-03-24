package MixedCode;

public class ToString {
    String name;
    String address;
    int id;
    int classNo;

    public ToString(String name, String address, int id, int classNo) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", classNo=" + classNo +
                '}';
    }

    public static void main(String[] args) {
        ToString obj=new ToString("Abhi","Kapurdhara",12,201);
        System.out.println(obj);
    }
}
