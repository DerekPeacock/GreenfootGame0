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
    //World game = getWorld();
    //private int gameWidth = game.getWidth();
    //private int gameHeight = game.getHeight();
    
    public static final int PADDLE_WIDTH = 100;
    private int velocity = 5;
    private GreenfootImage image;
    
    public Paddle()
    {
        image = new GreenfootImage(PADDLE_WIDTH,20);
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
        int halfWidth = PADDLE_WIDTH / 2;
        
        if(Greenfoot.isKeyDown("left") && x > halfWidth)
        {
            x -= velocity;
        }
        
        if(Greenfoot.isKeyDown("right") && x < getWorld().getWidth() -halfWidth)
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
