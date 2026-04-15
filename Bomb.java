import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bomb extends Actor
{
    int speed = -10;
    public void act()
    {
        move(speed);
        if(getX() <= 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            
            if(speed > -25)
            {
                speed = speed - 1;
            }
            resetBomb();
        }
        
        if(isTouching(Someguy.class))
        {
            Actor guy = getOneIntersectingObject(Someguy.class);
            int explodeX = guy.getX();
            int explodeY = guy.getY();
            
            getWorld().removeObject(guy);
            getWorld().removeObject(this);
            
            Skull skull =  new Skull();
            getWorld().addObject(skull, explodeX, explodeY);
            getWorld().showText("GAME OVER!", 300, 200);
            
            Greenfoot.stop();
        }
    }
    
    public void resetBomb()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
        
    }
}
