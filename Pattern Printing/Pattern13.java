public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <=n; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print("-");
            }
            for (int col = 1; col <=(row*2)-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
