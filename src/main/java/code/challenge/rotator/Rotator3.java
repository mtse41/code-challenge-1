package code.challenge.rotator;

public class Rotator3 implements IRotator {
    public Object[] rotate(Object[] objects, int position) {
        final int arrSize = objects.length;
        Object[] rotatedArr = new Object[arrSize];

        for (int index = 0; index < arrSize; index++) {
            int newIndex = (index + position) < 0
                    ? index + position + arrSize
                    : (index + position) % arrSize;

            if (newIndex < 0) {
                newIndex = arrSize + newIndex;
            }

            rotatedArr[newIndex] = objects[index];
        }

        return rotatedArr;
    }
}
