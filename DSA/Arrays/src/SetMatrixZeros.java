public class SetMatrixZeros {
    public static void main(String[] args){
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        boolean firstRow = false;
        boolean firstColumn = false;
        int rows = arr.length;
        int column = arr[0].length;

        for(int i = 0 ; i < column ; i++){
            if(arr[0][i] == 0){
                firstRow = true;
                break;
            }
        }

        for(int j = 0 ; j < rows ; j++){
            if(arr[j][0] == 0){
                firstColumn = true;
                break;
            }
        }

        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < column ; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }


        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < column ; j++){
                if(arr[0][j] == 0 || arr[i][0] == 0){
                    arr[i][j] = 0;
                }
            }
        }


        if(firstRow) {
            for (int i = 0; i < column; i++) {
                arr[0][i] = 0;
            }
        }

        if(firstColumn){
            for(int j = 0 ; j < rows ; j++){
                arr[j][0] = 0;
            }
        }

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
