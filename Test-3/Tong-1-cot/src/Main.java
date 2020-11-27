import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] arr = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Index" + i + "-" + j + ":");
                arr[i][j] = scanner.nextInt();
            }
        }
        int index;
        do {
            System.out.println("Index is:");
            index = scanner.nextInt();
        } while (index < 0 || index > 5);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i][index];
        }
        System.out.println("Sum of column" + index + ":" + sum);
    }
}
