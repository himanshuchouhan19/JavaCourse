public class Calender {
    
    public static void main(String arg[]) {
        System.out.println("Calender: ");
        System.out.println("Working hours: 9-17 hrs");

        for(int i=1; i<=5; i++){
            System.out.println("Day: "+i+" --> "+ days(i));
            for(int j=9; j<17; j++){
                System.out.println("Hour: "+j+"-"+(j+1));
            }
            System.out.println();
        }
        
    }

    public static String days(int a) {
        String day=null;
        switch (a) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid Day";
                break;
        }
        return day;
    }
}
