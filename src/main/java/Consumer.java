public class Consumer extends Person
{


    public Pizza placeOrder(Chef c)
    {
        /*String toppings[] ={"Cheese","Olives","Jalepano"};
        Pizza pizza=c.cook("Margrita","Thin crust","Medium",toppings);
        */
        PizzaStyle pizzaStyle = new PizzaStyle();


        pizzaStyle.setName("Margrita");
        pizzaStyle.setCrust("Double Cheese");
        pizzaStyle.setSize("Large");


        pizzaStyle.getToppings().add("Cheese");
        pizzaStyle.getToppings().add("Olives");
        pizzaStyle.getToppings().add("Jalepano");
        Pizza pizza = c.cook(pizzaStyle);
        System.out.println(getName()+" has ordered Pizza to "+c.getName()+" which has "+pizzaStyle);

        System.out.println(pizza+"pizzaaa");
        return  pizza;


    }

}
