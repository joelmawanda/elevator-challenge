package elevator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElevatorTest {
    private Elevator elevator;

    @BeforeEach
    void setUp() {
        elevator = new Elevator(1, 5); // Initialize elevator on floor 1 with weight limit of 5
    }

    @Test
    void getCurrentFloor_InitialFloor_ReturnsInitialFloor() {
        int expectedFloor = 1;
        int actualFloor = elevator.getCurrentFloor();
        assertEquals(expectedFloor, actualFloor);
    }

    @Test
    void isGoingUp_InitialDirection_ReturnsTrue() {
        assertTrue(elevator.isGoingUp());
    }

    @Test
    void getNumPeople_EmptyElevator_ReturnsZero() {
        int expectedNumPeople = 0;
        int actualNumPeople = elevator.getNumPeople();
        assertEquals(expectedNumPeople, actualNumPeople);
    }

    @Test
    void move_GoingUp_CurrentFloorIncremented() {
        elevator.move();
        int expectedFloor = 2;
        int actualFloor = elevator.getCurrentFloor();
        assertEquals(expectedFloor, actualFloor);
    }

    @Test
    void move_GoingDown_CurrentFloorDecremented() {
        elevator.changeDirection();
        elevator.move();
        int expectedFloor = 0;
        int actualFloor = elevator.getCurrentFloor();
        assertEquals(expectedFloor, actualFloor);
    }

    @Test
    void addPeople_AddingThreePeople_NumPeopleIncreased() {
        int numPeopleToAdd = 3;
        elevator.addPeople(numPeopleToAdd);
        int expectedNumPeople = numPeopleToAdd;
        int actualNumPeople = elevator.getNumPeople();
        assertEquals(expectedNumPeople, actualNumPeople);
    }

    @Test
    void removePeople_RemovingTwoPeople_NumPeopleDecreased() {
        int numPeopleToAdd = 4;
        elevator.addPeople(numPeopleToAdd);
        int numPeopleToRemove = 2;
        elevator.removePeople(numPeopleToRemove);
        int expectedNumPeople = numPeopleToAdd - numPeopleToRemove;
        int actualNumPeople = elevator.getNumPeople();
        assertEquals(expectedNumPeople, actualNumPeople);
    }

    @Test
    void isOverWeightLimit_WeightLimitExceeded_ReturnsTrue() {
        int numPeopleToAdd = 6;
        assertTrue(elevator.isOverWeightLimit(numPeopleToAdd));
    }

    @Test
    void isOverWeightLimit_WeightLimitNotExceeded_ReturnsFalse() {
        int numPeopleToAdd = 3;
        assertFalse(elevator.isOverWeightLimit(numPeopleToAdd));
    }
}
