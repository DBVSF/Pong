
package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Enemy {
    
    public double x,y;
    public int width, height;
    
    public Enemy(int x, int y){
        this.x = x;
        this.y = y; 
        this.width = 40;
        this.height = 5;
        
        
    }
            
    
    public void tick(){
        
        //dificuldade (tirando o 0.4 o bot fica invensivel
        x+= (Game.ball.x - x - 6) * 0.07;
        
        Rectangle rect1 = new Rectangle((int)x, (int)y, width, height);
        
        if (true) {
            
        }
    }
    
    public void render (Graphics g){
        
          g.setColor(Color.blue);
        g.fillRect((int)x, (int)y, width, height);
        
        
    }
    
    
    
    
    
    
    
    
}
