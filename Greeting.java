import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Greeting {
    public static String Name(String Name1, String Name2) {
        return Name1 + " " + Name2;
    }
    public static void main(String[] args) {
        String Name1, Name2, FullName;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        Name1 = input.next();

        System.out.println("What is your second name?");
        Name2 = input.next();

        FullName = Name(Name1, Name2);
        System.out.println("Hello, " + FullName);
    }
}