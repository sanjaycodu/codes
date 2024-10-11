public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <=n; row++) {
            for (int col = row; col >=1; col--) {
                System.out.print(col%2+" ");
            }
            System.out.println();
        }
    }
}
