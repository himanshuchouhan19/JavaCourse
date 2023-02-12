package StaticKeyword;

class Mobile{

    String brand;
    int price;
    static String name; // common to all objects

    public void show(){

        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class StaticDemo {

    public static void main(String atg[]) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1400;
        obj2.name = "SmartPhone";

        Mobile obj3 = new Mobile();
        obj3.brand = "OnePlus";
        obj3.price = 1700;
        obj3.name = "SmartPhone";

        obj1.show();
        obj2.show();
        obj3.show();


        Mobile obj4 = new Mobile();
        obj4.brand = "Xiomi";
        obj4.price = 1200;
        obj4.name = "SmartPhone"; //Static Variable is giving warning because it is called with help of object

        // To check static keyword behviour 
        obj1.name = "Phone";    // It will affect all the objects with "name" variable


        // Static variable should be Called with Class Name
        Mobile.name = "Static Phone";
        obj1.show();
        obj2.show();
        obj3.show();
        obj4.show();

    }
    
}
