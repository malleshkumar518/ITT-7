import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car no:");
        String input = scanner.nextLine();
        try {
            int carNumber = Integer.parseInt(input);
            if (carNumber < 1000 || carNumber > 9999) {
                System.out.println(input + " is not a valid car number");
            } else {
                int sum = 0;
                int temp = carNumber;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                    System.out.println("Lucky Number");
                } else {
                    System.out.println("Sorry its not my lucky number");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(input + " is not a valid car number");
        }
        scanner.close();
    }
}
