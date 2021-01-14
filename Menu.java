package cankerBattling;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener,KeyListener {
	
	JFrame window = new JFrame();
	JButton playButton = new JButton();
	JButton exitButton = new JButton();
	JLabel infoLabel = new JLabel();
	JLabel centerImageLabel = new JLabel();
	JButton backgroundButton = new JButton();
	
	Font customFont = new Font("Italic",Font.ITALIC,22);
	//For everything: All coding of what's shown on the menu, as well as what each button does.
	Menu()
	{
		this.setBackground(Color.RED);
		this.setForeground(Color.RED);
		window.add(this);
		
		playButton.setBackground(Color.RED);
		playButton.setIcon(new ImageIcon("images//Play3.png"));
		playButton.addActionListener(this);
		playButton.addKeyListener(this);
		window.add(playButton,BorderLayout.PAGE_START);
		
		exitButton.setBackground(Color.RED);
		exitButton.setIcon(new ImageIcon("images//Exit3.png"));
		exitButton.addActionListener(this);
		exitButton.addKeyListener(this);
		window.add(exitButton,BorderLayout.WEST);
		
		backgroundButton.setBackground(Color.RED);
		backgroundButton.setIcon(new ImageIcon("images//GoodLuck.png"));
		backgroundButton.addActionListener(this);
		backgroundButton.addKeyListener(this);
		window.add(backgroundButton,BorderLayout.PAGE_END);
		
		infoLabel.setText("Move With The Arrow Keys");
		infoLabel.setFont(customFont);
		infoLabel.setOpaque(false);
		infoLabel.setBackground(Color.RED);
		infoLabel.setBackground(Color.RED);
		window.add(infoLabel,BorderLayout.EAST);
		
		centerImageLabel.setBackground(Color.RED);
		centerImageLabel.setIcon(new ImageIcon("images//Menu6.png"));
		window.add(centerImageLabel,BorderLayout.CENTER);
		
		window.setLocation(140,125);
		window.setUndecorated(true);
		window.setSize(1150,575);
		window.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent kp) {
	if(kp.getKeyCode()==KeyEvent.VK_ESCAPE)
	{
		window.dispose();
	}
	
    }

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==exitButton)
		{
			window.dispose();
		}
		if(ae.getSource()==playButton)
		{	
		  MagicPill mp = new MagicPill();
		  mp.main(null);
		}
		
	}
	
}