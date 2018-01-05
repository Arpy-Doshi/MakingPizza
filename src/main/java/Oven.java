public class Oven
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    BakedFood bakedFood;

    void powerOn()
    {
        System.out.println("Oven is powered on ");
    }

    void preHeat()
    {
        System.out.println("Oven is pre-heated ");
    }

    void putIn(BakableFood bakableFood)
    {
        System.out.println("Ready Base is put in Oven");
        bakedFood = bakableFood.bake();
    }

    void setTemperatue(int temperature)
    {
        System.out.println("Temperature is set at "+temperature+" degree to bake base in the Oven");
    }

    void setTime(int time)
    {
        System.out.println("Time is set to "+time+" seconds to bake base in the Oven");
    }

    void powerOff()
    {
        System.out.println("Oven is powered off ");
    }

    BakedFood takeOut()
    {
        System.out.println("Pizza is ready");
        return bakedFood;
    }



}

