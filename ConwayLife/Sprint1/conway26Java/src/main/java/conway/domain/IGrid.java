package main.java.conway.domain;

public interface IGrid {
	public int getWidth();
	public int getHeight();
	
	public ICell getCell(int x, int y);
	public boolean getCellValue(int x, int y);
	public void setCell(int x, int y, ICell cell);
	public void setCellValue(int x, int y, boolean value);
	
	public void reset();
}
