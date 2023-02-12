package Constructors;

class Mobile{

    String brand;
    int price;
    static String name; // common to all objects

    // Static block will be called only once.
    // Used to initialize the static variables.
    //Static block is always called first before the constructor.
    static      
    {
        name = "Phone";
        System.out.println("Calling Static Block");
    }

    public Mobile(){

        brand = "";
        price = 200;

        System.out.println("Calling Constructor.");

    }

    public void show(){

        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class StaticDemo {

    public static void main(String atg[]) throws ClassNotFoundException {
        
        //Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();

        

        
    }
    
}
