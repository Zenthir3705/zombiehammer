package model;

public enum MapType {	
	STANDARD("Standard", new MapTileType[] { new MapTileType(TileType.GRASS, 0.6), new MapTileType(TileType.WATER, 0.4) } ),
	HILLS("Hills", new MapTileType[] {new MapTileType(TileType.GRASS, 0.3), new MapTileType(TileType.WATER, 0.1), new MapTileType(TileType.HILL, 0.4), new MapTileType(TileType.MOUNTAIN, 0.2)});
	
	private MapTileType[] types;
	private String desc;
	
	
	private MapType(String desc, MapTileType[] mapTileTypes) {
		//ToDo: Check Percentages sum is 100%
		this.types = mapTileTypes;
		this.desc = desc;
		
		double sum = 0;
		
		for(MapTileType t : types){
			sum += t.getPercentage();
			t.setPercentage(sum);
		}
		
	}

	public MapTileType[] getMapTileTypes() {
		return types;
	}

	public String getDesc() {
		return desc;
	}

	public TileType getRandomTileType() {
		double ran = Math.random();
		
		for(MapTileType t : types){
			if(ran <= t.getPercentage()){
				return t.getTileType();
			}
		}			
		return null;
	}
	
		
}
