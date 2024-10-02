package Main;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class PlayManager {
	// This is the main play area
	final int WIDTH = 360;
	final int HEIGHT = 600;
	public static int left_x;
	public static int right_x;
	public static int top_y;
	public static int bottom_y;
	
	public PlayManager() {
		//This is where main area frame is
		left_x = (GamePane1.WIDTH/2) - (WIDTH/2); // 1280/2 - 360/2 = 460
		right_x = left_x + WIDTH;
		top_y = 50;
		bottom_y = top_y + HEIGHT;
	}
	public void update() {
		
	}
	public void draw(Graphics2D g2) {
		// this draws the play area frame
		g2.setColor(Color.white);
		g2.setStroke(new BasicStroke(4f));
		g2.drawRect(left_x-4,top_y-4,WIDTH+8,HEIGHT+8);
		
	}
}
