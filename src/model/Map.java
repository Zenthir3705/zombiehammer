package model;

public class Map {
	private Tile[][] map;

	private MapType type;

	private int xLenght = 0;
	private int yLenght = 0;
	
	public Map(int xLenght, int yLenght, MapType type) {
		System.out.println("INFO: New Map was defined with X:" + xLenght + " and Y:" + yLenght);
		try {
			if (xLenght == 0 || yLenght == 0 || type == null) {
				System.out.println("ERROR: An error occured!");
			} else {
				this.xLenght = xLenght;
				this.yLenght = xLenght;
				this.type = type;

				map = new Tile[xLenght][yLenght];
				
				System.out.println("INFO: Map defined as: " + this.type.getDesc());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Initialization of Map 
	 */
	public void initialize() {
		if (xLenght != 0 || yLenght != 0) {
			System.out.println("INFO: Initialized. Start generation of Map!");
			this.createMap();
		} else {
			
		}
	}
	
	public void createMap(){
		int x = 0;
		int y = 0;
		
		for(Tile[] tileY : map){
			x = 0;
			for(Tile tileX : tileY){
				map[y][x] = this.generateNewTile(x, y);
				x++;
			}
			y++;
		}
	}
	
	public Tile generateNewTile(int x, int y){
		TileType tt;
		Tile[] adjacentTiles = this.getAdjacentTiles(x, y); 		
				
		tt = type.getRandomTileType();				
		
		return new Tile(tt, x, y);
	}
	
	private Tile[] getAdjacentTiles(int x, int y){
		
		return new Tile[] {getTile(x - 1, y ), getTile(x, y + 1), getTile(x + 1, y), getTile(x, y + 1)};
	}	
	
	public Tile getTile (int x, int y){
		return map[x][y];
	}

	public void output() {
		for(Tile[] a : map){
			for(Tile tile : a){
				System.out.print(tile.getType().getShortDesc());
			}
			System.out.println("");
		}
	}

}
