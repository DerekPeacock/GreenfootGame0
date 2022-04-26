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
    private Sprite brick;
    
    /**
     * Setup the graphics window and add the ball
     * and the paddle
     */
    public Pong()
    {    
        super(600, 400, 1);
        
        ball = new Ball();
        ball.turn(45);
        addObject(ball, 120, 200);

        paddle = new Paddle(80, 10);
        addObject(paddle, 200, 300);
        
        brick = new Sprite(Shapes.Rectangle, 40, 40);
        //brick.setColor(Color.GRAY);
        addObject(brick, 300,300);
        
        MovingSprite animal = new MovingSprite();
        addObject(animal, 300, 100);
    }
}
