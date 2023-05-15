package main.java.com.elevator;

public class Elevator {
    private int currentFloor;
    private boolean goingUp;
    private int numPeople;
    private int weightLimit;

    public Elevator(int initialFloor, int weightLimit) {
        currentFloor = initialFloor;
        goingUp = true;
        numPeople = 0;
        this.weightLimit = weightLimit;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean isGoingUp() {
        return goingUp;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void move() {
        if (goingUp) {
            currentFloor++;
        } else {
            currentFloor--;
        }
    }

    public void changeDirection() {
        goingUp = !goingUp;
    }

    public void addPeople(int num) {
        numPeople += num;
    }

    public void removePeople(int num) {
        numPeople -= num;
        if (numPeople < 0) {
            numPeople = 0;
        }
    }

    public boolean isOverWeightLimit(int additionalPeople) {
        return (numPeople + additionalPeople) > weightLimit;
    }
}