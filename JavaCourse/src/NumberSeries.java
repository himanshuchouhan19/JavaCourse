/**
 * this program contain concept of Loops and Method combine
 */

public class NumberSeries {

    /**
     * @param arg
     */
    public static void main(String arg[]) {

        int a=1;

        System.out.println("Calling For Loop:");
        forLoop(a);

        System.out.println();
        System.out.println("Calling While Loop:");
        whileLoop(a);

        System.out.println();
        System.out.println("Calling Do-While Loop:");
        doWhileLoop(a);

        
    }
    
    //add static Keyword to the below method in main class otherwise throws an error "Cannot make a static reference to the non-static method forLoop(int) from the type NumberSeries"
    public static void forLoop(int a) {

        System.out.print("Number Series: ");
        for(; a<=100; a++){
            System.out.print(" "+a+ " ");
        }
        
    }

    public static void whileLoop(int a) {

        System.out.print("Number Series: ");
        while(a<=100){
            System.out.print(" "+a+ " ");
            a++;
        }
        
    }

    private static void doWhileLoop(int a) {

        System.out.print("Number Series: ");
        do{
            System.out.print(" "+a+ " ");
            a++;
        }while(a<=100);

    }
}
