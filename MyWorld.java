import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int speed;
    public int turning;
    public int score;
    public int upCounter;
    private int stepCounter;
    public int timer;
    public int fireCounter;
    public MyWorld()
    {    
        super(600,600, 1); 
        
        this.fireCounter=0;
        
        
        int worldHeight = this.getHeight();
        this.setBackground("pixelMoonBg.png");
        
        
        
        
        Edge e = new Edge();
        Edge e1 = new Edge();
        this.addObject(e,1,worldHeight);
        this.addObject(e1,599,worldHeight);
        
        Score g = new Score();
        this.addObject(g, 35, 25);
        
        Ship s = new Ship();
        this.addObject(s,300,worldHeight-25);
        
        Timer t = new Timer();
        this.addObject(t, 35, 50);
    }
    
    public void act()
    {
        this.stepCounter++;
        int worldWidth = this.getWidth();
        int xRand = Greenfoot.getRandomNumber(worldWidth);
        Asteroid a = new Asteroid();
        Asteroid a2 = new Asteroid();
        
        if(this.stepCounter % 50 == 0)
        {
            this.timer+=1;
        }
        if(this.stepCounter % 144 == 0)
        {
            this.addObject(a, xRand, 0);
        }
        if(this.stepCounter % 150 == 0)
        {
            this.addObject(a2, xRand, 5);
        }
        this.showText("" + score, 65, 25);
        this.showText("" + timer, 65, 50);
    }
}