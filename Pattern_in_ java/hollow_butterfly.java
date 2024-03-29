public class hollow_butterfly {
    /* 
     * hollow_butterfly
     *      *      *
     *      **    **
     *      * *  * *
     *      *  **  *
     *      *  **  *
     *      * *  * *
     *      **    **
     *      *      *
    */
    public static void main(String[] args) {
        int n = 4;
        int space = 0;
        for (int i = 1; i <= n; i++) {
            // first half
            // star
            for (int j = 1;j <= i;j++) {
                if (j == 1 || j == i ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            //  spaces
            space = 2*(n - i);
            for (int j = 1; j <= space;j++) {
                System.out.print(" ");
            }
            // 2nd part star
            for (int j = 1;j <= i;j++) {
                if (j == 1 || j == i ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // second half
            // star
            for (int j = 1;j <= i;j++) {
                if (j == 1 || j == i ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            // spaces
            space = 2*(n - i);
            for (int j = 1; j <= space;j++) {
                System.out.print(" ");
            }
            // 2nd part star
            for (int j = 1;j <= i;j++) {
                if (j == 1 || j == i ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
