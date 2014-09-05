int startX = (int)(Math.random()*601);
int startY = 0;
int endX = 300;
int endY = 300;
void setup()
{
  size(600,600);
  strokeWeight(1);
  background(0,0,0);
}
void draw()
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
void mousePressed()
{
	startX = (int)(Math.random()*601);
	startY = 0;
	endX = 300;
	endY = 300;
}