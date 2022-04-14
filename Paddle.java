import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
