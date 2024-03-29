

/**
 * solid_rectangle
 *      *****
 *      *****
 *      *****
 *      *****
 */
public class solid_rectangle {

    public static void main(String[] args) {
        int rows = 4;
        int colms = 5;
        // Inner loop
        for (int i = 0; i < rows; i++) {
            for(int j = 0;j < colms; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}