package BallGame;
import java.awt.*;

public class BallGame extends Frame {
	
	Image pic = 
		Toolkit.getDefaultToolkit().getImage("images/sun.jpg");
	int x  = 100;
	int y  = 100;
	public void paint(Graphics g){
		g.drawImage(pic, x, 100, null);
		x=x+10;
	}
	
	void lacunchFrame(){
		setSize(500,300);
		setLocation(50,50);
		setVisible(true);
		setTitle("BALLGAME");
		setBackground(Color.black);
		
	}
	
	public static void main (String[] args){
		System.out.println("YZ");
		new BallGame().lacunchFrame();
	}
}
