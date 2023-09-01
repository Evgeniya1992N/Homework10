import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1:
        Scanner scan = new Scanner(System.in);
        System.out.println("Имя сотрудника");
        String firstName = scan.next();
        System.out.println("Отчество сотрудника");
        String middleName = scan.next();
        System.out.println("Фамилия сотрудника");
        String lastName = scan.next();
        String fullName = lastName + " " + firstName + " " +middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Task 2:
        System.out.println("ФИО сотрудника — " + fullName.toUpperCase());
        //Task 3:
        System.out.println("ФИО сотрудника — " + fullName.replace("ё", "е"));

    }
}