/**
 * 
 */
package com.fightItOut.main;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Trailing graphics class
 * 
 * @author Felipe
 * @version 1.0.0
 * @since May 3, 2015
 *
 */
public class Trail extends GameObject {

	private float alpha = 1;
	private float life;

	private Handler handler;
	private Color color;

	private int width, height;

	// life = 0.001 <-> 0.1

	public Trail(int x, int y, ID id, Color color, int width, int height,
			float life, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		this.color = color;
		this.width = width;
		this.height = height;
		this.life = life;

	}

	private AlphaComposite makeTransparent(float alpha) {
		int type = AlphaComposite.SRC_OVER;
		return (AlphaComposite.getInstance(type, alpha));
	}

	@Override
	public void tick() {
		if (alpha > life) {
			alpha -= (life - 0.0001f);
		} else
			handler.removeObject(this);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		g2d.setComposite(makeTransparent(alpha));

		g.setColor(color);
		g.fillRect(x, y, width, height);

		g2d.setComposite(makeTransparent(1));

	}

}
