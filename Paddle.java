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
    public static final int WIDTH = 100;
    public static final int HEIGHT = 20;
    
    private World game;
    private int velocity = 5;
    private GreenfootImage image;
    
    /**
     * Create a blue rectangle using a Greenfoot Image
     * 
     */
    public Paddle()
    {
        image = new GreenfootImage(WIDTH, HEIGHT);
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
        game = getWorld();

        movePaddle();
    }
    
    /**
     * This method moves the paddle around in four directions
     * using coordinate positions.  Could use turtle graphics 
     * instead without x,y coordinates.
     */
    public void movePaddle()
    {
        int x = getX(); int y = getY();
        int halfWidth = WIDTH / 2;
        
        if(Greenfoot.isKeyDown("left") && x > halfWidth)
        {
            x -= velocity;
        }
        
        if(Greenfoot.isKeyDown("right") && x < game.getWidth() -halfWidth)
        {
            x += velocity;
        }        
        
        if(Greenfoot.isKeyDown("down") && y < game.getHeight() - velocity)
        {
            y += velocity;
        } 
        
        if(Greenfoot.isKeyDown("up") && y > velocity)
        {
            y -= velocity;
        }
        
        setLocation(x, y);
    }
}
