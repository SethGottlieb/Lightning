import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = (int)(Math.random()*601);
int startY = 0;
int endX = 300;
int endY = 300;
public void setup()
{
  size(600,600);
  strokeWeight(1);
  background(0,0,0);
}
public void draw()
{
	stroke(0, random(150,255), random(150,170), random(30, 255));
	while (endY < 600)
	{
		endX = startX + (int)(Math.random()*18-9);
		endY = startY + (int)(Math.random()*10);
		line(startX,startY,endX,endY);
		startX = endX;
		startY = endY;
	}
	if(endX < 600)
	{
		startX = (int)(Math.random()*601);
		startY = 0;
		endX = 300;
		endY = 300;
	}
}
public void mousePressed()
{
	startX = (int)(Math.random()*601);
	startY = 0;
	endX = 300;
	endY = 300;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
