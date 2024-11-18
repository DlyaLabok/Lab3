package work3;

/**
 * Main class demonstrating a playground divided into sections for video games and table games.
 * Each section contains rooms and halls, and can calculate the total area it occupies.
 *
 * @author Ivanka Teteruk
 */
public class Main {
    /**
     * Entry point of the program. Creates and organizes sections for video games and table games,
     * each with various rooms and halls. Then calculates and prints the total area of the "TableGames" section.
     *
     */
    public static void main(String[] args) {
        Group videoGames = new Group("Секція кімнат з відеоіграми");
        videoGames.add(new VidGameRoom("VG Кімната 1", 10));
        videoGames.add(new VidGameRoom("VG Кімната 2", 15));
        videoGames.add(new Hall("VG Хол", 20));

        Group tableGames = new Group("Секція кімнат з настільними іграми");
        tableGames.add(new TabGameRoom("ТG Кімната 1", 20));
        tableGames.add(new TabGameRoom("ТG Кімната 2", 25));
        tableGames.add(new Hall("TG Хол", 15));
        tableGames.area();
        tableGames.getArea();
        videoGames.area();
        videoGames.getArea();
    }
}
