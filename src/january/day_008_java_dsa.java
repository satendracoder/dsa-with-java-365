package january;

public class day_008_java_dsa {
    public static void main(String[] args) {
        int number = 1234;
        int reverse = 0;

        //Handle negative number
        int temp = Math.abs(number);
        while (temp>0){
            int digit = temp % 10;
            reverse = reverse *10 +digit;
            temp = temp /10;

        }

        // Agar number negative tha
        if(number<0){
            reverse =  -reverse;
        }
        System.out.println("Reversed Number: " + reverse);
    }
}
