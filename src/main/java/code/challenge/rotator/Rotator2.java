package code.challenge.rotator;

public class Rotator2 implements IRotator {
    public Object[] rotate(Object[] objects, int n) {
        Object[] newData = new Object[objects.length];
        for (int k = 0; k <= objects.length - 1; k++) {
            newData[k] = objects[k];
        }

        for (int i = 0; i < n; i++) {
            Object last = objects[objects.length - 1];
            for (int j = 0; j < objects.length - 1; j++) {
                objects[j + 1] = newData[j];
            }
            objects[0] = last;
            for (int k = 0; k <= objects.length - 1; k++) {
                newData[k] = objects[k];
            }
        }

        for (int i = 0; i > n; i--) {
            Object first = objects[0];
            for (int j = objects.length - 1; j > 0; j--) {
                objects[j - 1] = newData[j];
            }
            objects[objects.length - 1] = first;
            for (int k = 0; k <= objects.length - 1; k++) {
                newData[k] = objects[k];
            }
        }

        return objects;
    }
}
