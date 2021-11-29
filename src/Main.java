public class Main {
    public static void main(String[] args) {
        // let's construct our duckpond first
        DuckPond pond = new DuckPond();

        // let's construct our first duck, Donald
        Duck donald = new Duck("Donald");
        // let's also construct a second duck, Daisy
        Duck daisy = new Duck("Daisy");

        // we can now add both Ducks to the pond
        pond.addDuck(donald);
        pond.addDuck(daisy);

        // this should not work, since Donald is not flying yet!
        donald.land();

        // let's have Donald fly around
        donald.fly();

        // let's have Daisy fly around too
        daisy.fly();

        // Donald is already flying, this should do nothing
        donald.fly();

        // let's land Donals
        donald.land();

        // we can now print out the flying states of both, Donald and Daily (we could have done so before as well!)
        System.out.println(daisy.flying + " " + donald.flying);
    }
}
