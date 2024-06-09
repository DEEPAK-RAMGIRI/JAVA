import java.util.*;

public class MatricesProblems {
    public static void searchKey(int key, int rows, int col) {
        // Function to search number in the matrix
        //
        int[][] a = new int[rows][col];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < col; j++)
                a[i][j] = sc.nextInt();
        sc.close();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < col; j++)
                if (a[i][j] == key) {
                    System.out.println("found at at index a[" + i + "][" + j + "]");
                    return;
                }
        System.out.println("number not found");

    }

    /**
     * 
     */
    public static void spiralMatrix() {
        // Function to print number in matrix like spiral form
        // 1 5 7 9 10 116 10 12 13 20 219 25 29 30 32 41 15 15 59 63 68 70 40 70 79 81
        // 95 105
        // int a[][] = new int[5][6]; no need of these if you declaring directly
        // rows =5 columns=6
        int a[][] = { { 1, 5, 7, 9, 10, 11 }, { 6, 10, 12, 13, 20, 21 }, { 9, 25, 29, 30, 32, 41 },
                { 15, 15, 59, 63, 68, 70 }, { 40, 70, 79,
                        81, 95, 105 } };
        int rowstart = 0;
        int colstart = 0;
        int rowend = 4;
        int colend = 5;
        while (rowstart <= rowend && colstart <= colend) {
            for (int i = colstart; i <= colend; i++)
                System.out.print(a[rowstart][i] + " ");
            rowstart++;
            for (int i = rowstart; i <= rowend; i++)
                System.out.print(a[i][colend] + " ");
            colend--;
            for (int i = colend; i >= colstart; i--)// small mistake 1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9 6 10
                                                    // 12 13 20 32 68 63 59 15 25 29 30 but atlast it gving extra 29
                System.out.print(a[rowend][i] + " ");
            rowend--;
            for (int i = rowend; i >= rowstart; i--)
                System.out.print(a[i][colstart] + " ");
            colstart++;
        }
        System.out.println();
    }

    public static void transposeMatrix() {
        // rows = 5 columns =6
        // to do transpose you have to check weather the matrix is mxm or mxn, if it is
        // mxm just a[j][i] if mxn then create a new int array then save init
        int a[][] = { { 1, 5, 7, 9, 10, 11 }, { 6, 10, 12, 13, 20, 21 }, { 9, 25, 29, 30, 32, 41 },
                { 15, 15, 59, 63, 68, 70 }, { 40, 70, 79,
                        81, 95, 105 } };
        int b[][] = new int[6][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 6; j++)
                b[j][i] = a[i][j];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        searchKey(10, 2, 2);
        System.out.println();
        spiralMatrix();
        System.out.println();
        transposeMatrix();
    }
}
