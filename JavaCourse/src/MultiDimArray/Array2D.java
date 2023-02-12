package MultiDimArray;

public class Array2D {

    public static void main(String arg[]) {
        int nums[][] = new int[3][4];
        int nums1[][] = new int[3][]; //Jagged Arrays

        nums1[0] = new int[5];
        nums1[1] = new int[4];
        nums1[2] = new int[3];

        //ASSIGN THE VALUE RANDOMLY
        for(int i=0;i<3; i++){

            for(int j=0; j<nums1[i].length; j++){
                nums1[i][j] = (int)(Math.random() * 10);
            }
        }
        

        for(int n[]: nums1){

            for(int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        

        /*
        for(int i=0;i<3; i++){

            for(int j=0; j<4; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }


        for(int i=0;i<3; i++){

            for(int j=0; j<4; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
         */
    }
    

    
}
