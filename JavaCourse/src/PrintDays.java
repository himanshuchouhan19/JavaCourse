/**
 * this program contain concept of Conditional Functions like if-else and Switch
 */
public class PrintDays{

    public static void main(String arg[]) {

        int a = 5;

        if(a == 1){
            System.out.println("Day : "+a+" --> Monday");
        }else if(a == 2){
            System.out.println("Day : "+a+" --> Tuesday");
        }else if(a == 3){
            System.out.println("Day : "+a+" --> Wednesday");
        }else if(a == 4){
            System.out.println("Day : "+a+" --> Thursday");
        }else if(a == 5){
            System.out.println("Day : "+a+" --> Friday");
        }else if(a == 6){
            System.out.println("Day : "+a+" --> Saturday");
        }else if(a == 7){
            System.out.println("Day : "+a+" --> Sunday");
        }else {
            System.out.println("Invalid Day "+a);
        }

        switch (a) {
            case 1:
                System.out.println("Day : "+a+" --> Monday");
                break;
            case 2:
                System.out.println("Day : "+a+" --> Tuesday");
                break;
            case 3:
                System.out.println("Day : "+a+" --> Wednesday");
                break;
            case 4:
                System.out.println("Day : "+a+" --> Thursday");
                break;
            case 5:
                System.out.println("Day : "+a+" --> Friday");
                break;
            case 6:
                System.out.println("Day : "+a+" --> Saturday");
                break;
            case 7:
                System.out.println("Day : "+a+" --> Sunday");
                break;
            default:
                System.out.println("Invalid Day: "+a);
                break;
        }
        
    }
}
