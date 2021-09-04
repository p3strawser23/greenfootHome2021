import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Edge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Edge extends Actor
{
    public int wHeight;
    public Edge()
    {
        World w = this.getWorld();
        GreenfootImage gfi = new GreenfootImage("blackLine.png");
        gfi.scale( 15, 400 );
        this.setImage( gfi );
    }
    public void act()
    {
        
    }
}
