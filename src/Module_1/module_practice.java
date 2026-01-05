package Module_1;

import java.util.Scanner;

public class module_practice {
    public static void main(String[] args) {
//       for (int i=1; i<=5; i++){
//           System.out.println(i);
//       }

//        int i=1;
//        while (i<=5){
//            System.out.println(i);
//            i++;
//        }

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible");
        }
    }
}
