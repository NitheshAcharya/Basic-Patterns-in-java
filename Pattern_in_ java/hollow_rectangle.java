public class hollow_rectangle {

    /*
     * hollow_rectangle
     *      *****
     *      *   *
     *      *   *
     *      *****
     */
    public static void main(String[] args) {
        int rows = 4;
        int colms = 5;
        for (int i = 1; i <= rows; i++) {    //outer loop
            for (int j= 1; j <= colms; j++) {   //inner loop
                // cell -> (i.j)
                if (i == 1||j == 1||i == rows||j == colms) {    //for the border
                    System.out.print("*");
                }else {
                    System.out.print(" ");  //in the inner space
                }
            }
            System.out.println();
        }
        
    }
}
