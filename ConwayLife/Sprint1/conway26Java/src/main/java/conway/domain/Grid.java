package main.java.conway.domain;

public class Grid implements IGrid {
	public Grid(int width, int height) {
		if (width <= 0) {
			throw new IllegalArgumentException("width must be greater than 0");
		}
		if (height <= 0) {
			throw new IllegalArgumentException("height must be greater than 0");
		}
		
		grid = new Cell[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = new Cell();
			}
		}
	}
	
	@Override
	public int getWidth() { return grid.length; }
	@Override
	public int getHeight() { return grid[0].length; }
	@Override
	public ICell getCell(int x, int y)  {
		if (x < 0 || x >= getWidth()) {
			throw new IllegalArgumentException("x coordinate must be between 0 and width");
		}
		if (y < 0 || y >= getHeight()) {
			throw new IllegalArgumentException("y coordinate must be between 0 and height");
		}
		
		return grid[x][y];
	}
	@Override
	public boolean getCellValue(int x, int y) {
		return getCell(x, y).isAlive();
	}
	@Override
	public void setCell(int x, int y, ICell cell)  {
		if (x < 0 || x >= getWidth()) {
			throw new IllegalArgumentException("x coordinate must be between 0 and width");
		}
		if (y < 0 || y >= getHeight()) {
			throw new IllegalArgumentException("y coordinate must be between 0 and height");
		}
		
		grid[x][y] = cell;
	}
	@Override
	public void setCellValue(int x, int y, boolean value) {
		setCell(x, y, new Cell(value));
	}
	
	@Override
	public void reset() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new Cell();
			}
		}
	}
	
	private ICell[][] grid;
}
