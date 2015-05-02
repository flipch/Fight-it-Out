package com.fightItOut.main;

import java.awt.Canvas;

/**
 * @author Felipe Heliszkowski
 * @version 1.0.1
 * @category Game
 */
public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = -1539400485938755709L;

	public static final int WIDTH = 1280, HEIGHT = WIDTH / 12 * 9;
	
	public Game(){
		new Window(WIDTH, HEIGHT, "Fight it out!", this);
	}
	
	public synchronized void start(){
		
	}
	
	public void run(){
		
	}
	
	public static void main(String args[]){
		new Game();
	}

}
