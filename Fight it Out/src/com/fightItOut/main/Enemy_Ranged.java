/**
 * 
 */
package com.fightItOut.main;

import java.awt.Color;
import java.awt.Graphics;
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

	public Enemy_Ranged(int x, int y, ID id) {
		super(x, y, id);

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

	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);

	}
}
