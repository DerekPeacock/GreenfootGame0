import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Move the paddle in four directions, up, down
 * left and right with the arrow keys
 * 
 * @author Derek Peacock
 * @version 0
 */
public class Paddle extends Actor
{
    int velocity = 5;
    GreenfootImage image = new GreenfootImage(100,20);
    
    public Paddle()
    {
        image.setColor(Color.BLUE);
        image.fill();
        setImage(image);
    }
    
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movePaddle();
    }
    
    /**
     * This method moves the paddle around in four directions
     * using coordinate positions.  Could use turtle graphics 
     * instead without x,y coordinates
     */
    public void movePaddle()
    {
        int x = getX(); int y = getY();
        
        if(Greenfoot.isKeyDown("left") && x > 50)
        {
            x -= velocity;
        }
        
        if(Greenfoot.isKeyDown("right") && x < 550)
        {
            x += velocity;
        }        
        
        if(Greenfoot.isKeyDown("down"))
        {
            y += velocity;
        } 
        
        if(Greenfoot.isKeyDown("up"))
        {
            y -= velocity;
        }
        
        setLocation(x, y);
    }
}
