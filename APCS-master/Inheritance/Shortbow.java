public class Shortbow extends Weapon
{
    private int babyArrows;
    
    public Shortbow(int b)
    {
        setRanged(true);
        babyArrows = b;
    }
    
    public int getBabyArrows()
    {
        return babyArrows;
    }
}
