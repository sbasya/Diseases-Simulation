/**
 * CS 351 - Project4 - Disease Simulation Project.
 ** Sanjaya Basyal Prayesh Pandey
 */

package DieasesSimulationPAckage;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

/**
 * Pane is used to display the simulation of disease spreading among agents.
 * It handles the drawing of agents on a canvas according to their state and position.
 */
public class UI extends Pane {
    private final GraphicsContext gc;
    private final double WIDTH;  // Conforming to Java naming conventions
    private final double HEIGHT; // Conforming to Java naming conventions
    private final Agent[][] grid;


    /**
     * Constructs a UI component with a specified size and grid of agents.
     *
     * @param grid  Array of agents comprising the simulation
     * @param width Width of the simulation display
     * @param height Height of the simulation display
     */

    UI(Agent[][] grid, double width, double height){
        this.grid = grid;
        this.WIDTH = width;
        this.HEIGHT = height;
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        this.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
        Agent.setScreenWidth(WIDTH);
        Agent.setScreenHeight(HEIGHT);
    }


    /**
     * Creates the UI canvas and the agents.
     * @param rows number of rows in array.
     * @param cols number of columns in array.
     */

    protected void updateAgents(int rows, int cols) {
        gc.clearRect(0,0, WIDTH, HEIGHT);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Agent agent = grid[i][j];
                if (agent != null) {
                    gc.setFill(grid[i][j].getStateColor());
                    gc.fillOval(grid[i][j].getX(),agent.getY(),8,8);
                }
            }
        }
    }

    /**
     * @return Width
     */
    protected final double getWIDTH() {
        return WIDTH;
    }

    /**
     * @return Height
     */
    protected final double getHEIGHT() {
        return HEIGHT;
    }
}
