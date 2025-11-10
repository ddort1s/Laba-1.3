import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        
        int minNechet = 0;
        boolean found = false;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Введите число " + i + ": ");
            int num = scanner.nextInt();
            
            if (num % 2 != 0) {
                if (!found || num < minNechet) {
                    minNechet = num;
                    found = true;
                }
            }
        }
        
        if (found) {
            System.out.println(minNechet);
        } else {
            System.out.println("undefined");
        }
    }
}
