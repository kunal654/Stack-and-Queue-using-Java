public class Pattern {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { 
                System.out.print(i);
            }
            for (int k = 1; k <= 6-i; k++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}