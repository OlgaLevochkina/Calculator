import java.util.Scanner;
// create an array [5] and display the highest value

public class MaxValueMultipleVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findTheHighestValue(sc, getValuesFromUser(sc, getCountOfElements(sc)));
        // the order is first the number of elements, then all values, then the highest value
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

    private static void findTheHighestValue(Scanner sc, int[] clientNumbers) {
        int maxNumber = clientNumbers[0];
        for (int i = 0; i < clientNumbers.length; i++) {
            maxNumber = Math.max(clientNumbers[i], maxNumber);
        }
        System.out.println("Your highest number is " + maxNumber);
    }

}
