public class Main {


    static int n = 90;

    public static void main(String [] args){

        printTriangle(transformTriangle(createTriangle()));

    }

    public static int [][] createTriangle(){


        int [][] result = new int [n][];

        for (int i = 0; i< n; i++){

            result[i] = new int [i+1];

            if (i == 0) {
                result[0][0] = 1;
                continue;
            }

            result[i][0] = 1;
            result[i][i] = 1;

            for (int j = 0; j < i-1; j++){

                result[i][j+1] = result[i-1][j]+ result[i-1][j+1];

            }

        }

        return result;

    }

    public static int[][] transformTriangle(int [][] triangle){

        for (int i = 0; i< triangle.length; i++){
            for (int j = 0; j< triangle[i].length; j++){
                triangle[i][j] = triangle[i][j] % 2 == 0? 0: 1;
            }
        }

        return triangle;

    }

    public static void printTriangle(int [][] triangle){

        int length = triangle.length;

        for (int i = 0; i< triangle.length; i++){

            for(int k = 0; k < (length - i); k++ ){
                System.out.print(" ");
            }
            for (int j = 0; j< triangle[i].length; j++){

                System.out.print( triangle[i][j] == 0? "-"  + " ": "1" + " ");
            }
            System.out.println();
        }
    }

}
