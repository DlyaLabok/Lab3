package work3;

import java.util.ArrayList;
import java.util.List;

/**
 * A container class that can store multiple objects within an ArrayList,
 * representing sections of a playground with a shared area.
 *
 *@author Ivanka Teteruk
 */
public class Group implements GeneralGetter {
    private String groupName;
    private List<GeneralGetter> things = new ArrayList<>();
    private int sum = 0;

    /**
     * Constructs a group with the specified name.
     *
     * @param sectionName the name of the group or section
     */
    public Group(String sectionName) {
        this.groupName = sectionName;
    }

    /**
     * Adds an item to the group.
     *
     * @param stuff the item to be added
     */
    public void add(GeneralGetter stuff) {
        things.add(stuff);
    }

    /**
     * Removes an item from the group.
     *
     * @param GeneralGetter the item to be removed
     */
    public void remove(GeneralGetter GeneralGetter) {
        things.remove(GeneralGetter);
    }

    /**
     * Calls the area method for each item in the group,
     * displaying their individual areas.
     */
    public void area() {
        for (GeneralGetter i : things) {
            i.area();
        }
    }

    /**
     * Calculates the total area of all items in the group and prints it
     * along with the group's name.
     *
     * @return the total area of the group
     */
    public int getArea() {
        for (GeneralGetter i : things) {
            sum += i.getArea();
        }
        System.out.println("Спільна площа '" + groupName + "': " + sum);
        return sum;
    }
}
