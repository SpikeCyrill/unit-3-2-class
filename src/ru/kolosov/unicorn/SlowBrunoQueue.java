package ru.kolosov.unicorn;

public class SlowBrunoQueue {

    int[] storage = new int[2];
    int lastIndex = -1;

    public SlowBrunoQueue() {}

    public SlowBrunoQueue(int initialCapacity) {
        storage = new int[initialCapacity];
    }

    public SlowBrunoQueue(int[] array) {
        storage = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            storage[i] = array[i];
        }
        lastIndex = array.length - 1;
    }

    public void add(int value) {

        checkEnlargeCapacity();

        for(int i = lastIndex; i >= 0; i--) {
            storage[i + 1] = storage[i];
        }

        lastIndex++;

        storage[0] = value;
    }

    public void add(int[] values) {

    }

    public int get() {
        if (lastIndex >= 0) {
            int result = storage[lastIndex];
            lastIndex--;
            return result;
        } else {
            return 0;
        }
    }

    private void checkEnlargeCapacity() {
        if (lastIndex == storage.length - 1) {
            int[] newStorage = new int[storage.length * 2];

            for (int i = 0; i < storage.length; i++) {
                newStorage[i] = storage[i];
            }

            storage = newStorage;

        }
    }

}
