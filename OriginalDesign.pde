void setup()
{
	size(500,500);
	strokeWeight(0);
}
void draw()
{
	background(255);
	squares();
	circles();
	frameRate(20);
}
void squares()
{
	int r = ((int)(Math.random()*256));
	int g = ((int)(Math.random()*256));
	int b = ((int)(Math.random()*256));
	int x = ((int)(Math.random()*300));
	int y = ((int)(Math.random()*300));
	int w = ((int)(Math.random()*300));
	fill(r,g,b);
	rect(x,y,w,w);
}
void circles()
{
	int cr = ((int)(Math.random()*256));
	int cg = ((int)(Math.random()*256));
	int cb = ((int)(Math.random()*256));
	int cx = ((int)(Math.random()*500));
	int cy = ((int)(Math.random()*500));
	int cw = ((int)(Math.random()*300));
	fill(cr,cg,cb);
	ellipse(cx,cy,cw,cw);
}