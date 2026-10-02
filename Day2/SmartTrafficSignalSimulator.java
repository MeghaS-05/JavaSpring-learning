/*Continuously accept traffic-light commands: RED, YELLOW, GREEN, EMERGENCY. Use switch to determine what the system should do.
EXIT should terminate the simulator.

Practice: switch, loop, break.*/

package Day2;
import java.util.Scanner;

public class SmartTrafficSignalSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the traffic-light command :");
            String light = sc.next().toUpperCase();

            switch(light){
                case "RED" -> System.out.println("Stop");
                case "GREEN" -> System.out.println("Move");
                case "YELLOW" -> System.out.println("Move Fast");
                case "EXIT" ->{
                    System.out.println("Simulator Terminated");
                    break;
                }
                default -> System.out.println("No Such traffic-light color");       
            }
            if(light.equals("EXIT")){
                break;
            }
        }
    }
}
