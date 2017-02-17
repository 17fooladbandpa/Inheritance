public class LoudZombieDire extends DireWolf
{
    public String speak()
    {
        return super.speak() + super.speak();
    }
    public int numLegs()
    {
        return 3;
    }
}