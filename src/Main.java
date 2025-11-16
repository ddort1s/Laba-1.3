import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final int N = 100;

        int min1 = -15*N;
        int max1 = -11*N;

        int min2 = 11*N;
        int max2 = 15*N;

        while (true) {
            int number = scanner.nextInt();

            if ((number>=min1 && number <= max1) || (number>=min2&&number<=max2)){
                System.out.println("Correct_number_"+number);
                break;
            } else {
                System.out.println("Not_yet");
            }
        }
    }
}
