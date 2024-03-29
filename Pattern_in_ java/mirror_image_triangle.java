public class mirror_image_triangle {
    /*
     *  mirror_image_triangle
     *      1 2 3 4
     *       2 3 4
     *        3 4
     *         4
     *        3 4
     *       2 3 4
     *      1 2 3 4
     *      
     */
    public static void main(String[] args) {
        int n = 4;
        int i,j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
