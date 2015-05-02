package com.fightItOut.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Handles Key Inputs and Events
 * @author Felipe
 * @version 1.0.0
 * @since May 2, 2015
 */
public class KeyInput extends KeyAdapter {

	private Handler handler;

	/**
	 * @param handler
	 *            handler of the game
	 */
	public KeyInput(Handler handler) {
		this.handler = handler;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player) {
				// key events for player

				if (key == KeyEvent.VK_W)
					tempObject.setVelY(-5);
				else if (key == KeyEvent.VK_S)
					tempObject.setVelY(5);
				else if (key == KeyEvent.VK_A)
					tempObject.setVelX(-5);
				else if (key == KeyEvent.VK_D)
					tempObject.setVelX(5);
			}

		}

	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player) {
				// key events for player

				if (key == KeyEvent.VK_W)
					tempObject.setVelY(0);
				else if (key == KeyEvent.VK_S)
					tempObject.setVelY(0);
				else if (key == KeyEvent.VK_A)
					tempObject.setVelX(0);
				else if (key == KeyEvent.VK_D)
					tempObject.setVelX(0);
			}

		}

	}

}
