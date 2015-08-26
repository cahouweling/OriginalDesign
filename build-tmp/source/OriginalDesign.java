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

public class OriginalDesign extends PApplet {

public void setup()
{
	size(500,500);
	strokeWeight(0);
}
public void draw()
{
	background(255);
	squares();
	circles();
	frameRate(20);
}
public void squares()
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
public void circles()
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
