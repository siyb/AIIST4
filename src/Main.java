public class Main {
    public static void main(String[] args) {
        DuckPond pond = new DuckPond();
        Duck donald = new Duck("Donald");
        Duck daisy = new Duck("Daisy");

        pond.addDuck(donald);
        pond.addDuck(daisy);

        // this should not work!
        donald.land();

        donald.fly();

        daisy.fly();

        donald.fly();

        donald.land();

        System.out.println(daisy.flying + " " + donald.flying);
    }
}
