package com.fightItOut.main;

import java.awt.Graphics;
import java.util.LinkedList;

/**
 * Object Handler for game
 * 
 * @author Felipe
 * @since May 2, 2015
 */
public class Handler {

	LinkedList<GameObject> object = new LinkedList<GameObject>();

	private final int MAX_OBJECTS = 50; // Performance wise

	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);

			tempObject.tick();
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);

			tempObject.render(g);
		}
	}

	public void addObject(GameObject object) {
		if (this.object.size() < MAX_OBJECTS)
			this.object.add(object);
	}

	public void removeObject(GameObject object) {
		this.object.remove(object);
	}

}
