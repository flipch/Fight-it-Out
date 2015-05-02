/**
 * 
 */
package com.fightItOut.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Object Player Class with all it's properties
 * @author Felipe Heliszkowski
 * @version 1.0.0
 * @since May 2, 2015
 *
 */
public class Player extends GameObject {

	Random r = new Random();

	public Player(int x, int y, ID id) {
		super(x, y, id);

	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 36);
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
	
	

}
