package ru.kolosov.unicorn.bruno.collections;

import java.util.Iterator;

class QueueIterator<T> implements Iterator<T> {

    private QueueValue<T> currentValue;

    public QueueIterator(BrunoQueue collection) {
        currentValue = collection.viewFirst();
    }

    @Override
    public boolean hasNext() {
        return currentValue != null;
    }

    @Override
    public T next() {
        QueueValue<T> result = currentValue;
        currentValue = currentValue.getNextValue();
        return result.getValue();
    }
}
