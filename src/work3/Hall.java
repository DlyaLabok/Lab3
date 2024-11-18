package work3;

/**
 * Represents a hall within the playground, with a specified name and area.
 * Implements methods to retrieve and display its area.
 *
 * @author Ivanka Teteruk
 */
public class Hall implements GeneralGetter {
    private String name;
    private int area;

    /**
     * Constructs a hall with a given name and area.
     *
     * @param name the name of the hall
     * @param area the area of the hall
     */
    Hall(String name, int area) {
        this.name = name;
        this.area = area;
    }

    /**
     * Returns the area of the hall.
     *
     * @return the area of the hall
     */
    @Override
    public int getArea() {
        return area;
    }

    /**
     * Prints the name and area of the hall.
     */
    @Override
    public void area() {
        System.out.println("Площа " + name + ": " + area);
    }
}
