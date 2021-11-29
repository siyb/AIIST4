public class Duck {
    /**
     * The name of our duck
     */
    public String name;
    /**
     * A flag indicating if the duck is flying, per default, ducks are not flying when constructed
     */
    public boolean flying = false;

    /**
     * Construct a duck with a name
     * @param name the name
     */
    public Duck(String name) {
        this.name = name;
    }

    /**
     * Quaks the duck's name
     */
    public void quack() {
        System.out.println("Quack! Quack! " + name);
    }

    /**
     * Makes the duck fly if it isn't flying already
     */
    public void fly() {
        if (flying) { // if flying is set to true, this condition will trigger
            return; // calling return here terminates the method at this point
        }
        // make starting noises
        System.out.println("Swooosh! "+ name);
        // we need to remember that our duck is flying now!
        flying = true;
    }

    public void land() {
        // our duck may only land if it is flying
        if (!flying) {
            return; // terminate the method at this point
        }
        // make customary "splash" sound
        System.out.println("Splash! " + name);
        // we are not flying any more, we need to reset the flag
        flying = false;
    }
}
