package Pattern;

public class Rombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            
            for (int k = 0; k < i; k++) System.out.print(" ");
            
            for (int j = 0; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
