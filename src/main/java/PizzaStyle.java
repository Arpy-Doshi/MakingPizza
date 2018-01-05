import java.util.ArrayList;
import java.util.List;

public class PizzaStyle
{

    private String name;
    private String crust;
    private String size;
    private List<String> toppings = new ArrayList<String>();

    @Override
    public String toString() {
        return "PizzaStyle{" +
                "name='" + getName() + '\'' +
                ", crust='" + getCrust() + '\'' +
                ", size='" + getSize() + '\'' +
                ", toppings=" + getToppings() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
