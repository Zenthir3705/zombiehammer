package model;

public class Tile {
	
	private TileType type;
	private int x;
	private int y;
	
	private Tile upper;
	private Tile right;
	private Tile lower;
	private Tile left;
	
	
	public Tile(TileType type, int x, int y) {
		super();
		this.type = type;
		this.x = x;
		this.y = y;
	}
	
	public TileType getType() {
		return type;
	}	
	
	public void setType(TileType type) {
		this.type = type;
	}	
}
