/**
 * 
 */
package com.fightItOut.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Object Player Class with all it's properties
 * 
 * @author Felipe Heliszkowski
 * @version 1.0.0
 * @since May 2, 2015
 *
 */
public class Player extends GameObject {

	Random r = new Random();
	Handler handler;

	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;

	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;

		x = Game.clamp(x, 0, Game.WIDTH - 36);
		y = Game.clamp(y, 0, Game.HEIGHT - 56);

		collision();
	}

	private void collision() {
		for (int i = 0; i < handler.object.size(); i++) {

			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Enemy_Ranged) { // tempObject == Enemy_Ranged
				if (getBounds().intersects(tempObject.getBounds())) {
					// Collision code
					HUD.PLAYER_HEALTH -=2;
				}
			}
		}

	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

}
