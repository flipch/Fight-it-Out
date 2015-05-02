/**
 * 
 */
package com.fightItOut.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * @author Felipe Heliszkowski
 * @version 1.0.0
 * @since May 2, 2015
 *
 */
public class Player extends GameObject {

	Random r = new Random();
	
	public Player(int x, int y, ID id) {
		super(x, y, id);

		//velX = r.nextInt(5) + 1;
		//velY = r.nextInt(5) + 1;
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
	}

	
	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

}
