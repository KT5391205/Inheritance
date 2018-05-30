public class Longbow extends Weapon
{
    private int bigBoyArrows;
    
    public Longbow(int b)
    {
        setRanged(true);
        bigBoyArrows = b;
    }
    
    public int getBigBoyArrows()
    {
        return bigBoyArrows;
    }
}
