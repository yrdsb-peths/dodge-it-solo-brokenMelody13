import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Someguy extends Actor
{
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 5);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 5);
        }
    }
}
