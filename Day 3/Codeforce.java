import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                solveTestCase(scanner);
            }
        }
        scanner.close();
    }
    private static void solveTestCase(Scanner scanner) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (canBeSortedWithOneSwap(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    private static boolean canBeSortedWithOneSwap(int[] arr) {
        int n = arr.length;
        java.util.List<Integer> mismatchIndices = new java.util.ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                mismatchIndices.add(i);
            }
        }
        if (mismatchIndices.isEmpty()) {
            return true;
        }
        if (mismatchIndices.size() > 2) {
            return false;
        }
        int[] sortedArr = arr.clone();
        java.util.Arrays.sort(sortedArr);
        java.util.List<Integer> diffIndices = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != sortedArr[i]) {
                diffIndices.add(i);
            }
        }
        if (diffIndices.isEmpty()) {
            return true;
        }
        if (diffIndices.size() == 2) {
            int i = diffIndices.get(0);
            int j = diffIndices.get(1);
            if (arr[i] == sortedArr[j] && arr[j] == sortedArr[i]) {
                return true;
            }
        }
        return false;
    }
}
