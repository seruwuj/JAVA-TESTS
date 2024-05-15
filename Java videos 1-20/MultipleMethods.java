import java.util.Scanner;

public class MultipleMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TunaMultipleMethods TunaMultipleMethodsObject = new TunaMultipleMethods();
        System.out.println("Enter name of first gf here:");
        String temp = input.nextLine();
        TunaMultipleMethodsObject.setName(temp);
        TunaMultipleMethodsObject.saying();
    }
}