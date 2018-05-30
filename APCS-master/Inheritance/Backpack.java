import java.util.ArrayList;
public class Backpack implements BackpackInterface
{
    private ArrayList<Item> backpack;

    public Backpack()
    {
        backpack = new ArrayList<Item>();
    }

    public boolean storeItem(Item item)
    {
        backpack.add(item);
        return true;
    }
    
    public boolean useItem(Item item)
    {
        for (int i=0; i<backpack.size(); i++)
        {
            if(backpack.get(i)==item)
            {
                backpack.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Item> getInventory()
    {
        return backpack;
    }
    
    public int countItems()
    {
        int count = 0;
        for (Item item : backpack){
            count++;
        }
        return count;
    }
}
