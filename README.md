# Elevator Challenge
The Elevator Challenge is a console application written in Java that simulates the movement of elevators with the goal of efficiently moving people. It allows users to request an elevator from a specific floor and tracks the status of the elevators, including their current floor, direction, and the number of people they are carrying. The simulator also incorporates a weight limit, expressed as the number of people an elevator can accommodate.
# Features
•	Request an elevator: Users can request an elevator by specifying the floor they are currently on and the number of people to be transported. The simulator will allocate   the nearest available elevator that can accommodate the requested number of people.
•	Update elevator status: Users can check the status of all elevators managed by the simulator, including the current floor, direction of movement, and the number of people   inside.
•	Weight limit: Each elevator has a weight limit expressed as the maximum number of people it can carry. The simulator checks the weight limit before allocating an elevator   to ensure it can accommodate the requested number of people. If an elevator is already at its weight limit, it will not accept additional passengers.
# Getting Started
# Prerequisites
•	Java Development Kit (JDK) 8 or later.
•	Apache maven (for building the project).
# Building the project
  1. Clone the repository git clone https://github.com/joelmawanda/elevator-challenge.git
  2. Navigate to the project **cd elevator-challenge**
  3. Build the project using maven **maven clean package**

# Running the simulator
  1. After successfully building the project, navigate to the target directory: **cd target**
  2. Run the simulator using the following command: **java -jar elevator-challenge-1.0-SNAPSHOT**
  3. Follow the on-screen instructions to interact with the simulator. **You can request an elevator status, or exit the simulator.**

# Customization
The simulator allows for customization based on your requirements. Here are a few possible customization options:
•	Number of elevators: In the ElevatorSimulator class, you can modify the numElevators variable to set the desired number of elevators in the building.
•	Number of floors: In the ElevatorSimulator class, you can modify the numFloors variable to set the total number of floors in the building.
•	Weight limit: In the ElevatorSimulator class, you can modify the weightLimit variable to set the weight limit (number of people) for each elevator.

# Contributing
Contributions to the elevator simulator project are welcome! If you have any ideas, improvements, or bug fixes, please submit a pull request. For major changes, please open an issue to discuss the proposed changes before proceeding.

# License
This project is licensed under the MIT License. Feel free to use, modify, and distribute the code for both commercial and non-commercial purposes.

# Acknowledgements
•	This project was created as a demonstration of elevator simulation and is not intended for production use.
•	The project was developed using Java and follows object-oriented principles.
•	The codebase utilizes the Maven build system for easy dependency management and project building.



  
