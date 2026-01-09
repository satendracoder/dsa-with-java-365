package january;

public class day_007_java_dsa {
    public static void main(String[] args) {

        int number = 12345;
        int count = 0;

        // Edge case: if number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Handle negative numbers
            number = Math.abs(number);

            while (number > 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("Total Digits: " + count);
    }
}
