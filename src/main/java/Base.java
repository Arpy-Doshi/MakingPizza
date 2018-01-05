import java.util.ArrayList;
import java.util.List;

public class Base implements BakableFood
{
    private String name;
    private String size;
    private String crust;
    private Water water;
    private Oil oil;
    private Flour flour;
    private Sauce sauce;
    private List<Topping> toppings = new ArrayList<Topping>();


    public BakedFood bake()
    {
        Pizza pizza = new Pizza();
        pizza.setBase(this);
        return pizza;
    }
    public void applySauce(Sauce sauce)
    {
        System.out.println("Sauce is applied to Base");
    }
    public void addTopping(Topping t)
    {
        getToppings().add(t);
        System.out.println(getToppings() +"array");
        System.out.println(t+" are added on ready Base");

    }

    @Override
    public String toString() {
        return "Base{" +
                "name='" + getName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", water=" + getWater() +
                ", oil=" + getOil() +
                ", flour=" + getFlour() +
                ", sauce=" + getSauce() +
                ", toppings=" + getToppings() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Oil getOil() {
        return oil;
    }

    public void setOil(Oil oil) {
        this.oil = oil;
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
}
