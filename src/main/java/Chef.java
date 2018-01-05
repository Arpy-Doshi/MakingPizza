public class Chef extends Person
{

    public Pizza cook(PizzaStyle pizzaStyle)
    {

        Flour flour = new Flour();
        flour.setName("flour");

        Water water = new Water();
        water.setType( "Warm water");       // name should not be an attribute for  water class. write only "String water".

        Oil oil = new Oil();
        oil.setName("oil");

        Sauce sauce= new Sauce();
        sauce.name="sauce";

        Dough dough = makeDough(flour, water, oil);

        Base base = makeBase(dough);


        base.setName(pizzaStyle.getName());
        base.setSize(pizzaStyle.getSize());
        base.setWater(water);
        base.setFlour(flour);
        base.setOil(oil);
        base.setCrust(pizzaStyle.getCrust());
        base.setSauce(sauce);

        base.applySauce(sauce);

        for (String topping : pizzaStyle.getToppings())
        {
            base.addTopping(new Topping(topping));
        }

        BakedFood bakedFood = bake(base);
        System.out.println("Pizza is ready");

        Pizza pizza = (Pizza) bakedFood;
        pizza.setName(pizzaStyle.getName());
        return pizza;
    }


    private Dough makeDough(Flour f, Water w, Oil o)
    {
        Dough dough =new Dough();
        System.out.println("Dough is prepared");
        return dough;
    }

    private Base makeBase(Dough dough)
    {
        Base base = new Base();
        System.out.println("Base is prepared");
        return base;
    }

    private BakedFood bake(Base base)
    {


        System.out.println("Base is ready to bake");
        Oven oven = new Oven();
        oven.setName("Oven");
        oven.powerOn();
        oven.preHeat();
        oven.putIn(base);
        oven.setTemperatue(100);
        oven.setTime(10);        //(not a mistake) Everyone has set the temperature and timer before putIn method.. maybe it is a better method.
        oven.powerOff();
        return oven.takeOut();
    }


}
