public class Character
{
    private int hp;
    private int ac;
    public int getAc()
    {
        return ac;
    }
    public int getHp()
    {
        return hp;
    }
    public void setHp(int h)
    {
        hp = h;
    }
    public void changeHp(int h)
    {
        setHp(getHp() + h);
    }
}
