package code.challenge.rotator;

public class Rotator1 implements IRotator {
    public Object[] rotate(Object[] objects, int n) {
        int arraySize = objects != null ? objects.length : 0;
        if (arraySize == 0 || arraySize == 1) {
            return objects;
        }

        // avoid rotating more than we need on an array of size 5
        // a rotation of 7 == a rotation of 2.
        // and a rotation of 25 == a rotation of 0
        int rotationRequired = n % arraySize;
        if (rotationRequired == 0) {
            return objects;
        }

        //convert a left rotation into a right rotation
        // on our array of 5 again, a left rotation of -4 == a right rotation of 1
        if (rotationRequired < 0) {
            rotationRequired = arraySize + rotationRequired;
        }

        Object[] rotatedArray = new Object[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int rotatedPosition = (i + rotationRequired) % arraySize;
            rotatedArray[rotatedPosition] = objects[i];
        }

        return rotatedArray;
    }
}
