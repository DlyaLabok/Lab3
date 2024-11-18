package work3;

/**
 * Interface defining methods for getting and displaying the area of an object.
 * Any class implementing this interface must provide implementations for
 * calculating and printing its area.
 *
 * @author Ivanka Teteruk
 */
public interface GeneralGetter {

    /**
     * Method to print the area of the object.
     */
    void area();

    /**
     * Method to return the area of the object.
     *
     * @return the area of the object
     */
    int getArea();
}
