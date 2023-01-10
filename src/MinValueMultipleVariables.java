import java.util.Scanner;

public class MinValueMultipleVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findTheLowestValue(getValuesFromUser(sc, getCountOfElements(sc)));
        // the order is first the number of elements, then all values, then the lowest value
    }

    // no difference in the order of methods below
    private static int getCountOfElements(Scanner sc) {
        System.out.println("Enter your number of elements");

        return sc.nextInt();
    }

    private static int[] getValuesFromUser(Scanner sc, int size) {
        int[] clientNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your number");
            clientNumbers[i] = sc.nextInt();
        }

        return clientNumbers;
    }

    private static void findTheLowestValue(int[] clientNumbers) {
        int minNumber = clientNumbers[0];
        for (int clientNumber : clientNumbers) {
            minNumber = Math.min(clientNumber, minNumber);
        }
        System.out.println("Your lowest number is " + minNumber);
    }

}

