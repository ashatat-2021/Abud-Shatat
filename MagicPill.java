package cankerBattling;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.image.BufferStrategy;
import java.io.File;
import java.awt.event.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.Color;

public class MagicPill implements Runnable {
	//All coding includes the background, the magic pill & canker sores (poison & regular) (& where they are), all colors, & what the magic pill & each canker sore can do.
	JFrame frame;
	Graphics2D mainG;
	int myX = 240;
	int myY = 220;
	Canvas canvas;
	BufferStrategy bufferStrategy;
	boolean running = true;
	
	public MagicPill() {
		frame = new JFrame("Canker Domination");
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setPreferredSize(new Dimension(500, 500));
		panel.setLayout(null);
		canvas = new Canvas();
		canvas.setBounds(0, 0, 500, 500);
		//canvas.setIgnoreRepaint(false);
		panel.add(canvas);
		canvas.addKeyListener(new KeyAdapter() {
		@Override
			public void keyPressed(KeyEvent evt) {
				moveIt(evt);
				if ( (myX == 40) & (myY == 30))
				{
				done();
				}
				else if( (myX == 40) & (myY == 230))
				{   
					try{
						File sound = new File("sounds//Right.wav");
						AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
						Clip clip = AudioSystem.getClip();
						clip.open(ais);
						clip.start();	
				}catch(Exception e) {System.out.println("Hey Abud, error in: "+e.getMessage());}
				}
				else if( (myX == 40) & (myY == 440))
				{
					try{
						File sound = new File("sounds//Right4.wav");
						AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
						Clip clip = AudioSystem.getClip();
						clip.open(ais);
						clip.start();	
				}catch(Exception e) {System.out.println("Hey Abud, error in: "+e.getMessage());}
				}
				else if( (myX == 240) & (myY == 30))
				{
					try{
						File sound = new File("sounds//Right3.wav");
						AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
						Clip clip = AudioSystem.getClip();
						clip.open(ais);
						clip.start();	
				}catch(Exception e) {System.out.println("Hey Abud, error in: "+e.getMessage());}
				}
				else if( (myX == 240) & (myY == 440))
				{
					done();
				}
				else if( (myX == 430) & (myY == 30))
				{
					try{
						File sound = new File("sounds//Right5.wav");
						AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
						Clip clip = AudioSystem.getClip();
						clip.open(ais);
						clip.start();	
				}catch(Exception e) {System.out.println("Hey Abud, error in: "+e.getMessage());}
				}
				else if( (myX == 430) & (myY == 230))
				{
					done();
	
				}
				else if( (myX == 430) & (myY == 440))
				{
					try{
						File sound = new File("sounds//Right2.wav");
						AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
						Clip clip = AudioSystem.getClip();
						clip.open(ais);
						clip.start();	
				}catch(Exception e) {System.out.println("Hey Abud, error in: "+e.getMessage());}
				}
				else if( (myX == 40) & (myY == 440))
				{
					done();
				}
				
			}

		private Object getWorld() {
			// TODO Auto-generated method stub
			return null;
		}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		canvas.createBufferStrategy(2);
		bufferStrategy = canvas.getBufferStrategy();
		canvas.requestFocus();
	}
	protected void removeTouching(Class<MagicPill> class1) {
		// TODO Auto-generated method stub
		
	}
	public void run() {
		
		while (running = true) {
		Paint();
		try {
		Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		}
	}
	public static void main(String[] args) {
	MagicPill ex = new MagicPill();
	new Thread(ex).start();
	}
	public void Paint() {
	Integer[] screenDimentions = {0,0,500,500};
    mainG = (Graphics2D) bufferStrategy.getDrawGraphics();	
    mainG.setBackground(new Color(255, 173, 193));
    mainG.setColor(new Color(255, 69, 0));
	mainG.clearRect(screenDimentions[0], screenDimentions[1],screenDimentions[2], screenDimentions[3]);
	Paint1(mainG);
	CankerSore(mainG);
	bufferStrategy.show();
	}
	
	protected void Paint1(Graphics2D g) {
	g.fillRoundRect(myX, myY, 20, 40, 20, 20);
	}
	
	public  void moveIt(KeyEvent evt) {
	switch (evt.getKeyCode()) {
	case KeyEvent.VK_DOWN:
	if (myY < 450) {myY += 10;}
	break;
	case KeyEvent.VK_UP:
	if (myY > 10) {myY -= 10;}
	break;
	case KeyEvent.VK_LEFT:
	if (myX > 10) {myX -= 10;}
	break;
	case KeyEvent.VK_RIGHT:
	if (myX < 450) {myX += 10;}
	break;
	}
	}
	
	public void CankerSore(Graphics2D g) {
		
		g.setColor(new Color(0, 0, 255));
		g.fillRoundRect(40, 30, 20, 20, 50, 50);
		
		g.setColor(new Color(19,4,25));
		g.fillRoundRect(40, 230, 20, 20, 50, 50);
		
		g.setColor(new Color(0,255,0));
		g.fillRoundRect(40, 440, 20, 20, 50, 50);
		
		g.setColor(new Color(0,25,78));
		g.fillRoundRect(240, 30, 20, 20, 50, 50);
		
		g.setColor(new Color(193,255,4));
		g.fillRoundRect(240, 440, 20, 20, 50, 50);
		
		g.setColor(new Color(78,21,0));
		g.fillRoundRect(430, 30, 20, 20, 50, 50);
		
		g.setColor(new Color(75,31,98));
		g.fillRoundRect(430, 230, 20, 20, 50, 50);
		
		g.setColor(new Color(251,9,28));
		g.fillRoundRect(430, 440, 20, 20, 50, 50);

	}	
	
	public void done()
	{
		
		this.mainG.dispose();
		this.bufferStrategy.dispose();
		this.frame.dispose();
		GameOver gm = new GameOver();	
	 
	}
}