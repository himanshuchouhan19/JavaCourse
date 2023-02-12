package StringTutorial;

public class StringConcept {

    public static void main(String arg[]) {

        String name = new String();

        // String Buffer -- is thread safe
        StringBuffer sb = new StringBuffer("Navin"); // give size of 16 byte
        
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Reddy");

        sb.deleteCharAt(3);
        sb.insert(5, "Java ");
        
        sb.setLength(20);
        System.out.println(sb);

        // StringBuilder -- is same as StringBuffer (Same methods) but it not thread Safe 
        
        
    }
    
}
