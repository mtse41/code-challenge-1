package code.challenge.rotator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotator4 implements IRotator {
    public Object[] rotate(Object[] objects, int distance) {
        List<Object> dataList = Arrays.asList(objects);
        Collections.rotate(dataList, distance);
        return dataList.toArray(new Object[dataList.size()]);
    }


    public Object[] rotateAlt(Object[] objects, int distance) {
        Collections.rotate(Arrays.asList(objects), distance);
        return objects;
    }
}
