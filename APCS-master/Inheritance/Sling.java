public class Sling extends Weapon
{
    private int rocks;
    
    public Sling(int r)
    {
        setRanged(true);
        rocks = r;
    }
    
    public int getRocks()
    {
        return rocks;
    }
}
