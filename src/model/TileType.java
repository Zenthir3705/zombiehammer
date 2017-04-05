package model;

public enum TileType {
	GRASS("Grass", true, 'G'),
	WATER("Water", false, 'W'),
	HILL("Hill", true, 'H'),
	MOUNTAIN("Mountain", true, 'M');	
	
	private String desc;
	private char shortDesc;
	private boolean accessable;
	
	private TileType(String desc, boolean accessable, char shortDesc){
		this.desc = desc;
		this.accessable = accessable;
		this.shortDesc = shortDesc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public char getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(char shortDesc) {
		this.shortDesc = shortDesc;
	}

	public boolean isAccessable() {
		return accessable;
	}

	public void setAccessable(boolean accessable) {
		this.accessable = accessable;
	}	
	
	
	
}
