import java.util.ArrayList;
public abstract class Item implements ItemInterface
{
    private String name;
    private int value;
    private ArrayList stats;
    
    
    public String getName()
    {
        return name;
    }
    public ArrayList getStats()
    {
        return stats;
    }
}
