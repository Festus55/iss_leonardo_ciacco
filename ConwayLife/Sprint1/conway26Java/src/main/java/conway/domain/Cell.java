package main.java.conway.domain;

public class Cell implements ICell {
	public Cell() {
		this(false);
	}
	
	public Cell(boolean value) {
		alive = value;
	}
	
	@Override
	public void setStatus(boolean status) { alive = status; }
	@Override
	public boolean isAlive() { return alive; }
	@Override
	public void switchCellState() { alive = !alive; }
	
	private boolean alive;
}
