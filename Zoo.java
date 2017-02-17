public class Zoo
{
    private Pet[] theZoo;
    public Zoo()
    {
        theZoo = new Pet[10];
        for (int i=0; i<5; i++)
        {
            theZoo[i] = new LoudZombieDire();
        }
        for (int a=5; a<10; a++)
        {
            theZoo[a] = new DireWolf();
        }
    }
    public Zoo(int numAnimals)
    {
        theZoo = new Pet[numAnimals];
        for (int i=0; i<numAnimals; i++)
        {
            if(Math.random()<0.5)
            {
                theZoo[i] = new LoudZombieDire();
            }
            else
            {
                theZoo[i] = new DireWolf();
            }
        }
    }
    public void soundOff()
    {
        for (int i=0; i<theZoo.length; i++)
        {
            System.out.println("Slot " + i + ": " + theZoo[i].getName());
        }
    }
    public void countNumLegs(Pet p1,Pet p2,Pet p3)
    {
        System.out.println("Pet #1: " + p1.numLegs());
        System.out.println("Pet #2: " +p2.numLegs());
        System.out.println("Pet #3: " +p3.numLegs());
    }
}
