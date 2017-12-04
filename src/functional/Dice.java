package functional;

import java.util.Random;

/**
 * Created by velvetmoor on 19.10.2017.
 */

public class Dice {
    Random r = new Random();

    int rollD6() {
        return 1 + r.nextInt(6);
    }

    int rollD8() {
        return 1 + r.nextInt(8);
    }

    int rollD10() {
        return 1 + r.nextInt(10);
    }
}
