import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Minus1 extends Actor
{
    int speed = -10;
    public void act()
    {
        move(speed);
        
        if(getX() <= 0)
        {
            if(speed > -25)
            {
                speed = speed - 1;
            }
            resetMinus1();
        }
        
        if(isTouching(Someguy.class))
        {
            MyWorld world = (MyWorld)getWorld();
             
            world.decreaseScore();
             
            getWorld().removeObject(this);
        }
    }
    
    public void resetMinus1()
    {
        int randomY = Greenfoot.getRandomNumber(300);
        setLocation(600, randomY);
    }
}
