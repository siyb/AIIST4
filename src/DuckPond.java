import java.util.ArrayList;

public class DuckPond {
    // this is a data structure resembling a list, it has methods to add / remove / count / etc items
    public ArrayList<Duck> ducks = new ArrayList<>();

    /**
     * Adds a duck to the pond
     * @param duck the Duck
     */
    public void addDuck(Duck duck) {
        // internally, we are adding the duck to the ArrayList ducks, but from the outside it seems like DuckPond
        // is managing ducks on its own
        ducks.add(duck);
    }
}
