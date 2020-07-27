package code.challenge;

import code.challenge.rotator.IRotator;
import code.challenge.rotator.Rotator1;

public class Main {
    public static void main(String[] args) {
        IRotator rotator = new Rotator1();
        rotator.rotate(new Object[]{1, 2, 3, 4, 5}, -1);
    }
}
