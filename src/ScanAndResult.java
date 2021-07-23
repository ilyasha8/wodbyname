import java.util.Scanner;

public class ScanAndResult {
    public static void main(String[] args) {
        Scanner enteredName = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String nameForWod = enteredName.nextLine();
        System.out.println("Hi, " + nameForWod + " your WOD is:\n");
    }
}
