/**
 * 
 */
package com.fightItOut.main;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Felipe
 * @version 1.0.0
 * @since May 3, 2015
 *
 */
public class HUD {
	
	public static int PLAYER_HEALTH = 100;
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200, 32);
	}

}
