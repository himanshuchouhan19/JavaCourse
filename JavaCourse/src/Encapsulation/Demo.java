package Encapsulation;

class Human
{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

}


public class Demo {

    public static void main(String arg[]) 
    {
        Human obj = new Human();
        //obj.age = 11;           // Giving error bcoz of private var
        //obj.name = "Naven";     // Giving error bcoz of private var

        //System.out.println(obj.name);
        obj.setAge(20);
        obj.setName("Himanshu");

        System.out.println(obj.getName() + " : "+obj.getAge());
        
    }
    
}
