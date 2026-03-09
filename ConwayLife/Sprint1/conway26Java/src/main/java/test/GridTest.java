package main.java.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import main.java.conway.domain.Cell;
import main.java.conway.domain.Grid;

public class GridTest {
	@Test(expected = IllegalArgumentException.class)
	public void testGrid() throws Exception {
		var grid = new Grid(4, 4);
		
		for (int i = 0; i < grid.getWidth(); i++) {
			for (int j = 0; j < grid.getHeight(); j++) {
				assertFalse(grid.getCell(i, j).isAlive());
			}
		}
		
		grid.setCell(0, 0, new Cell(true));
		assertTrue(grid.getCell(0, 0).isAlive());
		
		grid.getCell(-1, grid.getHeight() + 1);
	}
}
