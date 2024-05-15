import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecondChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[10];

        // Input user name
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = input.nextLine();
        }
        System.out.println("The names entered are:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("CONGRATULATIONS!! WELCOME TO MY JAVA CLASS!");

        // Write to a file
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("CONGRATULATIONS!! WELCOME TO MY JAVA CLASS!");
            printWriter.println("Usernames: ");
            for (String Names : names) {
                printWriter.println(Names);
            }
            printWriter.close();
            System.out.println("Output has been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}