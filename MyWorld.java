import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() 
    {
        super(600, 400, 1);
        
        Someguy someguy = new Someguy();
        addObject(someguy, 100, 100);
        
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);
        
        
    }
}
