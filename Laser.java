import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    public int score;
    public Laser()
    {
        GreenfootImage gfi = new GreenfootImage("pixelLaser.png");
        gfi.scale(34, 32);
        gfi.rotate(90);
        this.setImage( gfi );
        this.score=0;
    }
    public void act()
    {
        this.setRotation(270);
        this.move(5);
        World w = this.getWorld();
        //w.showText("" + score, 65, 25);
        if (this.isTouching(Asteroid.class) == true)
        {
            this.removeTouching(Asteroid.class);
            Ship actor = (Ship) getWorld().getObjects(Ship.class).get(0);
            actor.score += 1;
        }
        else if(this.isAtEdge()==true)
        {
            w.removeObject(this);
        }
    }
}
