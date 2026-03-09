package main.java.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import main.java.conway.domain.Cell;


public class CellTest {
	@Test
	public void testCell() throws Exception {
		var cell = new Cell();
		
		cell.setStatus(true);
		assertTrue(cell.isAlive());
		
		cell.setStatus(false);
		assertFalse(cell.isAlive());
	}
}
