/**
 * 
 */
package com.fightItOut.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Object Enemy Ranged Class with all it's properties
 * 
 * @author Felipe Heliszkowski
 * @version 1.0.0
 * @since May 2, 2015
 *
 */
public class Enemy_Ranged extends GameObject {

	Random r = new Random();
	private Handler handler;

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);
	}

	public Enemy_Ranged(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;

		velX = 2;
		velY = 2;
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;

		if (y <= 0 || y >= Game.HEIGHT - 36)
			velY *= -1;
		if (x <= 0 || x >= Game.WIDTH - 16)
			velX *= -1;

		handler.addObject(new Trail(x, y, ID.Trail, Color.cyan, 16, 16, 0.1f,
				handler));
	}

	@Override
	public void render(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);

		// g2d.setColor(Color.green); // Boundary Box Drawing
		// g2d.draw(getBounds());

	}

}
