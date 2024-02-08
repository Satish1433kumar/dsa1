// 1) Add Two Matrices --------------
// 2) Multiply Two Matrices----
// 3) Transpose matrix ------------
// 4) Java Program to subtract the two matrices ----------------
// 5) Java Program to determine whether a given matrix is an identity matrix
// 6) Java Program to determine whether a given matrix is a sparse matrix
// 7) Java Program to determine whether two matrices are equal ---------
// 8) Java Program to display the lower triangular matrix -------
// 9) Java Program to display the upper triangular matrix ------------
// 10) Java Program to find the sum of each row and each column of a matrix--------
// 11)  boundary traversal of a matrix--------
// 12) Spiral Matrix------
// 13) Snake Pattern of a matrix ------- 
//`14) 90 degree rotation of a matrix clockwise ----
// 15) 90 degree rotation of a matrix anticlockwise -----
// 16)  Diagonal sum of a matrix   


public class Matrices {
    
    
    // 1) Add Two Matrices 
    public static int[][] addMatrix(int a[][], int b[][]) {
        int rows = a.length;
        int columns = a[0].length; 
    
        int c[][] = new int[rows][columns];
    
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();  
        }
    
        return c;
    }



// 2)Multiply Two Matrices
public static int[][] multiplyMatrices(int a[][], int b[][]) {
    int rowsA = a.length;
    int colsA = a[0].length;
    int colsB = b[0].length;

    int c[][] = new int[rowsA][colsB];

    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
            for (int k = 0; k < colsA; k++) {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    
    System.out.println(" Matrix after multiplication:");
    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
            System.out.print(c[i][j] + " ");
        }
        System.out.println();
    }

    return c;
}



// 3) Java Program to find the transpose of a given matrix 
public static void transposeMatrix(int a[][]) {
    for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
            int temp = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = temp;
        }
    }

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
}


// 4) Java Program to subtract the two matrices

public static int[][] subtractMatrix(int a[][], int b[][]) {
    int rows = a.length;
    int columns = a[0].length; 

    int c[][] = new int[rows][columns];

    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            c[i][j] = a[i][j] - b[i][j];
        }
    }

    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(c[i][j] + " ");
        }
        System.out.println();  
    }

    return c;
}


// 7) Java Program to determine whether two matrices are equal 
public static void twoMatricesEqual(int a[][], int b[][]) {
    if (a.length == b.length && a[0].length == b[0].length) {
        System.out.println("Size of Two matrices are equal");
        boolean areEqual = true;  

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    areEqual = false;
                    break;  
                }
            }
        }

        if (areEqual) {
            System.out.println("Elements in the two matrices are also equal");
        } else {
            System.out.println("Elements in the matrices are not equal");
        }
    } else {
        System.out.println("The Two Matrices are not equal");
    }
}

// 8) Java Program to display the lower triangular matrix
public static void printLowerTriangleMatrix(int a[][]) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (i >= j) {
                System.out.print(a[i][j] + " ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();  
    }
}

// 9) Java Program to display the upper triangular matrix
public static void printUpperTriangleMatrix(int a[][]) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (i <= j) {
                System.out.print(a[i][j] + " ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();  
    }
}

// 10) Java Program to find the sum of each row and each column of a matrix
public static void getRowAndColumnSums(int a[][]){
    for (int i = 0; i < a.length; i++) {
        int rowSum = 0;
        int colSum = 0;
        for (int j = 0; j < a[i].length; j++) {
            rowSum += a[i][j];
            colSum += a[j][i];
        }
        System.out.println("Sum of elements in Row " + (i + 1) + ": " + rowSum);
        System.out.println("Sum of elements in Column " + (i + 1) + ": " + colSum);
    }
}

// 11)  boundary traversal of a matrix
    public static void boundaryTraversal(int[][] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[0][i]+ " ");
        }
        System.out.println();
        for(int i =1;i<a.length;i++){
            System.out.print(a[i][a[i].length-1]+" ");
        }
        System.out.println();
        for(int i = a[0].length-2;i>=0;i--){
            System.out.print(a[a.length-1][i]+" ");
        }
        System.out.println();
        for(int i=a.length-2;i>=1;i--){
            System.out.print(a[i][0]+" ");
        }
    }


    // 12) Spiral Matrix
     public static void spiralMatrix(int[][] a){
        int top = 0;
        int left =0;
        int right = a[0].length-1;
        int bottom = a.length-1;

        while(left<=right && top<=bottom){
            for(int i = left;i<=right;i++){
                System.out.print(a[top][i] + " ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            for(int i = right;i>=left;i--){
                System.out.print(a[bottom][i]+ " ");
            }
            bottom--;
            for(int i = bottom;i>=top;i--){
                System.out.print(a[i][left]+ " ");
            }
            left++;
        }
     }


     // 13) Snake Pattern of a matrix
     public static void snakePattern(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for (int j = a[i].length - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }

    //`14) 90 degree rotation of a matrix clockwise
    public static void clockWiseRotationOfMatrx(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        
        for(int i= 0 ;i<a.length;i++){
            int start=0;
            int end = a.length-1;
            while(start<end){
               int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j] + " ");
            }
            System.out.println();
         }
    }


    //15) 90 degree rotation of a matrix anticlockwise 
    public static void antiClockwiseRotationOfMatrix(int[][] a) {
         for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            int start = 0;
            int end = a.length - 1;
            while (start < end) {
                int temp = a[start][i];
                a[start][i] = a[end][i];
                a[end][i] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 16)  Diagonal sum of a matrix  
    public static int diagonalSumOfMatrix(int[][] a){
        int mainDiagonalSum = 0;
         int antiDiagonalSum = 0;
         int middle=0;
        for (int i = 0; i < a.length; i++) {
             mainDiagonalSum += a[i][i];
             antiDiagonalSum += a[i][a.length - 1 - i];
             if (a.length % 2 != 0 && i == a.length / 2) {
                middle = a[i][i];
            }
       }
       int sum = mainDiagonalSum + antiDiagonalSum - middle;
       return sum;
    }
    
public static void main(String args[]){
    // int[][] a = {
    //       {1, 2, 3, 4, 5},
    //       {6, 7, 8, 9, 10},
    //       {11, 12, 13, 14, 15},
    //       {16, 17, 18, 19, 20},
    //       {21, 22, 23, 24, 25}
    //   };
    // int[][] b = {
    //     {1, 2, 3, 4, 5},
    //     {6, 7, 8, 9, 10},
    //     {11, 12, 13, 14, 15},
    //     {16, 17, 18, 19, 20},
    //     {21, 22, 23, 24, 25}
    // };
       //3) transposeMatrix(a);
       // 1)addMatrix(a, b);
       //4)subtractMatrix(a,b);
        //7)twoMatricesEqual(a,b);
     //8)printLowerTriangleMatrix(a);
        //9)printUpperTriangleMatrix(a);
        //10)getRowAndColumnSums(a);
        //2)multiplyMatrices(a, b);
        //11)boundaryTraversal(a);
        //12)spiralMatrix(a);
        //13)snakePattern(a);
        //14)clockWiseRotationOfMatrx(a);
        //15)antiClockwiseRotationOfMatrix(a);
        // 16)int sum = diagonalSumOfMatrix(a);
        // System.out.println(sum);

}
}