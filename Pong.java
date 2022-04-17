import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A simple graphics game with a paddle and ball
 * moving around
 * 
 * @author Derek Peacock
 * @version 0
 */
public class Pong extends World
{
    private Ball ball;
    private Paddle paddle;
    
    /**
     * Setup the graphics window and add the ball
     * and the paddle
     */
    public Pong()
    {    
        super(600, 400, 1);
        
        ball = new Ball();
        addObject(ball, 100, 100);

        paddle = new Paddle(80, 10);
        addObject(paddle, 200, 300);
    }
}
