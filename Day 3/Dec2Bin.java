import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        try {
            int decimalNumber = Integer.parseInt(scanner.nextLine());
            if (decimalNumber == 0) {
                System.out.println("Invalid input");
            } else {
                String binaryString = Integer.toBinaryString(decimalNumber);
                int countOnes = 0;
                for (char c : binaryString.toCharArray()) {
                    if (c == '1') {
                        countOnes++;
                    }
                }
                System.out.println("Binary: " + binaryString);
                System.out.println("Count of 1s: " + countOnes);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
