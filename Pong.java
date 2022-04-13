import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pong extends World
{
    private Ball ball;
    private Paddle paddle;
    
    /**
     * Constructor for objects of class Pong
     * 
     */
    public Pong()
    {    
        super(600, 400, 1);
        
        ball = new Ball();
        addObject(ball, 100, 100);

        paddle = new Paddle();
        addObject(paddle, 200, 300);
    }
}
