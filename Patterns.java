public class Patterns {
    // Always check for number of rows and columns
    public static void Pattern01(int r, int c) {
        // rows=4
        // columns=5
        // solid rectangle/square
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= c; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void Pattern02(int r, int c) {
        // rows=4
        // columns=5
        // hollow rectangle/square
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= c; col++) {
                if (rows == 1 || col == 1 || rows == r || col == c)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void Pattern03(int r, int c) {
        // left stairs
        // *
        // * *
        // * * *
        // * * * *
        // rows=4 & columns=4
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void Pattern04(int r, int c) {
        // * * * *
        // * * *
        // * *
        // *
        // rows=4 & columns=4
        // left reverse stairs
        for (int rows = 1; rows <= r; rows++) {
            for (int col = c; col >= rows; col--)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void Pattern05(int r, int c) {
        // Right stairs
        // rows=4 & columns=4
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= (c - rows); col++)
                System.out.print("  ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }

    }

    public static void Pattern06(int r, int c) {
        // 1 rows=5
        // 1 2 columns=5
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print(col + " ");
            System.out.println();
        }

    }

    public static void Pattern07(int r, int c) {
        // 1 2 3 4 5 rows=5
        // 1 2 3 4 columns=5
        // 1 2 3
        // 1 2
        // 1
        for (int rows = r; rows >= 1; rows--) {
            for (int col = 1; col <= rows; col++)
                System.out.print(col + " ");
            System.out.println();
        }
    }

    public static void Pattern08(int r, int c) {
        // 1 rows=5
        // 2 3 columns=5
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        int k = 0;
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= rows; col++) {
                k++;
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }

    public static void Pattern09(int r, int c) {
        // 1 rows=5
        // 0 1 columns=5
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= rows; col++) {
                if ((rows + col) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

    }

    public static void Pattern10(int r, int c) {
        // Solid rhombus
        // rows=5 & columns=5
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= c - rows; col++)
                System.out.print("  ");
            for (int col = 1; col <= c; col++)
                System.out.print("* ");
            System.out.println();
        }

    }

    public static void Pattern11(int r, int c) {
        // NUMBER PYRAMID
        // rows=5 & columns=5
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= c - rows; col++)
                System.out.print("  ");
            for (int col = 1; col <= rows; col++)
                System.out.print(" " + rows + "  ");
            System.out.println();
        }

    }

    public static void Pattern12(int r, int c) {
        // NUMBER PYRAMID
        // rows=5 & columns=9
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= r - rows; col++)
                System.out.print("  ");
            for (int col = rows; col >= 1; col--)
                System.out.print(" " + col);
            for (int col = 2; col <= rows; col++)
                System.out.print(" " + col);
            System.out.println();

        }

    }

    public static void Pattern13(int r, int c) {
        // Butterfly Pattern with stars
        // rows=9 & columns=9
        // first half
        for (int rows = 1; rows <= r / 2; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("*");
            for (int col = 1; col <= 2 * ((r / 2) - rows); col++)
                System.out.print(" ");
            for (int col = 1; col <= rows; col++)
                System.out.print("*");
            System.out.println();
        }
        // secound half
        for (int rows = r / 2; rows >= 1; rows--) {
            for (int col = 1; col <= rows; col++)
                System.out.print("*");
            for (int col = 1; col <= 2 * ((r / 2) - rows); col++)
                System.out.print(" ");
            for (int col = 1; col <= rows; col++)
                System.out.print("*");
            System.out.println();
        }

    }

    public static void Pattern14(int r, int c) {
        // Diamond pattern with stars
        // rows=8 & columns=8
        // First half of diamond means triangle
        for (int rows = 1; rows <= r / 2; rows++) {
            for (int col = 1; col <= (r / 2) - rows; col++)
                System.out.print("  ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            for (int col = 2; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }
        // Secound half of diamond means reverse triangle
        for (int rows = r / 2; rows >= 1; rows--) {
            for (int col = 1; col <= (r / 2) - rows; col++)
                System.out.print("  ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            for (int col = 2; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }

    }

    public static void Pattern15(int r) {
        // Hollow Butterfly Pattern with stars
        // rows=12 & columns=1
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= r; col++) {
                if (col == rows || col == 1 || rows + col == r + 1 || col == r) {
                    if ((rows == 1 || rows == r) && col == 1)
                        System.out.print(" *  ");
                    else
                        System.out.print(" *");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern16(int r) {
        // NUmber pyramid with normal numbers
        // rows=5 & columns=5
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= r - rows; col++)
                System.out.print(" ");
            for (int col = 1; col <= rows; col++)
                System.out.print(col + " ");
            System.out.println();
        }
    }

    public static void Pattern17(int r) {
        // NUmber staris reversed version
        // rows=4 & columns=4
        // 1111
        // 222
        // 33
        // 4
        // Be Careful Here
        for (int rows = 1; rows <= r; rows++) {
            for (int col = r; col >= rows; col--)
                System.out.print(rows + " ");
            System.out.println();
        }
    }

    public static void Pattern18(int r) {
        // Pascal Traiangle
        // rows=5 && columns=5
        // rember it impotant
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= r - rows; col++)
                System.out.print(" ");
            int a = 1;
            for (int col = 1; col <= rows; col++) {
                System.out.print(a + " ");
                a = a * (rows - col) / col;// important formula for pascal
            }
            System.out.println();
        }
    }

    public static void Pattern19(int r) {
        // Hollow Rhombus
        // rows=5 & columns=5
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= r - rows; col++)
                System.out.print(" ");
            for (int col = 1; col <= r; col++) {
                if (col == 1 || rows == 1 || col == r || rows == r)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Pattern 01");
        Pattern01(4, 5);
        System.out.println();
        System.out.println("Pattern 02");
        Pattern02(4, 5);
        System.out.println();
        System.out.println("Pattern 03");
        Pattern03(4, 4);
        System.out.println();
        System.out.println("Pattern 04");
        Pattern04(4, 4);
        System.out.println();
        System.out.println("Pattern 05");
        Pattern05(4, 4);
        System.out.println();
        System.out.println("Pattern 06");
        Pattern06(5, 5);
        System.out.println();
        System.out.println("Pattern 07");
        Pattern07(5, 5);
        System.out.println();
        System.out.println("Pattern 08");
        Pattern08(5, 5);
        System.out.println();
        System.out.println("Pattern 09");
        Pattern09(5, 5);
        System.out.println();
        System.out.println("Pattern 10");
        Pattern10(5, 5);
        System.out.println();
        System.out.println("Pattern 11");
        Pattern11(5, 5);
        System.out.println();
        System.out.println("Pattern 12");
        Pattern12(5, 9);
        System.out.println();
        System.out.println("Pattern 13");
        Pattern13(9, 9);
        System.out.println();
        System.out.println("Pattern 14");
        Pattern14(8, 7);
        System.out.println();
        System.out.println("Pattern 15");
        Pattern15(12);
        System.out.println();
        System.out.println("Pattern 16");
        Pattern16(5);
        System.out.println();
        System.out.println("Pattern 17");
        Pattern17(4);
        System.out.println();
        System.out.println("Pattern 18");
        Pattern18(5);
        System.out.println();
        System.out.println("Pattern 19");
        Pattern19(5);
        System.out.println();
    }
}
