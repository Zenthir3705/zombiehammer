package model;

public class MapTileType {
	
	private TileType tileType;
	private double percentage;
	
	public MapTileType (TileType tileType, double percentage) {
		super();
		this.tileType = tileType;
		this.percentage = percentage;
	}
	
	/*
	 * Getter and Setter methods
	 * @public
	 */
	public TileType getTileType() { return tileType; }

	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
	
}
