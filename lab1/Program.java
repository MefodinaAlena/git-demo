import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = in.nextInt();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        System.out.println("Четные числа: " + evenNumbers);
        System.out.println("Нечетные числа: " + oddNumbers);
        in.close();
    }
}