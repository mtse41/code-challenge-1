package code.challenge.rotator;

public class Rotator6 implements IRotator {
    public Object[] rotate(Object[] objects, int distance) {
        if (distance == 0 || distance % objects.length == 0) {
            return objects;
        }

        if (distance < 0) {
            distance = objects.length - (-distance % objects.length);
        }

        Object[] rotatedArray = new Object[objects.length];
        for (int i = 0; i < objects.length; i++) {
            rotatedArray[(i + distance) % objects.length] = objects[i];
        }
        return rotatedArray;
    }
}
