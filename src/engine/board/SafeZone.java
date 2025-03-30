package engine.board;

import java.util.ArrayList;

import model.Colour;

public class SafeZone {
	// READ ONLY attributes
	private final Colour colour;
	private final ArrayList<Cell> cells;

	/**
	 *  Constructor that initializes colour of safe zone and add 4 safe cells to the safe zone
	 * @param colour
	 */
	public SafeZone(Colour colour) {
		this.colour = colour;
		this.cells = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			cells.add(new Cell(CellType.SAFE));
		}
	}

	// Getters for safe zone attributes
	public Colour getColour() {
		return colour;
	}

	public ArrayList<Cell> getCells() {
		return cells;
	}
	
	/**
	 * Checks whether all Safe Zone Cells are occupied by marbles.
	 *
	 * @return true if all Safe Zone cells contain marbles, false otherwise.
	 */
	public boolean isFull()
	{
		for(int i=0; i<cells.size(); i++)
			if(cells.get(i).getMarble()==null) return false;
		return true;
	}

}
