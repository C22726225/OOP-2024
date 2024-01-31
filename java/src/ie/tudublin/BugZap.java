package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{
	public void settings() 
	{
		size(1000, 1000);
	}

	public void setup() 
	{
		
	}

	public BugZap()
	{
	
	}

	public float bugX = 500.0f;
	public float bugY = 15.0f;
	public float bugWidth = 30.0f;

	public void drawBug(float x, float y, float w)
	{
		triangle(490, 25, 500, 10, 510, 25);
		line(493, 25, 490, 30);
		line(507, 25, 510, 30);
		line(500, 25, 500, 30);
	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}

	int gameMode = 0;

	public void draw() 
	{
		// float move_bug_x = random(480, 520);
		drawBug(bugX, bugY, bugWidth);
	}
}
