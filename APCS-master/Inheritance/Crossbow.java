public class Crossbow extends Weapon
{
    private int bolts;
    
    public Crossbow(int b)
    {
        setRanged(true);
        bolts = b;
    
    }
    
    public int getBolts()
    {
        return bolts;
    }
}
