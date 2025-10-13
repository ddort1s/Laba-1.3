import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Введите ваш вариант: ");
        int var = scanner.nextInt();

        System.out.print("Введите ваш порядковый N: ");
        int N = scanner.nextInt();

        int max = Math.max(var, N);
        int min = Math.min(var, N);

        for (;;) {
            if (scanner.hasNext()) {
                number = scanner.nextInt();

                if (number >= min && number <= max) {
                    System.out.println("Correct_number");
                    break;
                } else {
                    System.out.println("Not_yet");
                }

            } else {
                System.out.println("Введите число: ");
                scanner.nextInt();
            }
        }
    }
}