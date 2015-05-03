/**
 * 
 */
package com.fightItOut.main;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Heads up display class
 * @author Felipe
 * @version 1.0.0
 * @since May 3, 2015
 *
 */
public class HUD {

	public static int PLAYER_HEALTH = 100;

	public void tick() {
		PLAYER_HEALTH = Game.clamp(PLAYER_HEALTH, 0, 100);
	}

	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(15, 15, 201, 32);
		g.setColor(Color.green);
		g.fillRect(15, 15, PLAYER_HEALTH * 2, 32);
		if(PLAYER_HEALTH<60)
			g.setColor(Color.yellow);
			g.fillRect(15, 15, PLAYER_HEALTH * 2, 32);
		if(PLAYER_HEALTH<30)
			g.setColor(Color.red);
			g.fillRect(15, 15, PLAYER_HEALTH * 2, 32);	
		g.setColor(Color.white);
		g.drawRect(15, 15, 200, 32);
	}

}
