package MixedCode;

interface Client{
    void display();
}
public class InterfaceExample implements Client {
    @Override
    public void display() {
        System.out.println("Interface is Displaying...");
    }

    public static void main(String[] args) {
        Client obj=new InterfaceExample();
        obj.display();
    }
}
