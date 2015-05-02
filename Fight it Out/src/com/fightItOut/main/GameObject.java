package com.fightItOut.main;

import java.awt.Graphics;

/**
 * Joins all Object types into an abstract one(GameObject) 
 * @author Felipe Heliszkowski
 * @since May 2, 2015
 */
public abstract class GameObject {

	protected int x, y;
	protected ID id;
	protected int velX, velY;

	/**
	 * @param x
	 *            the position on screen X-wise
	 * @param y
	 *            the position on screen Y-wise
	 * @param id
	 *            the ID
	 */
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public abstract void tick();

	/**
	 * The rendering properties of the GameObject
	 * 
	 * @param g
	 *            the graphics instance
	 */
	public abstract void render(Graphics g);

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the id
	 */
	public ID getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(ID id) {
		this.id = id;
	}

	/**
	 * @return the velX
	 */
	public int getVelX() {
		return velX;
	}

	/**
	 * @param velX
	 *            the velX to set
	 */
	public void setVelX(int velX) {
		this.velX = velX;
	}

	/**
	 * @return the velY
	 */
	public int getVelY() {
		return velY;
	}

	/**
	 * @param velY
	 *            the velY to set
	 */
	public void setVelY(int velY) {
		this.velY = velY;
	}

}
