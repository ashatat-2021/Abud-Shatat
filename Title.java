package cankerBattling;

import java.awt.Graphics;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Title extends JPanel{

	JFrame window = new JFrame ();

	Title()

	{
		//Coding to run the title class (for the duration shown) & play the music. 
		window.add(this);

		try{
		File sound = new File("sounds//Title.wav");
		AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();	
		}catch(Exception e) {System.out.println("Hey Abud, error in: "+e.getMessage());}

		window.setLocation(190, 125);
		window.setUndecorated(true);
		window.setSize(1029,575);
		window.setVisible(true);	

		try{
			Thread.sleep(4750);
			window.dispose();
			Menu m = new Menu();
		}catch(Exception e){System.out.println(e);}


	}

	public void paint(Graphics g)
		//Coding to display the image.
	{
		ImageIcon background = new ImageIcon("images//Title2.png");
		g.drawImage(background.getImage(),0,0,null);
	}

}