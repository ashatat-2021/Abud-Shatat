package cankerBattling;

import java.awt.Graphics;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameOver extends JPanel{
//Coding for what happens when you get a GameOver (mostly similar to the Title class).
	JFrame window2 = new JFrame();
	GameOver()
	{
		window2.add(this);

		try{
		File sound = new File("sounds//GameOver.wav");
		AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();	

		}catch(Exception e) {System.out.println("Hey Abud, error in: "+e.getMessage());}

		window2.setLocation(350,200);
		window2.setUndecorated(true);
		window2.setSize(730,438);
		window2.setVisible(true);	
		try{
			Thread.sleep(5000);
			window2.dispose();
			Menu m2 = new Menu();
		}catch(Exception e){System.out.println("ABUD!");}
		
	}

	public void paint(Graphics g)
	{
		ImageIcon background2 = new ImageIcon("images//End.png");
		g.drawImage(background2.getImage(),0,0,null);
	}
}