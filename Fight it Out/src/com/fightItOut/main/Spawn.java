package com.fightItOut.main;

import java.awt.List;
import java.util.LinkedList;
import java.util.Random;

public class Spawn {

	private Handler handler;

	private HUD hud;

	private int scoreKeep = 0;
	private int level;

	private LinkedList<GameObject> objectList;

	private Random r = new Random();

	/**
	 * @param handler
	 * @param hud
	 */
	public Spawn(Handler handler, HUD hud) {
		this.hud = hud;
		this.handler = handler;
		level = hud.getLevel();
		this.objectList = handler.object;
	}

	public void tick() {
		scoreKeep++;

		if (scoreKeep >= 50) {
			level++;
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);

			if (hud.getLevel() == level) {
				for (int i = 0; i < r.nextInt(level); i++) {
					handler.addObject(new Enemy_Ranged(r
							.nextInt(Game.WIDTH - 50), r
							.nextInt(Game.HEIGHT - 50), ID.Enemy_Ranged,
							handler));
				}
			}
		}
	}

}
