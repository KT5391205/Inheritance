import java.lang.Math;
public abstract class Weapon extends Item implements WeaponInterface
{
    private int damage;
    private boolean ranged;
    
    public int attack()
    {
        return (int)(Math.random() * 20) + 1;
    }
    
    public int damage()
    {
        return (int)(Math.random() * damage) + 1;
    }
    
    public void makeAttack(Character target)
    {
        if(attack() > target.getAc())
        {
            target.changeHp(-1 * damage());
        }
    }
    
    public boolean parry(int attack)
    {
        if(attack() > attack)
        {
            return true;
        }
        return false;
    }
}
