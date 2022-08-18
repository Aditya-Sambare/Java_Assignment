package day8_CoreJava_Abstraction;

import java.util.Random;

/**
 * 2)Create an abstraet elass Instrument which has the abstract function play.
 * Create three more subclasses from Instrument which are Piano, Flute, Guitar.
 * Override the play method inside all three classes printing a message. "Piano is playing
 * tan tan tan tan " for Piano class "Flute is playing toot toot toot toot" for Flute class
 * "Guitar is playing tin tin tin" for Guitar class
 * You must not allow the user to declare an object of Instrument class. Create an array of
 * Instruments. Assign different types of instrument to Instrument reference. Check for
 * the polymorphic behavior of the play method. Use the instanceof operator to print
 * which object stored at which index of instrument array.
 */
abstract class Instrument{
    abstract void play();
}
class Piano extends Instrument{
    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan tan ");
    }
}
class Flute extends Instrument{
    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument{
    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
public class Que2 {
    public static void main(String[] args) {
        Random random = new Random();
        Instrument instrument[] = new Instrument[10];
        for (int i = 0; i < 10; i++) {
            int random_int = random.nextInt(3);
            switch (random_int) {
                case 0:
                    instrument[i] = new Piano();
                    break;
                case 1:
                    instrument[i] = new Flute();
                    break;
                case 2:
                    instrument[i] = new Guitar();
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("---------------------------------------INSTRUMENTS---------------------------------------------");

            if (instrument[i] instanceof Piano) {
                System.out.println("the instrument at " + i + " index is piano");
                instrument[i].play();
            }
            if (instrument[i] instanceof Flute) {
                System.out.println("the instrument at " + i + " index is flute");
                instrument[i].play();
            }
            if (instrument[i] instanceof Guitar) {
                System.out.println("the instrument at " + i + " index is guitar");
                instrument[i].play();
            }
        }
    }
}
/* output is
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 0 index is guitar
Guitar is playing tin tin tin
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 1 index is flute
Flute is playing toot toot toot toot
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 2 index is flute
Flute is playing toot toot toot toot
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 3 index is piano
Piano is playing tan tan tan tan
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 4 index is piano
Piano is playing tan tan tan tan
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 5 index is piano
Piano is playing tan tan tan tan
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 6 index is piano
Piano is playing tan tan tan tan
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 7 index is flute
Flute is playing toot toot toot toot
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 8 index is piano
Piano is playing tan tan tan tan
---------------------------------------INSTRUMENTS---------------------------------------------
the instrument at 9 index is guitar
Guitar is playing tin tin tin

Process finished with exit code 0

 */