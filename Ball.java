import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Move the ball around the screen using the 
 * inbuilt tutrle graphics
 * 
 * @author Derek Peacock 
 * @version 0
 */
public class Ball extends Actor
{
    private int velocity = 5;
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        turn(3);
    }
}
