# Disease Spread Simulation Project
## Team Members

- Person A = Sanjaya Basyal
- Person B = Prayesh Pandey


Description
This JavaFX application uses multi-agent system as a tool for modeling the spread on the disease in the groups of people among whom the disease develops over time.Each agent runs autonomously. The simulation present settings which have a significant effect on how the disease spreads can be authentically and interestingly accomplished, for example, agents' movements, infection rates, and recovery periods. It shows the crazed expansion in the course of time. This dynamic aspect of the infection is the main goal. Users can learn how it is spreading via the interactive and visual experience.


## Project Overview
The simulation starts with a grid-based representation of agents. Each agent's state is represented by a different color, indicating their current health level. Users can adjust parameters such as disease infectivity, mortality rates, and agent mobility to see how these factors affect disease spread.



## Workload Division

To ensure an equitable distribution of work and clear documentation of contributions, we've divided the project tasks as follows:

### Person A Responsibilities

1. **Configuration File Loading**: Extended the functionality of reading and parsing configuration files in getting values like dimensions, exposure time, incubation time, sickness time, and recovery chance, initial locations of agents, and initial infected agent count.

2. **Simulation Initialization**: Set up the simulation state in accordance with the configuration file parsing, with the individual location based on a used configuration (a grid, a random place, or a random grid).

3. **GUI Setup**: Created the initial GUI framework to display simulation states with different colors for different 
agent states and manage user interactions.

### Person B Responsibilities

1. **Agent State Management**: Developed the logic for transitioning agents between states (vulnerable, sick, immune,
dead), including handling incubation periods and determining recovery or death outcomes.

2. **Neighbor Detection and Disease Transmission**: Implemented the logic for agents to detect neighbors within the 
exposure distance and manage disease transmission.

3. **Simulation Execution and Control**: Coded the logic that advances the simulation, managing concurrent agent actions 
and ensuring thread safety to prevent deadlocks and race conditions.

## Key Features

Dynamic Agent Interaction: The agents communicate by transportation means and density of the disease factor.

Real-time Updates: The user interface is updated on real-time basis to reflect an ongoing changes in agents' statuses and diseases spread.

Configurable Simulation Parameters: People can add several scenarios by using the pre-made scenario configuration files and edit the related factors such as infection chance and movement details.

Statistical Display: These live graphs that show how the community is affected over time and the historical log that lists daily changes relative to the population’s health offer information and insights into the simulation.

Concurrent Execution: Every agent functions by itself on its own thread, managing state transitions through messages passing rather than method direct calls that results in the correct concurri

### How To Play:

- **Setup Initialization:** 
- Prerequisites: Ensure Java JDK and JavaFX are installed on your system.
- Compilation: Compile the Java files in the project directory, including necessary libraries.
- Starting the Simulation:
   Run the Main class
   The UI will display the initial state of the agents on the grid.

-**Interacting with the Simulation:**
- Starting and Pausing: Use the provided buttons to start or pause the simulation at any time.
- Adjusting Parameters: Modify parameters like infection rate or agent speed in real-time through the interface.
- Observing Changes: Watch as the simulation updates the display based on the agents' interactions and movements.


## Project Structure
- Classes:

1) Agent:
Description :
Represents a simulation participant who can be vulnerable, infected, recovering, immune, or deceased. Each agent navigates the environment independently, making decisions based on local interactions and the global setting. Agents play a significant role in the simulation's dynamics, depicting the complicated behaviors of disease spread through relationships.

Key Function:
State Management: Controls the transition between distinct health states using disease transmission dynamics and recovery algorithms.
Message Handling: Receives and processes messages from neighboring agents, allowing disease spread mechanisms to be executed decentrally.
Movement Simulation: Generates random or directed movements inside the simulation space, affecting the agent's interaction with other agents and their surroundings.

2) UI
Description:
Manages the graphical user interface, providing a visual representation of the simulation grid where each agent's state is updated in real-time. This component is crucial for user interaction, offering a window into the simulation's ongoing processes and outcomes.

Key Functions:
Visual Updates: Refreshes the display to show changes in agent states, using color coding to differentiate between health statuses.
Agent State Representation: Draws agents on the grid according to their current state and position, enhancing the user's understanding of the simulation's progress.

3) StatisticsGraph
Description:
Visualizes essential statistical data from the simulation, such as the number of agents in each state across time. This component assists in determining the efficacy of various simulation parameters and illness features.
   
Key functions:
Real-Time Graph Updates: Dynamically updates charts and graphs to reflect current simulation statistics, providing insights into the health trends within the agent population.
Data Visualization: Offers various visualization options (e.g., bar charts, line graphs) to depict the progression of the disease and recovery rates across the simulated population.

4) SimulationHistory
Description:
Maintains a record of key events that occur during the simulation, such as agent state changes or notable disease transmission occurrences. This historical record is critical for retrospective analysis and understanding the chain of events that led to the simulation's various outcomes.

Key functions:
Event Logging: Keeps and shows crucial events, providing a timeline view that highlights critical points in the simulation.
History Display: Provides a user-accessible log that may be used to trace the disease's impact over time, which aids in debugging and refining simulation parameters.

5) ConfigFileManager
Description:
Easily loads and saves simulation setups, allowing you to easily set up and repeat certain scenarios. This component improves the simulation's usability and repeatability by offering effective simulation settings management tools.
   
Key functions:
Configuration parsing: It interprets and applies settings from external configuration files, allowing users to establish the simulation's initial conditions and parameters.
File I/O: Handles input and output activities for configuration files, assuring data integrity and ease of access.

6) Main:
Description:
Serves as the application's entry point, organizing the basic setup and launching the simulation. This class is responsible for integrating all system components and ensuring that the simulation works smoothly from beginning to end.

Key functions:
Application Initialization: Sets up all essential components and loads the first simulation settings.
Parameter Setup : Parses command-line inputs or configuration files to configure the simulation environment based on user-defined or default parameters.

## Text Files Overview:

config.txt:
Description: Defines the initial settings for the simulation, such as agent count, infectivity rates, and initial agent states.
Usage: Read at startup to configure the simulation parameters.

## Additional Features:

History Tracking: Each important change in an agent's state is recorded, demonstrating the disease's course across the population.
Dynamic Neighbor Calculation: Agents evaluate their neighbors based on proximity, which may alter if agents are allowed to move.
Re-run Capability: The simulation can be reset and re-run with the same or other parameters without restarting the application.

## Steps to Run
Compile the Java files in the project directory.
Run the Main class, providing the path to config.txt as an argument.
Follow the on-screen instructions to interact with the simulation.

## Missing Features and Known Issues:
Dynamic Neighbor Updates: When agents migrate, the simulation may not appropriately update the neighbors, which can impair infection transmission.
Performance bottlenecks: In cases involving a large number of agents, the simulation may slow considerably, particularly while recalculating neighbors.

## Prerequisites
Java JDK 11 or later.
JavaFX SDK 11 or later.
