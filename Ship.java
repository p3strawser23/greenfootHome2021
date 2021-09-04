import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    public int speed;
    public int turning;
    public int score;
    public int upCounter;
    private int stepCounter;
    public int timer;
    public int X;
    public int Y;
    public int fireCounter;
    public int stepFireCounter;
    public Ship()
    {
        GreenfootImage gfi = new GreenfootImage("asteroidsShip.png");
        gfi.scale( 40, 48 );
        this.setImage( gfi );
        this.speed=3;
        this.turning=0;
        this.score=0;
        this.upCounter=0;
        this.timer=0;
        this.fireCounter=0; 
        this.stepFireCounter=0;
    }
    public void act()
    {
        int turningRand = Greenfoot.getRandomNumber(360);
        int shipX = getX();
        int shipY = getY();
        this.stepFireCounter+=1;
        World w = this.getWorld();
        w.showText("" + score, 65, 25);
        if(Greenfoot.isKeyDown("left") == true)
        {
            GreenfootImage gfi = new GreenfootImage("asteroidsShip.png");
            gfi.scale( 40, 48 );
            gfi.rotate(180);
            this.setImage( gfi );
            this.setRotation(180);
            this.move(speed);
        }
        else if(Greenfoot.isKeyDown("right") == true)
        {
            GreenfootImage gfi = new GreenfootImage("asteroidsShip.png");
            gfi.scale( 40, 48 );
            gfi.rotate(0);
            this.setImage( gfi );
            this.setRotation(0);
            this.move(speed);
        }
        if( Greenfoot.isKeyDown("space") == true && fireCounter==0)
        {
            getWorld().addObject(new Laser(), shipX, shipY);
            fireCounter=1;
        }
        if (this.isTouching(Asteroid.class) == true)
        {
            w.removeObject(this);
            //w.showText("" + score, 80, 25);
            Greenfoot.stop();
        }
        if (this.isTouching(Edge.class) == true)
        {
            if(shipX>300)
            {
                this.setRotation(180);
                this.move(3);
            }
            else
            {
                this.setRotation(0);
                this.move(3);
            }
        }
        if(this.stepFireCounter==50)
        {
            fireCounter=0;
            stepFireCounter=0;
        }
        /*
        if(Greenfoot.isKeyDown("up") == true && upCounter==0)
        {
            this.setRotation(270);
            this.move(30);
            this.upCounter=1;
        }
        else if(upCounter == 1)
        {
            do{
            this.turnTowards(floorX, floorY);
            this.move(3);
            }while(this.isTouching(Floor.class) == false);
        }
        if(Greenfoot.isKeyDown("down") == true)
        {
            this.setRotation(90);
            this.move(speed);
        }
        if (this.isAtEdge() == true) //double equal signs test for equality
        {
            //this.turn(turningRand);
        }
        */
    }
}
