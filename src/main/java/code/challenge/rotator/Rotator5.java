package code.challenge.rotator;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Stream;

public class Rotator5 implements IRotator {
    public Object[] rotate(Object[] objects, int distance) {
        return (distance >= 0)
                ? shiftRight(objects, distance)
                : shiftLeft(objects, distance);
    }

    private static Object[] shiftRight(Object[] objects, int distance) {
        ArrayDeque<Object> queue = new ArrayDeque<>(Arrays.asList(objects));

        Stream.of(distance).forEach(x -> queue.addFirst(queue.pollLast()));
        /*
        for (int i = 0; i < position; i++) {
            Object obj = queue.pollLast();
            queue.addFirst(queue.pollLast());
        }
        */
        return queue.toArray();
    }

    private static Object[] shiftLeft(Object[] objects, int distance) {
        ArrayDeque<Object> queue = new ArrayDeque<>(Arrays.asList(objects));
        distance = Math.abs(distance);

        for (int i = 0; i < distance; i++) {
            Object obj = queue.pollFirst();
            queue.addLast(obj);
        }

        return queue.toArray();
    }
}
