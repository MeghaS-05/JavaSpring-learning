package Day1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PracD1{
    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter student name: ");
        String name = br.readLine();

        System.out.print("Enter student age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter student marks: ");
        double marks = Double.parseDouble(br.readLine());

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
