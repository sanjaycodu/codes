public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <=(n*2)-1; row++) {
            int row1 =(row<n) ? row:(n*2)-row;
            for (int col = 1; col <=row1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
