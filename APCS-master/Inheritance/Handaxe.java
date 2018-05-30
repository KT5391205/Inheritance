public class Handaxe extends Weapon
{
    private int throwingRange;
    
    public Handaxe(int t)
    {
        throwingRange = t;
    }
    
    public int getRange()
    {
        return throwingRange;
    }
}
