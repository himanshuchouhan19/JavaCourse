package Array;

public class StudentMain {

    public static void main(String arg[]) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name  = "Himanshu";
        s1.marks = 95.00;

        Student s2 = new Student();
        s2.rollNo = 1;
        s2.name  = "Prince";
        s2.marks = 99.00;

        Student s3 = new Student();
        s3.rollNo = 1;
        s3.name  = "Tanuja";
        s3.marks = 94.00;

        Student studs[] = new Student[3]; // Creating an array ehich hold Student References
        studs[0] = s1;
        studs[1] = s2;
        studs[2] = s3;
        
        // for(int i=0; i<studs.length; i++){

        //     System.out.println(studs[i].name+" : "+studs[i].marks);

        // }
            // Enhanced For loop
        for(Student s: studs){
            System.out.println(s.name+" : "+s.marks);
            
        }
        
    }
    
}
