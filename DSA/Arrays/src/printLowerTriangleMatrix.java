public class printLowerTriangleMatrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        int row = arr.length;
        int col = arr[0].length;

//        lowerTriangle
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j <= i ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



        // Upper Triangle
        for(int i = 0 ; i < row ; i++){
            for(int j = i ; j < col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
