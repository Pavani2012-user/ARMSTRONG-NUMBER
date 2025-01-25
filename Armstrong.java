import java.util.Scanner;
public class Armstrong {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        printArmstrongNumbers(lower, upper);
    }
    public static void printArmstrongNumbers(int lower, int upper) {
        for (int num = lower; num <= upper; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}


