public class Pizza implements BakedFood
{

    private String name;
    private Base base;

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + getName() + '\'' +
                ", base=" + getBase() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
