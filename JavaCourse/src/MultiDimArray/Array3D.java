package MultiDimArray;

public class Array3D {

    /**
     * @param arg
     */
    public static void main(String arg[]) {
        int nums[][][] = new int[3][4][5]; //3d dimensions

        

        //ASSIGN THE VALUE RANDOMLY
        for(int i=0;i<3; i++){

            for(int j=0,k=0; j<nums[i].length; j++){
                nums[i][j][k] = (int)(Math.random() * 10);
            }
        }
        

        // for(int n: nums){

        //     for(int m: n){
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }
        
    }

    
}
