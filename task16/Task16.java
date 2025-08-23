package task16;

// Interface definition
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Gorilla class implementing Animal
class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla...");
            return true;
        } else {
            System.out.println("Not feeding time.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Attempting to pet the gorilla...");
    }
}

// Optional: Main class to test Gorilla behavior
public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
