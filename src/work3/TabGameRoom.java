package work3;

/**
 * Represents a room for table games, with a name and area.
 * Implements methods to retrieve and display its area.
 *
 *@author Ivanka Teteruk
 */
public class TabGameRoom implements GeneralGetter {
    private String name;
    private int area;

    /**
     * Constructs a table game room with a given name and area.
     *
     * @param name the name of the room
     * @param area the area of the room
     */
    TabGameRoom(String name, int area) {
        this.name = name;
        this.area = area;
    }

    /**
     * Returns the area of the room.
     *
     * @return the area of the room
     */
    @Override
    public int getArea() {
        return area;
    }

    /**
     * Prints the name and area of the room.
     */
    @Override
    public void area() {
        System.out.println("Площа " + name + ": " + area);
    }
}
