package elevator;

import java.util.Scanner;

public class ElevatorSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elevators: ");
        int numElevators = scanner.nextInt();

        System.out.print("Enter the number of floors: ");
        int numFloors = scanner.nextInt();

        System.out.print("Enter the weight limit (number of people): ");
        int weightLimit = scanner.nextInt();

        ElevatorManager elevatorManager = new ElevatorManager(numElevators, numFloors, weightLimit);

        while (true) {
            System.out.println("\n--- Elevator Simulator ---");
            System.out.println("1. Request an elevator");
            System.out.println("2. Update elevator status");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the floor you are at: ");
                    int floor = scanner.nextInt();

                    if (floor < 1 || floor > numFloors) {
                        System.out.println("Invalid floor number. Please try again.");
                        continue;
                    }

                    System.out.print("Enter the number of people: ");
                    int numPeople = scanner.nextInt();

                    elevatorManager.requestElevator(floor, numPeople);
                    break;
                case 2:
                    elevatorManager.updateStatus();
                    break;
                case 3:
                    System.out.println("Exiting elevator simulator.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
