public abstract class Armor extends Item implements DefenseCommands
{
    public boolean blocked(int attack)
    {
        if(attack < 10)
        {
            return true;
        }
        return false;
    }
}
