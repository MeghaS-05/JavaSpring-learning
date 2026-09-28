/*Temperature Converter with Validation
Accept a temperature and its unit (C, F, or K) from the user. Convert it to the other two units. Reject invalid units and physically invalid temperature values.

MNC Technical Round:
What should happen if the user enters -300°C? Design the input validation condition without using any library other than standard Java input functionality.*/

package Day1;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature:");
        double temp = sc.nextDouble();
        System.out.println("Enter the Unit of the given temperature:");
        char units = sc.next().toUpperCase().charAt(0);

        if(units=='C' && temp>0){
            double F = (temp*1.8)+32;
            double K = temp+273.15;

            System.out.printf("Celsius to Fahrenheit :%.2f%n",F);
            System.out.printf("Celsius to Kelvin :%.2f%n",K);
        } else if(units == 'F' && temp>0){
            double C = (temp-32)/1.8;
            double K = (temp-32)/1.8+273.15;

            System.out.printf("Fahrenheit to Celsius :%.2f%n",C);
            System.out.printf("Fahrenheit to Kelvin :%.2f%n",K);
        } else if(units=='K' && temp>0){
            double C = temp-273.15;
            double F = (temp-273.15)*1.8+32;

            System.out.printf("Kelvin to Celsius :%.2f%n",C);
            System.out.printf("Kelvin to Fahrenheit :%.2f%n",F);
        } else{
            System.out.println("Invalid Character");
        }
    }
}
