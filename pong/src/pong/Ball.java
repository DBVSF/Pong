
package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Ball {
    
    public double x,y;
    public int width, height;
    
    public double dx, dy;
    public double speed = 1.4;
    
    public Ball(int x, int y){
        
        this.x = x;
        this.y = y; 
        this.width = 4;
        this.height = 4;
        
        dx = new Random().nextGaussian();
        dy = new Random().nextGaussian();
    }
            
    
    public void tick(){
     
        x+=dx*speed;
        y+=dy*speed;
    }
    
    public void render (Graphics g){
        
            g.setColor(Color.white);
            g.fillRect((int)x, (int)y, width, height);
        
        
    }
    
    
    
    
    
}
