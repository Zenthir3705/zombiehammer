package model;

/**
 * The class represents a single token that can be assigned to any field.
 */
public abstract class Token {
	
	private int x, y;
	
	/**
	 * Constructor
	 * @public
	 * @param {int} x the x coordinate of the token
	 */
	public Token(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 * Getter and Setter of the class
	 */
	public int getX() { return x; }
	public int getY() { return y; }

	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
}
