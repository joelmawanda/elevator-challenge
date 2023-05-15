package main.java.com.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<Elevator> elevators;
    private int numFloors;
    private int weightLimit;

    public ElevatorManager(int numElevators, int numFloors, int weightLimit) {
        elevators = new ArrayList<>();
        for (int i = 0; i < numElevators; i++) {
            elevators.add(new Elevator(1, weightLimit)); // Initialize all elevators on the first floor
        }
        this.numFloors = numFloors;
        this.weightLimit = weightLimit;
    }

    public void requestElevator(int floor, int numPeople) {
        Elevator nearestElevator = findNearestElevator(floor);
        System.out.println("Elevator " + elevators.indexOf(nearestElevator) + " is arriving at floor " + floor);

        if (nearestElevator.isOverWeightLimit(numPeople)) {
            System.out.println("Elevator " + elevators.indexOf(nearestElevator) + " cannot accommodate " + numPeople + " people. Please wait for the next main.java.elevator.");
            return;
        }

        nearestElevator.addPeople(numPeople);
        nearestElevator.move();
    }

    public void updateStatus(){
        for (int i = 0; i < elevators.size(); i++) {
            Elevator elevator =  elevators.get(i);
            System.out.println("Elevator " + i + ": Floor " + elevator.getCurrentFloor() + ", Direction: " + (elevator.isGoingUp() ? "Up" : "Down") + ", People: " + elevator.getNumPeople());
        }
    }

    private Elevator findNearestElevator(int floor) {
        Elevator nearestElevator = elevators.get(0);
        int minDistance = Math.abs(nearestElevator.getCurrentFloor() - floor);

        for (int i = 1; i < elevators.size(); i++) {
            Elevator elevator = elevators.get(i);
            int distance = Math.abs(elevator.getCurrentFloor() - floor);

            if (distance < minDistance) {
                nearestElevator = elevator;
                minDistance = distance;
            }
        }

        return nearestElevator;
    }
}
