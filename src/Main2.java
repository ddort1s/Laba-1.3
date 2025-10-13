import java.util.Scanner;

public class Main2 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();

        Integer minNechet = null;

        for (int i = 1; i <= n; i++) {
            System.out.print("Введите число " + i + ": ");
            int num = scanner.nextInt();

            if (num%2!=0) {
                if (minNechet == null || num < minNechet) {
                    minNechet = num;
                }
            }
        }
        if (minNechet != null) {
            System.out.print(minNechet);
        }
        else {
            System.out.print("undefined");
        }
    }
}
