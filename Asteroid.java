import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    public Asteroid()
    {
        //int worldWidth = Greenfoot.World.getHeight();
        //int xRand = Greenfoot.getRandomNumber(worldWidth);
        GreenfootImage gfi = new GreenfootImage("asteroid.png");
        gfi.scale( 66   , 44 );
        this.setImage( gfi );
    }
    public void act()
    {
        this.setRotation(90);
        this.move(2);
        if(this.isAtEdge()==true)
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
    }
}
