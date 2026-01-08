package Module_2;

//Practice-1: Class & Object
public class module_test_001 {
    public static void main(String[] args) {
    Student_Practice_1 s1 = new Student_Practice_1();
    s1.name = "Satendra";
    s1.age = 26;
    s1.display();

    // Practice_2
        BankAccount_Practice_2 acc = new BankAccount_Practice_2();
            acc.setBalance(500);
            System.out.println(acc.getBalance());
    }

    // Practice_3

    Developer_Practice_3 dd = new Developer_Practice_3();

}

