public class Duck {
    public String name;
    public boolean flying = false;

    public Duck(String name) {
        this.name = name;
    }

    public void quack() {
        System.out.println("Quack! Quack! " + name);
    }

    public void fly() {
        if (flying) {
            return;
        }
        System.out.println("Swooosh! "+ name);
        flying = true;
    }

    public void land() {
        if (!flying) {
            return;
        }
        System.out.println("Splash! " + name);
        flying = false;
    }
}
